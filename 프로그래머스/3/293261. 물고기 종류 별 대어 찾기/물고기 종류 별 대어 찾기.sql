-- 코드를 작성해주세요
SELECT ID, FISH_NAME, LENGTH
FROM FISH_INFO i 
join FISH_NAME_INFO n on i.FISH_TYPE = n.FISH_TYPE
join (
    SELECT FISH_TYPE, max(LENGTH) as max_length
    FROM FISH_INFO
    GROUP BY FISH_TYPE
) a on i.FISH_TYPE = a.FISH_TYPE and i.LENGTH = a.max_length
ORDER BY ID