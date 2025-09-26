-- 코드를 작성해주세요
SELECT c.ID
FROM ECOLI_DATA c join ECOLI_DATA p on c.PARENT_ID = p.ID join ECOLI_DATA g on p.PARENT_ID = g.ID
WHERE g.PARENT_ID is null
ORDER BY c.ID