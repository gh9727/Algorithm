-- 코드를 입력하세요
# 1. 차 종류 SUV 인 차량들 모으기(몇개인지 세기) 
# 2. 모은 차들의 일일 요금 합산하기 
# 3. 1 / 2 및 반올림

SELECT FLOOR(sum(DAILY_FEE) / count(CAR_TYPE)) FROM CAR_RENTAL_COMPANY_CAR
GROUP BY CAR_TYPE HAVING CAR_TYPE = 'SUV';
