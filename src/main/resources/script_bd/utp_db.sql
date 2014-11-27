-- para oracle
create table provincia (
  codprovi number,
  nombprovi varchar2(30)
);
insert into provincia values(1,'Cañete');
insert into provincia values(2,'Huaral');
insert into provincia values(3,'Huaura');


create table distrito (
  codprovi number,
  coddistri number,
  nombdistri varchar2(30)
);
insert into distrito values(1,1,'Asia');
insert into distrito values(1,2,'Cerro Azul');
insert into distrito values(1,3,'San luis');

create table empleado (
  codemple number,
  nombemple varchar2(50),
  apepater varchar2(50),
  dni number(8),
  direccion varchar2(100),
  codprovi number,
  coddistri number
);

-- para mysql

create table provincia (
  codprovi integer,
  nombprovi varchar(30)
);
create table distrito (
  codprovi integer,
  coddistri integer,
  nombdistri varchar(30)
);
create table empleado (
  codemple integer NOT NULL AUTO_INCREMENT,
  nombemple varchar(50),
  apepater varchar(50),
  dni integer(8),
  direccion varchar(100),
  codprovi integer,
  coddistri integer,
  PRIMARY KEY (codemple)
);
insert into provincia values(1,'Cañete');
insert into provincia values(2,'Huaral');
insert into provincia values(3,'Huaura');

insert into distrito values(1,1,'Asia');
insert into distrito values(1,2,'Cerro Azul');
insert into distrito values(1,3,'San luis');
