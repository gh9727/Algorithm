import math

def solution(price):
    if price < 100000:
        return price
    
    elif price >= 100000 and price < 300000:
        sale = math.ceil(price * 5 / 100)
        return price - sale
    
    elif price >= 300000 and price < 500000:
        sale = math.ceil(price * 10 / 100)
        return price - sale
    
    elif price >= 500000:
        sale = math.ceil(price * 20 / 100)
        return price - sale