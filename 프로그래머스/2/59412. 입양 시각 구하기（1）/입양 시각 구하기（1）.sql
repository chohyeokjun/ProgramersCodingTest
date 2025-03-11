-- 코드를 입력하세요
SELECT hour(DATETIME) HOUR, count(1)
from ANIMAL_OUTS
where hour(DATETIME) between 9 and 19
group by 1
order by 1
