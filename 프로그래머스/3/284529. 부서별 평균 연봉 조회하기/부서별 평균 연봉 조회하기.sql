-- 코드를 작성해주세요
SELECT d.DEPT_ID, d.DEPT_NAME_EN, round(avg(e.SAL), 0) as AVG_SAL
FROM HR_DEPARTMENT d join HR_EMPLOYEES e on d.DEPT_ID = e.DEPT_ID
GROUP BY d.DEPT_ID, d.DEPT_NAME_EN
ORDER BY round(avg(e.SAL), 0) desc