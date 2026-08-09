Pregunta: ¿Por qué usar double y no int para el precio?
Porque en Java el tipo de dato int, solo permite asignarle valor númerico enteros, es decir sin punto ni coma, mientras el double si permite asignar decimales.

¿Que pasa si se declara el precio como int yse le asigna 3.50?
Java inmediatamente me dice que el tipo de dato int no es para almacenar numeros con decimales.

Pregunta: ¿Qué operador use para determinar si aplica el descuento?
Dentro del if use el operador mayor que (>).
¿Qué tipo de dato devuelve ese operador?
Devuelve un tipo de dato boolean.

Pregunta: ¿En qué situación prefieres usar switch en lugar de una cadena de if-else?
Cuando se tienen demasiadas comparaciones.

¿Hay algún caso en este ejercicio donde el switch no seria necesario?
Si, si máximo son 4 categorias, podriamos hacer uso del if-else, sin embargo si hay más categorias, más operaciones, en ese caso si es preferible usar switch.

Pregunta. ¿Qué ocurre si la condición del while nunca se vuelve falsa?
El cilco se vuelve infinito.

¿Cómo lo prevendrías en este caso?
Dándole un límite al bucle, mientras una condición se cumpla