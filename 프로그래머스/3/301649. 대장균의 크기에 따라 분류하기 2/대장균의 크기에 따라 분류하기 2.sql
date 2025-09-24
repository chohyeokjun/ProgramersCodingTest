-- 코드를 작성해주세요
SELECT ID, 
case total
when 1 then 'CRITICAL'
when 2 then 'HIGH'
when 3 then 'MEDIUM'
when 4 then 'LOW'
end as COLONY_NAME
FROM (
    SELECT ID, ntile(4) over (ORDER BY SIZE_OF_COLONY desc) as total
    FROM ECOLI_DATA
) a
ORDER BY 1