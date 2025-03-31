-- 코드를 입력하세요
SELECT distinct c.car_id
from CAR_RENTAL_COMPANY_CAR c join CAR_RENTAL_COMPANY_RENTAL_HISTORY h on c.CAR_ID = h.CAR_ID
where CAR_TYPE = '세단' and date_format(start_date, '%m') like '%10%'
order by 1 desc