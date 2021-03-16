-- https://habr.com/ru/post/181033/
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS department;

CREATE TABLE department
(
    id   INTEGER PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE employee
(
    id            INTEGER PRIMARY KEY,
    department_id INTEGER,
    chief_id      INTEGER,
    name          VARCHAR(100),
    salary        INTEGER,
    FOREIGN KEY (department_id) REFERENCES department (id) ON DELETE CASCADE,
    FOREIGN KEY (chief_id) REFERENCES employee (id) ON DELETE CASCADE
);

INSERT INTO department (id, name)
VALUES (1, 'разработка'),
       (2, 'продажи');

INSERT INTO employee (id, department_id, chief_id, name, salary)
VALUES (1, 1, 1, 'Alex', 3500),
       (2, 2, 1, 'ZAlex', 2000),
       (3, 2, 1, 'Ivan', 2000),
       (4, 1, 1, 'Lena', 3000),
       (5, 2, 1, 'Egor', 4000);

--  Вывести список сотрудников, получающих заработную плату большую чем у непосредственного руководителя
select a.*
from employee a,
     employee b
where b.id = a.chief_id
  and a.salary > b.salary;

--  Вывести список сотрудников, получающих максимальную заработную плату в своем отделе
select a.*
from employee a
where a.salary = (select max(salary)
                  from employee b
                  where b.department_id = a.department_id);

--  Вывести список ID отделов, количество сотрудников в которых не превышает 3 человек
select department_id
from employee
group by department_id
having count(*) <= 3;

--  Вывести список сотрудников, не имеющих назначенного руководителя, работающего в том-же отделе
select a.*
from employee a
         left join employee b on (b.id = a.chief_id and b.department_id = a.department_id)
where b.id is null;

--  Найти список ID отделов с максимальной суммарной зарплатой сотрудников
with sum_salary as
         (select department_id, sum(salary) salary
          from employee
          group by department_id)
select department_id
from sum_salary a
where a.salary = (select max(salary) from sum_salary);
