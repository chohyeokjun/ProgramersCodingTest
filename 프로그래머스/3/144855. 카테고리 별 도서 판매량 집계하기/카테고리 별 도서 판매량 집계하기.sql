-- 코드를 입력하세요
SELECT CATEGORY, sum(sales)
from BOOK a join BOOK_SALES b on a.BOOK_ID = b.BOOK_ID
where SALES_DATE like ('%2022-01%')
group by 1
order by 1 