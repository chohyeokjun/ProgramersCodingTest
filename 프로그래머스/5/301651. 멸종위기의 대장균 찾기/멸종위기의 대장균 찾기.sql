-- 코드를 작성해주세요
WITH RECURSIVE generations as (
    SELECT ID, PARENT_ID, 1 as level
    FROM ECOLI_DATA
    WHERE PARENT_ID is null
    
    UNION ALL
    
    SELECT c.ID, c.PARENT_ID, g.level + 1
    FROM ECOLI_DATA c JOIN generations g ON c.PARENT_ID = g.ID
)
SELECT count(*) as COUNT, g.level as GENERATION
FROM generations g left join generations c on c.PARENT_ID = g.ID
WHERE c.ID is null
GROUP BY g.level
ORDER BY g.level;