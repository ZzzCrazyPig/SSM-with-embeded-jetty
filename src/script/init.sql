create table account(
	id int primary key,
	account_no varchar(20),
	password char(32),
	name varchar(50);
) engine = innodb default character set = 'utf8';

insert into account(id, account_no, password, name) values(1, 'test1', md5('test1'), '未知');
insert into account(id, account_no, password, name) values(2, 'test2', md5('test2'), '未知');
