# FINALFINAL2024

**EJERCICIO 1**


_Apartado 1_ La respuesta correcta es la B

_Aparatdo 2_ La respuesta correcta es la B

_Apartado 3_ La respuesta correcta es la B

_Apartado 4_ La respuetsa correcta es la B

_Apartado 5_ La respuesta correcta es la B



**EJERCICIO 2**


_Apartado 2_ 

La diferencia es que la tabla Hash unciona como si fuera un mapa donde cada elemento tiene una clave diferente que se utiliza para encontrar su ubicación. Es util cuando necesita acceder rápidamente a los elementos sin importar el orden en el que lo hayas guardado. Hay formas de resolver colisiones cuando dos claves diferentes generan la misma ubicación.

Los arboles lo que hace es que los datos los organiza jerárquicamente como un árbol con un nodo principal y ramificaciones secundarias. Es útil cuando se necesita mantener un orden específico o realizar muchas inserciones o búsquedas en una estructura ordenada. Cada tipo de árbol tiene sus propias reglas y eficiencias para diferentes funciones.

_Apartado 3_

Pila y Cola:

Una pila es una estructura de datos en la que los elementos se insertan y eliminan según el principio del ultimo que entra y el primero que sale.
Es similar a una pila de platos, donde puedes agregar uno encima del otro y solo puedes quitar el último que agregaste.

Una cola, por otro lado, sigue el principio de primero en entrar, primero en salir y funciona como una fila de personas esperando en un banco, donde la primera persona en llegar es la primera en ser atendida

Su uso


La pila se usa cuando necesitas deshacer acciones en orden inverso, cuando quieres volver atrás paso a paso.

La cola se emplea cuando quieras procesar cosas en el mismo orden en que llegaron, como en una lista de espera para atención.


Orden de complejidad computacional:

Tanto en pilas como en colas, agregar o quitar elementos generalmente toma la misma cantidad de tiempo sin importar cuántos elementos hay. Esto se llama O(1), lo que significa que es eficiente sin importar el tamaño de la pila o la cola.


_Apartado 4_

El metodo por ordenacion consiste en crear una matriz ordenada donde se compara el segundo elemento de la matriz con el primero. Se intercambian si el segundo elemento es más pequeño. Luego, coloca el tercer objeto en su posición correcta después de compararlo con el segundo y el primero. 

Iteración 1: Comenzamos con el segundo elemento, 20, como es más pequeño, los intercambiamos.  20, 50, 84, 13, 22, 16, 89, 85.

Iteración 2: El tercer numero es 84, y lo comparamos con 50. Como 84 es más grande, lo dejamos donde está. 20, 50, 84, 13, 22, 16, 89, 85.

Iteración 3: El cuarto numero es 13. Lo comparamos con 84, 50 y 20. Como es el más pequeño, lo movemos a la primera posición. 13, 20, 50, 84, 22, 16, 89, 85.

Iteración 4: Tomamos el quinto elemento, 22, y lo comparamos con los elementos anteriores. Lo dejamos donde está porque es más grande que 13 y más pequeño que 84. 13, 20, 22, 50, 84, 16, 89, 85.

Iteración 5: El sexto elemento, 16, lo comparamos con los elementos anteriores y lo movemos a su posición correcta.  13, 16, 20, 22, 50, 84, 89, 85.

Iteración 6: El séptimo elemento, 89, lo comparamos con los elementos anteriores y lo dejamos donde está porque es más grande que todos los demás.  13, 16, 20, 22, 50, 84, 89, 85.

Iteración 7: Finalmente, el octavo elemento, 85, se compara con los elementos anteriores y se coloca en su posición correcta. 13, 16, 20, 22, 50, 84, 85, 89.





