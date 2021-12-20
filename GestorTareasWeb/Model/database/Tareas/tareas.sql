CREATE TABLE ESTADOS 
(
  SID NUMBER(10) 
, ESTADO VARCHAR2(255) 
, CONSTRAINT ESTADOS_PK PRIMARY KEY 
  (
    SID 
  )
  DISABLE 
);

CREATE TABLE NOTAS 
(
  SID NUMBER(10) 
, NOTA VARCHAR2(255) 
, FECHA DATE 
, FK_TEMA NUMBER(10) 
, CONSTRAINT NOTAS_PK PRIMARY KEY 
  (
    SID 
  )
  DISABLE 
);

CREATE TABLE TEMAS 
(
  SID NUMBER(10) 
, TEMA VARCHAR2(255) 
, DESCRIPCION VARCHAR2(255) 
, INCIDENCIAS VARCHAR2(255) 
, FK_ESTADOS NUMBER(10) 
, CONSTRAINT TEMAS_PK PRIMARY KEY 
  (
    SID 
  )
  DISABLE 
);

ALTER TABLE NOTAS
ADD CONSTRAINT NOTAS_TEMAS_FK1 FOREIGN KEY
(
  FK_TEMA 
)
REFERENCES TEMAS
(
  SID 
)
ENABLE;

ALTER TABLE TEMAS
ADD CONSTRAINT TEMAS_ESTADOS_FK1 FOREIGN KEY
(
  FK_ESTADOS 
)
REFERENCES ESTADOS
(
  SID 
)
ENABLE;
