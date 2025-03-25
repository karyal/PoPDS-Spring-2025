create database Results;
use Results;

create table student_results(
	sid int not null primary key,
    full_name varchar(50) not null,
    course varchar(50) not null,
    current_level varchar(50) not null,
    section varchar(50) not null,
    dcn int not null,
    pop int not null
);

show tables;
describe student_results;

-- CRUD
-- Insert
insert into student_results values(1, "Aayush Rai", "BSc SE", "Level-4", "C", 56, 34);

-- Select All
select * from student_results;

-- Search based on sid
select * from student_results where sid=1;

-- Update
update student_results 
	set full_name="Aayush Rai", course="BSc SE", 
		current_level="Level-4", section="C", dcn=65, pop=43
			where sid=1;
    
-- Delete
delete from student_results where sid=1;

