-- 코드를 작성해주세요
SELECT ID, 
case 
when SIZE_OF_COLONY <= 100 then 'LOW'
when SIZE_OF_COLONY > 100 and SIZE_OF_COLONY <= 1000 then 'MEDIUM'
else 'HIGH'
end as SIZE
FROM ECOLI_DATA
ORDER BY 1