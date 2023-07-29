create database bankmanagementsystem;

show databases;

use bankmanagementsystem;


create table signup(formNo varchar(20), name varchar(20), father_name varchar(20),  DOB varchar(20),  gender varchar(20),  email varchar(50),  marital_status varchar(20),  address varchar(50),  city varchar(20),  state varchar(20),  pincode varchar(20));    

show tables;

select *  from signup;

create table signupTwo(formNo varchar(20), religion varchar(20), category varchar(20), income varchar(20), educational_qualification varchar(20), occupation varchar(20), pan_number varchar(20), aadhaar_number varchar(20), citizen varchar(20), existing_account varchar(20));

show tables;

select * from signupTwo;


create table signup3(formNo varchar(20), account_type varchar(500), card_num varchar(20), pin_num varchar(20), services_required varchar(1000));

show tables;
DROP table signup3;
create table login(formNo varchar(20), card_num varchar(20), pin_num varchar(20));

select * from signup3;

create table bank(pin_num varchar(10), date varchar(50), type varchar(20), amount varchar(20));
select * from login;
