class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[][] arr1BlockState = new int[n][n];
        int[][] arr2BlockState = new int[n][n];
        int[][] result = new int[n][n];
        
        arr1BlockState = calcBlock(arr1, arr1BlockState);
        arr2BlockState = calcBlock(arr2, arr2BlockState);
        
        arr1BlockState = reverseBlock(arr1BlockState);
        arr2BlockState = reverseBlock(arr2BlockState);
      
        result = overlapBlock(arr1BlockState,arr2BlockState);
        
        return changeWord(result);
    }
    
    private int[][] calcBlock(int[] arr, int[][] blockState) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int blockNum = arr[i]; // 9
            for(int j = n - 1; j >= 0; j--) {
               int pow = (int) Math.pow(2, j); // 8
               if(blockNum >= pow) {
                   blockNum -= pow;
                   blockState[i][j] = 1;
               } else {
                   blockState[i][j] = 0;
               }
               if(blockNum < 0) break;
            }
        }
        return blockState;
    }
    
    private int[][] reverseBlock(int[][] blockState) {
        int n = blockState.length;
        
        for(int i = 0; i < n; i++) {
            int start = 0;
            int end = blockState[i].length - 1;
        
            while(start < end) {
                int temp = blockState[i][start];
                blockState[i][start] = blockState[i][end];
                blockState[i][end] = temp;
                start++;
                end--;
            }
        }
        return blockState;
    }
    private int[][] overlapBlock(int[][] blockState1, int[][] blockState2) {
        int n = blockState1.length;
        int[][] result = new int[n][n];
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(blockState1[i][j] == 0 && blockState2[i][j] == 0) continue;
                result[i][j] = 1;
            }
        }
        return result;
    }
    private String[] changeWord(int[][] blockState) {
        int n = blockState.length;
        String[] result = new String[n];
        for(int i = 0; i < n; i++) {
            result[i] = "";
            for(int j = 0; j < n; j++) {
                if(blockState[i][j] == 1) {
                    result[i] += "#";
                } else {
                    result[i] += " ";
                }
            }
        }
        return result;
    }
}