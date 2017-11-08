# Convolutional Neural Networks

### Conclusiones
* El modelo CIFAR-10 clasifica imágenes de 32x32 en diez categorías, siendo lo suficientemente complejo como para utilizar múltiples funcionalidades de Tensorflow pero a la vez lo suficientemente simple como para lograr un 86% de precisión con unas cuantas horas de entrenamiento.
* El modelo cuenta con tres módulos reutilizables: uno de entrada, uno de predicción y uno de entrenamiento.
* El módulo de input carga las imágenes, las corta y las aclara. Para optimizar el funcionamiento, de manera aleatoria les da vuelta y les altera su brillo y contraste.
* El módulo de predicción está compuesto por varias capas para optimizar resultados.
* Finalmente, el módulo de entrenamiento usa un modelo de regresión y una gradiente para actualizar variables.

### Usos en el mundo real
* Este tipo de modelo puede resultar práctico en aplicaciones que necesiten clasificar imágenes en un grupo reducido de clases, puesto que está ideado para solo 10 categorías.
* Aunque los resultados iniciales se obtuvieron con una Tesla K40c, con un poco de tiempo adicional, perfectamente un CPU normal puede obtener resultados respetables tras entrenar al modelo.

### Screenshots
##### Resultados de la operación de training
![alt text](http://image.ibb.co/je42Vw/Screen_Shot_2017_11_07_at_9_20_21_PM.png)