-- 코드를 작성해주세요
SELECT round(avg(if(LENGTH is null, 10, LENGTH)),2) as AVERAGE_LENGTH
FROM FISH_INFO