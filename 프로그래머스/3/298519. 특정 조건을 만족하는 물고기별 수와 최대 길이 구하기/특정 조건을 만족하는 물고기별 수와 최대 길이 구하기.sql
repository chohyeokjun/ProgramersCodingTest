-- 코드를 작성해주세요
SELECT count(*) as FISH_COUNT, max(a.length) MAX_LENGTH, a.FISH_TYPE
FROM (
    SELECT FISH_TYPE, if(LENGTH is null, 10, LENGTH) as length
    FROM FISH_INFO
) a
GROUP BY a.FISH_TYPE
HAVING avg(a.length) >= 33
ORDER BY a.FISH_TYPE