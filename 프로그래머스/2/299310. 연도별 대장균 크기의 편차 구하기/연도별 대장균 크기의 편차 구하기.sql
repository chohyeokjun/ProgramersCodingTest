-- 코드를 작성해주세요
SELECT 
    YEAR(DIFFERENTIATION_DATE) AS YEAR,
    max_size - SIZE_OF_COLONY AS YEAR_DEV,
    ID
FROM (
    SELECT 
        e.ID,
        e.SIZE_OF_COLONY,
        e.DIFFERENTIATION_DATE,
        m.max_size
    FROM ECOLI_DATA e
    JOIN (
        SELECT YEAR(DIFFERENTIATION_DATE) AS year, MAX(SIZE_OF_COLONY) AS max_size
        FROM ECOLI_DATA
        GROUP BY year
    ) m ON YEAR(e.DIFFERENTIATION_DATE) = m.year
) sub
ORDER BY YEAR ASC, YEAR_DEV ASC;
