-- 코드를 입력하세요
SELECT CATEGORY, max(PRICE) MAX_PRICE, PRODUCT_NAME
from 
(select CATEGORY, PRICE, PRODUCT_NAME, rank() over(partition by CATEGORY order by PRICE desc) ranking
 from FOOD_PRODUCT
 where CATEGORY in('과자','국','김치','식용유')
)a
where ranking = 1
group by 1
order by 2 desc