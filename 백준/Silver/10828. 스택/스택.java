import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    static int[] stack;
    static int topIndex = -1;

    public static void main(String[] args) throws IOException {
        // Scanner 대신 BufferedReader 사용 (매우 빠름)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        stack = new int[n];
        
        // 출력을 한 번에 모으기 위한 StringBuilder
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            // 공백을 기준으로 문자열을 자름 (push 123 처리)
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    sb.append(pop()).append("\n");
                    break;
                case "size":
                    sb.append(size()).append("\n");
                    break;
                case "empty":
                    sb.append(empty()).append("\n");
                    break;
                case "top":
                    sb.append(top()).append("\n");
                    break;
            }
        }
        
        // 모아둔 결과를 한 번에 출력
        System.out.print(sb);
    }

    public static void push(int item) {
        stack[++topIndex] = item;
    }

    public static int pop() {
        if (topIndex == -1) return -1;
        return stack[topIndex--];
    }

    public static int size() {
        return topIndex + 1;
    }

    public static int empty() {
        return (topIndex == -1) ? 1 : 0;
    }

    public static int top() {
        if (topIndex == -1) return -1;
        return stack[topIndex];
    }
}