# FINALFINAL2024

https://github.com/Josseluu/FINALFINAL2024.git

**EJERCICIO 1**


_Apartado 1_    
    La respuesta correcta es la B

_Aparatdo 2_  
    La respuesta correcta es la B

_Apartado 3_  
    La respuesta correcta es la B

_Apartado 4_  
    La respuetsa correcta es la B

_Apartado 5_  
    La respuesta correcta es la B



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


_Apartado 5_

Vamos a igualar A y B 

1024n = 16n^3, y vamos a sacar factor común n a ambos lados quedando, 

1024 = 16n^2, dividimos a ambos lados entre 16 y queda,

64 = n^2, sacamos raiz cuadrada a 64 quedando,

n = raiz cuadrada de 64 que da como resultado final 8
​


**EJERCICIO 3**

a) El código imprimirá 1.

b) La función recursive() intenta realizar el cálculo de la potencia de un número a elevado a la potencia de b. Sin embargo, debido a un error en la lógica, no calcula correctamente la potencia.

Este código emplea recursividad lineal. La función recursive() se llama a sí misma de manera repetida, decrementando o incrementando el valor de b en cada llamada, hasta que b alcance el valor de 0. Sin embargo, la lógica incorrecta hace que b se incremente en lugar de decrementarse, lo que puede llevar a un bucle infinito en este caso específico.


**EJERCICIO 4**


El código implementa recursividad lineal. Cada llamada recursiva reduce el tamaño del problema, dividiendo el número original por 10 hasta que el número se reduce a un solo dígito.

La complejidad computacional de este algoritmo es O(log10(n)), donde n es el valor del número de entrada. Esto se debe a que el número de llamadas recursivas está relacionado con el número de dígitos en el número de entrada. Cada llamada recursiva divide el número por 10, lo que reduce su tamaño en un orden de magnitud logarítmico. Por lo tanto, la complejidad es logarítmica en función del número de dígitos en el número de entrada.
 

**EJERCICIO 5**
 
 
 _Apartado 2_

La decisión de modificar los atributos timeline y tweets dependerá de cómo se implementen y utilicen en el contexto de la aplicación. Si se espera que la línea de tiempo (timeline) de un usuario contenga tanto tweets normales como retweets, entonces sí sería apropiado modificar estos atributos para que puedan contener instancias de la clase Retweet. Esto permitiría que la línea de tiempo refleje todas las acciones relevantes del usuario, incluyendo retweets de otros usuarios.
La modificación podría hacerse cambiando el tipo de datos de timeline y tweets a una lista que pueda contener tanto instancias de Tweet como de Retweet, por ejemplo, List<Tweet>.
