## Part 1: Test it with SQL
id int
employer varchar(255)
name varchar(255)
skills varchar(255)

## Part 2: Test it with SQL
SELECT *
FROM employers
WHERE employer.location = St_Louis


## Part 3: Test it with SQL
DROP TABLE job


## Part 4: Test it with SQL
SELECT *
FROM skill
INNER JOIN job_skill ON skill.id=job_skill.skill_id
WHERE jobs_id IS NOT NULL
ORDER BY skill.name ASC;