# Programacion3-Tarea4-SharlotAdrian
Tarea #4 Excepciones, Hilos y archivos 

-Informacion del estudiante y cómo utilizar los programas-

1) Informacion del estudiante:

Nombre: Sharlot Adrián López.

Matrícula: 1000-5786.

Materia: Programación 3.

Descripción de la tarea: Se realizaron 5 ejercicios cuyo objetivo era aplicar los conocimientos adquiridos sobre programación concurrente, manejo de excepciones y manejo de archivos mediante la implementación de programas prácticos en Java.

Tecnologías utilizadas: Java y Visual Studio Code.

2) Cómo utilizar los programas:

-Ejercicio 1: El programa imita la descarga de tres archivos a través del uso de hilos, por lo que basta con ejecutar el programa desde la terminal para ver el proceso simulado de descarga. Los archivos avanzan simultaneamente a través de porcentajes ( desde el 0% al 100%) gracias a un override en el metodo run dentro de la clase HiloArchivo. 

-Ejercicio 2: El programa imita una carrera entre cuatro corredores utilizano los hilos. Al momento de ejecutar el programa desde la terminal, se muestra el estado inicial de cada hilo y luego, su próximo estado. Seguido a esto, se simula el proceso de que cada corredor adelanta 1 metro hasta llegar a los 10, donde este último metro representa la meta. Al final, el primer hilo en llegar es el que primero términa su método run, haciendolo el ganador. Finalmente, el ganador queda evidenciado al ser el primer mensaje de "...Llego a la meta" en la terminal.

-Ejercicio 3: Al ejecutar el programa desde la terminal, aparece un mensaje en pantalla que solicita ingresar una edad. El programa busca evaluar aquellas edades e identificar aquellas menores que 18 a través del uso de una excepcion personalizada, por lo que, si la edad es menor que dicho número, aparecerá un mensaje indicando que la edad debe ser mayor. 

-Ejercicio 4: Al momento de ejecutar el programa desde la terminal, aparece el menú de una calculadora con las opciones de suma, resta, multiplicación, división y de salida para finalizar el programa. Por lo que, el usuario debe elegir una opción, y a continuación, debe digitar dos números. En caso de que escriba un número utilizando letras, el programa le indicará que ingrese un numero válido. Asimismo, si el usuario intenta dividir entre 0, el programa indicará que no es posible la división entre 0 a través de un mensaje de error, y retornará a el usuario al menu.

-Ejercicio 5: Al momento de ejecutar el programa desde la terminal, aparece un menu con las opciones de agregar una actividad, mostrar actividades y de salida del programa, por lo que el usuario debe elegir una opción para continuar. En caso de que la primera opción sea seleccionada, aparecerá un mensaje en pantalla indicando que escriba una actividad, al momento que el usuario presione Enter, está se guardará en un archivo de texto llamado Actividades. De lo contrario, si se elige la opción dos, se podrán visualizar aquellas actividades que han sido registradas. 

