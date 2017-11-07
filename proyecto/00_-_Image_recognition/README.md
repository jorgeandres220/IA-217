# TensorFlow: Image recognition

### Conclusiones
* El código funciona a partir de modelos. Estos modelos los carga en nodos. Aquí, los valores de los pixeles son cargados y escalados, puesto que las funciones del modelo principal ya tienen un estándar que esperan como entrada.
* Los nodos son interpretados como números flotantes y se le aplican operaciones aritméticas para ajustar su tamaño. Una vez que se adaptan todos los nodos, se construye el grafo con los resultados parciales.
* El grafo principal retorna labels con los resultados, que se ordenan por nivel de similitud.

### Usos en el mundo real
* Cualquier tipo de aplicación que utilice reconocimiento de imágenes de cualquiera forma puede hacer uso de este API, que es notablemente fácil de usar. Además está disponible en Python y C++ y el código está lo suficientemente documentado.

### Screenshots
##### Prueba con el ejemplo de la foto del panda
![alt text](https://www.tensorflow.org/images/cropped_panda.jpg)
![alt text](http://image.ibb.co/fixrOG/Screen_Shot_2017_11_07_at_4_42_17_PM.png)

##### Prueba exitosa con la foto de una botella de Coca Cola
![alt text](https://image.ibb.co/fwMBLw/Coke.jpg)
![alt text](https://image.ibb.co/n9DQfw/Screen_Shot_2017_11_05_at_5_58_24_PM.png)

##### Prueba no exitosa con una foto que tiene varios objetos
![alt text](http://image.ibb.co/khf0Hb/Homemade_Dynamite.jpg)
![alt text](http://image.ibb.co/dLLNVw/Screen_Shot_2017_11_07_at_4_47_02_PM.png)