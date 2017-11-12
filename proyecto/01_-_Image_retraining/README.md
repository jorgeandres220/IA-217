# TensorFlow: Image retraining

### Conclusiones
* Puesto que entrenar un modelo puede tomar semanas, una opción es usar un modelo ya entrenado con pesos modificados para las nuevas clases que se desean introducir. Aunque no da los mismos resultados, las salidas son lo suficientemente efectivas.
* Se ocupan al menos 100 fotos de cada clase del entrenamiento para tener suficientes datos de entrada.
* Se debe realizar un "bottleneck" o filtro que tira como output valores lo suficientemente buenos y equipados como para ser usados como entradas en el clasificador.
* Como estándar, este entrenamiento está compuesto por 4000 pasos y cada uno toma como entrada diez imágenes aleatorias.
* TensorBoard permite visualizar los resultados del entrenamiento de forma gráfica.
* Aunque correr los scripts sí se puede llevar su tiempo y puede tomar hasta más de 30 minutos correr el principal, si se compara con la cantidad de tiempo que tomaría entrenar a la red desde cero, es muy poco tiempo para lo que logra hacer.
* Existe la posibilidad de entrenar un modelo orientado a dispositivos móviles que ofrece más velocidad pero con el costo de imágenes más pequeñas y menos precisión.
* Algunos comandos del tutorial tuvieron que modificarse un poco para poder correr el tutorial de forma exitosa.

### Usos en el mundo real
* Aplicaciones que se limiten a reconocer únicamente objetos de clases limitadas (por ejemplo: únicamente materiales reciclables) pueden utilizar los scripts de entrenamiento rápido y usar como entrada solamente las clases necesarias (por ejemplo: envases de vidrio, botellas de plástico, etc).

### Screenshots
##### Resultados en TensorBoard del ejemplo de las flores
![alt text](http://image.ibb.co/dEVgqw/Screen_Shot_2017_11_07_at_2_26_39_PM.png)
![alt text](http://image.ibb.co/jiCuAw/Screen_Shot_2017_11_07_at_2_46_15_PM.png)
![alt text](http://image.ibb.co/mxgAiG/Screen_Shot_2017_11_07_at_2_46_26_PM.png)
![alt text](https://img2.brain3.photobox.com/20493901747d8960a5b4972443bb00ab7ae0020b0d9857ef08314ef922039540bd6383c9.jpg)

##### Resultados del entrenamiento del modelo móvil
![alt text](http://image.ibb.co/d1h5oG/Screen_Shot_2017_11_11_at_6_49_48_PM.png)
![alt text](http://image.ibb.co/ipaEhb/Screen_Shot_2017_11_11_at_6_50_02_PM.png)