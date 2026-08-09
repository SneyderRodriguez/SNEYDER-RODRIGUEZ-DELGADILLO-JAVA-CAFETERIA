Pregunta: 
¿Por qué usar double y no int para el precio?
Porque en Java el tipo de dato int, solo permite asignarle valor númerico enteros, es decir sin punto ni coma, mientras el double si permite asignar decimales.

¿Que pasa si se declara el precio como int yse le asigna 3.50?
Java inmediatamente me dice que el tipo de dato int no es para almacenar numeros con decimales.

Pregunta: 
¿Qué operador use para determinar si aplica el descuento?
Dentro del if use el operador mayor que (>).
¿Qué tipo de dato devuelve ese operador?
Devuelve un tipo de dato boolean.

Pregunta: 
¿En qué situación prefieres usar switch en lugar de una cadena de if-else?
Cuando se tienen demasiadas comparaciones.

¿Hay algún caso en este ejercicio donde el switch no seria necesario?
Si, si máximo son 4 categorias, podriamos hacer uso del if-else, sin embargo si hay más categorias, más operaciones, en ese caso si es preferible usar switch.

Pregunta. 
¿Qué ocurre si la condición del while nunca se vuelve falsa?
El cilco se vuelve infinito.

¿Cómo lo prevendrías en este caso?
Dándole un límite al bucle, mientras una condición se cumpla

Pregunta: 
¿Por qué do-while es más apropiado que while aquí? Por que, primero vaida que exista un monto y luego ejecuta la condición.

Describe con tus palabras la diferencia en
el orden de ejecución:

Do while = primero valida que la información exista, luego pregunta y ejecuta.

While = primero pregunta, luego valida y ejecuta

Pregunta: 
¿Por qué usas for aquí y no while? por que el ciclo for es ideal para recorrer posiciones de un array.

¿Qué tiene el for que lo hace más conveniente cuando conoces el número de elementos? Su estructura de declaración

Pregunta:
¿Cuántos errores encontraste? 
Encontre 3

Clasifica cada uno: ¿es un error de compilación o un error
lógico? 2 de compilación y 1 de lógica;

¿Cómo los distingues? Los errores de compilación los detecta el IDE antes de ejecutar/compilar el código, es decir los marca con una pequeña linea roja.
El lógico no genera un error que el IDE pueda detectar, para él esta escrito correctamente.