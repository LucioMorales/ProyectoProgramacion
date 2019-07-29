DROP TABLE HUESPED;
CREATE TABLE HUESPED(
   NOMBRE 	  TEXT,
   DNI            INT PRIMARY KEY   NOT NULL,
   EDAD           INT,
   EMAIL	  TEXT
);

DROP TABLE HABITACION;
CREATE TABLE HABITACION(
   NUMERO 	  INT PRIMARY KEY   NOT NULL,
   PISO           INT,
   PREXNOC        INT,
   CANTPERS       INT
);

DROP TABLE RESERVA;
CREATE TABLE RESERVA(
   NUMERO	  INT     NOT NULL,
   DNI            INT     NOT NULL,
   TIEMPO         TEXTO   NOT NULL
);
