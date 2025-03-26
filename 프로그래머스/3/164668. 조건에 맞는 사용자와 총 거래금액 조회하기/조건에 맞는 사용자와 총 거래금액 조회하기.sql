-- 코드를 입력하세요
select USER_ID, NICKNAME, TOTAL_SALES
from
(
SELECT USER_ID, NICKNAME, sum(PRICE) TOTAL_SALES
from USED_GOODS_BOARD b join USED_GOODS_USER u on b.WRITER_ID = u.USER_ID
where STATUS = 'DONE'
group by 1
order by 3
) a
where TOTAL_SALES >= 700000