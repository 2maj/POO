﻿

CREATE TABLE tp1_jdbc.DEPTM
( DEPT   INTEGER CONSTRAINT DEPTM_PK PRIMARY KEY,
  NOMD   VARCHAR(12) NOT NULL CONSTRAINT NOMD_U UNIQUE,
  LIEU   VARCHAR(10)
);
CREATE TABLE tp1_jdbc.EMP
( MATR   INTEGER CONSTRAINT EMP_PK PRIMARY KEY,
  NOME   VARCHAR(10) NOT NULL,
  POSTE  VARCHAR(10),
  SUP    INTEGER 
    CONSTRAINT EMP_REF_SUP REFERENCES tp1_jdbc.EMP DEFERRABLE INITIALLY DEFERRED,
  DATEMB DATE,
  SAL    NUMERIC(10,2),
  COMM   NUMERIC(10,2),
  DEPT   SMALLINT CONSTRAINT DEPTM_REF_EMP REFERENCES tp1_jdbc.DEPTM
);
begin transaction;
INSERT INTO tp1_jdbc.DEPTM VALUES
(10,'FINANCES','PARIS');
INSERT INTO tp1_jdbc.DEPTM VALUES
(20,'RECHERCHES','GRENOBLE');
INSERT INTO tp1_jdbc.DEPTM VALUES
(30,'VENTES','LYON');
INSERT INTO tp1_jdbc.DEPTM VALUES
(40,'FABRICATION','ROUEN');
INSERT INTO tp1_jdbc.EMP VALUES
(7369,'LECLERC','SECRETAIRE',7902,'02/12/80',6400.00,NULL,20);
INSERT INTO tp1_jdbc.EMP VALUES
(7499,'BIRAUD','COMMERCIAL',7698,'20/2/81',12800.00,2400.00,30);
INSERT INTO tp1_jdbc.EMP VALUES
(7521,'BERGER','COMMERCIAL',7698,'22/10/81',10000.00,4000.00,30);
INSERT INTO tp1_jdbc.EMP VALUES
(7566,'MERCIER','DIRECTEUR',7839,'02/3/81',23000.00,NULL,20);
INSERT INTO tp1_jdbc.EMP VALUES
(7654,'MARTIN','COMMERCIAL',7698,'28/5/81',10000.00,11200.00,30);
INSERT INTO tp1_jdbc.EMP VALUES
(7698,'NOIRET','DIRECTEUR',7839,'01/5/81',22800.00,NULL,30);
INSERT INTO tp1_jdbc.EMP VALUES
(7782,'LESAGE','DIRECTEUR',7839,'09/6/81',19600.00,NULL,10);
INSERT INTO tp1_jdbc.EMP VALUES
(7788,'DUBOIS','INGENIEUR',7566,'14/4/85',24000.00,NULL,20);
INSERT INTO tp1_jdbc.EMP VALUES
(7839,'LEROY','PRESIDENT',NULL,'17/11/81',40000.00,NULL,10);
INSERT INTO tp1_jdbc.EMP VALUES
(7844,'BENAIN','COMMERCIAL',7698,'08/5/81',12000.00,0.00,30);
INSERT INTO tp1_jdbc.EMP VALUES
(7876,'CLEMENT','SECRETAIRE',7788,'10/5/85',8800.00,NULL,20);
INSERT INTO tp1_jdbc.EMP VALUES
(7900,'FREMONT','SECRETAIRE',7698,'03/12/81',7600.00,NULL,30);
INSERT INTO tp1_jdbc.EMP VALUES
(7902,'CHATEL','INGENIEUR',7566,'17/12/81',24000.00,NULL,20);
INSERT INTO tp1_jdbc.EMP VALUES
(7934,'VILLARD','SECRETAIRE',7782,'23/8/82',10400.00,NULL,10);
commit;
select * from tp1_jdbc.DEPTM;
select * from tp1_jdbc.EMP;

select avg(SAL) from tp1_jdbc.EMP;


