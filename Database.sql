create database employee;

use employee;

create table department (
    department_id int primary key,
    department_name varchar(255)
);

create table employee (
    employee_id int primary key,
    employee_name varchar(255),
    salary decimal(10, 2),
    department_id int,
    foreign key (department_id) references department(department_id)
);
select e.employee_id, e.employee_name, d.department_name
from employee e
join department d on e.department_id = d.department_id;

select employee_id, employee_name, salary
from employee
order by salary desc;

select d.department_name, avg(e.salary) as average_salary
from department d
join employee e on d.department_id = e.department_id
group by d.department_name;

