create database face_work;

use face_work;

create table if not exists type_tbl(
    type_id int not null primary key auto_increment,
    type_message varchar(50) not null
);

insert into type_tbl(type_message) values ('Local Citibank Account'),
                                          ('Local Non-Citibank Account'),
                                          ('FPS proxy'),
                                          ('Merchant'),
                                          ('Overseas Citibank Account'),
                                          ('Overseas Non-Citibank Account');

create table if not exists Local_Citibank_Account(
    payee_id int primary key auto_increment,
    payee_type varchar(10),
    payee_name varchar(50),
    account_nickname varchar(50),
    payee_account_number varchar(50),
    purpose_of_transfer enum('save','pay') default null,
    message varchar(200)
)




