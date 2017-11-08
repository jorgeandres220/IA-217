# A Guide to TF Layers: Building a Convolutional Neural Network

### Conclusiones
* Las redes neuronales convolucionales (CNNs) le aplican una serie de filtros a los datos crudos de los pixeles de una imagen para extraer características de alto nivel y así poder clasificarlas.
* La primera capa aplica operaciones aritméticas sobre los pixeles, la segunda capa reduce los resultados del primero usualmente sacando únicamente los valores máximos y la tercera capa realiza la clasificación. Usualmente hay varios módulos compuestos por agrupaciones de la primera y segunda capa para optimizar los resultados.
* Ya existen funciones integradas - como conv2d() - que realizan el trabajo de las capas. Se pueden modificar mediante los parámetros que reciben.
* Lo que el modelo retorna es la clase de la predicción y su probabilidad.
* En el ejemplo, el entrenamiento está compuesto por 20000 pasos, pero esto es completamente parametrizable.

### Usos en el mundo real
* El código puede usarse como punto de partida para redes neuronales de múltiples finalidades, sin la necesidad de progamarlas desde cero, puesto que sus entradas y su entrenamiento es parametrizable.
* El ejemplo explora la identificación de números escritos a mano, un ejercicio que ya habíamos realizado en clase. No obstante, lo realiza de forma más extensa, pues usa un conjunto de datos de entrada más extenso y cuenta con más capas de tres tipos distintos.

### Screenshots
##### Resultados parciales del ejemplo
![alt text](http://image.ibb.co/duvHDG/Screen_Shot_2017_11_07_at_5_23_10_PM.png)
![alt text](http://image.ibb.co/dWfaYG/Screen_Shot_2017_11_07_at_7_00_07_PM.png)

##### Resultados finales del ejemplo
![alt text](http://image.ibb.co/nmiJnb/Screen_Shot_2017_11_07_at_6_58_49_PM.png)