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
