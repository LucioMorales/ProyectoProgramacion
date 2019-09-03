.headers on

SELECT 
	H.DNI,
	A.NUMERO,
        A.CANTPERS,
	R.TIEMPO,
        A.PREXNOC * R.TIEMPO AS TOTAL

FROM	
	HUESPED H,
	HABITACION A,
	RESERVA R
WHERE
	R.NUMERO = A.NUMERO AND
	R.DNI = H.DNI
;

.quit

SELECT 
	A.NUMERO
FROM	
	HABITACION A
WHERE
	NOT EXISTS(
            SELECT NUMERO 
            FROM RESERVA R 
            WHERE A.NUMERO = R.NUMERO) AND 
        A.CANTPERS = 2  
                                        

;

.quit


SELECT 
        *
FROM 
        HABITACION
WHERE
        CANTPERS = 2
;

.quit

SELECT 
	H.NOMBRE,
	A.NUMERO,
	R.TIEMPO
FROM	
	HUESPED H,
	HABITACION A,
	RESERVA R
WHERE
	R.NUMERO = A.NUMERO AND
	R.DNI = H.DNI
;

SELECT 
        USER
FROM	
        USUARIO
WHERE
        USER = 'Lucio' AND 
        PASSWORD = 'ola'
;
