-- 코드를 입력하세요
SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
from 
( select FOOD_TYPE, REST_ID, REST_NAME, FAVORITES, rank () over (partition by FOOD_TYPE order by FAVORITES desc) ranking
from REST_INFO
)a
where ranking = 1
order by 1 desc