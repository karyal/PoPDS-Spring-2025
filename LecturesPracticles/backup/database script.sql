create database mydb;
use mydb;

create table persons(
	pid int not null primary key,
    full_name varchar(50) not null,
    email varchar(50) not null
);

-- Insert Record
insert into persons values(1, 'Raj', 'raj@gmail.com');
insert into persons values(2, 'Ujjwal', 'ujjwal@gmail.com');

-- Select Record
Select * from persons;
SELECT * FROM persons WHERE full_name='Ujjwal';


-- Update Record
update persons set full_name='Raj Sharma' where pid=1;
UPDATE persons SET full_name='Ujjwal Yadav' WHERE pid=2;


-- Delete Record
Delete from persons where pid=1;
