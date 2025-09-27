-- 코드를 작성해주세요
SELECT g.avg_score as SCORE, e.EMP_NO, e.EMP_NAME, e.POSITION, e.EMAIL
FROM HR_EMPLOYEES e join (
    SELECT EMP_NO, sum(SCORE) as avg_score
    FROM HR_GRADE
    GROUP BY EMP_NO
) g on e.EMP_NO = g.EMP_NO
ORDER BY g.avg_score desc
limit 1