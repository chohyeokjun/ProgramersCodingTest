-- 코드를 입력하세요
SELECT i.ANIMAL_ID, i.ANIMAL_TYPE, i.NAME
from ANIMAL_INS i join ANIMAL_OUTS o on i.ANIMAL_ID = o.ANIMAL_ID
where SEX_UPON_INTAKE like '%Intact%' and (SEX_UPON_OUTCOME like '%Neutered%' or SEX_UPON_OUTCOME like '%Spayed%')
order by 1

