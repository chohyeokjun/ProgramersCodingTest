-- 코드를 입력하세요
SELECT USER_ID, product_id
from ONLINE_SALE
group by USER_ID, product_id
having count(product_id) >= 2
order by 1 , 2 desc