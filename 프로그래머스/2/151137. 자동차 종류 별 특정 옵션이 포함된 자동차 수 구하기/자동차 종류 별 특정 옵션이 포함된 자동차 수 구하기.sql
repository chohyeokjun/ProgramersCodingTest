-- 코드를 입력하세요
SELECT CAR_TYPE, count(1) CARS
from CAR_RENTAL_COMPANY_CAR
where OPTIONS like ('%열선시트%') or OPTIONS like ('%통풍시트%') or OPTIONS like ('%가죽시트%')
group by 1
order by 1