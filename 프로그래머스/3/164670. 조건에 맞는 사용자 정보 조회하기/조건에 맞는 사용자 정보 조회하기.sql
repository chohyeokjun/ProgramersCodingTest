-- 코드를 입력하세요
select USER_ID, NICKNAME, 전체주소, 전화번호
from(
    SELECT count(BOARD_ID) as boardc, USER_ID, NICKNAME, concat(CITY, " ", STREET_ADDRESS1, " ", STREET_ADDRESS2) as "전체주소", concat(substr(TLNO, 1, 3), "-", substr(TLNO, 4, 4), "-", substr(TLNO, 8, 4)) as "전화번호"
from USED_GOODS_BOARD b join USED_GOODS_USER u on b.WRITER_ID = u.USER_ID
group by USER_ID
) a
where boardc >= 3
order by USER_ID desc 
