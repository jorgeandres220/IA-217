# Vector Representations of Words

### Conclusiones
* El representar las palabras como vectores en lugar de usar IDs poco significativos es más efectivo, puesto que con IDs se necesitan más datos para poder entrenar al modelo. Los VSMs logran hacer esto, representando palabras en vectores continuos y mapeándolas con palabras similares. Los modelos predictivos usan estos modelos.
* Word2vec es un ejemplo de estos modelos. Este utiliza el contexto de la oración para sugerir palabras meta. Esto lo hace usando modelos y fórmulas probabilísticas.
* El modelo skip-gram considera datasets y mapea palabras del contexto con posibles palabras meta. Con cada paso, se actualizan las variables para maximizar la función objetivo, con la ayuda de una gradiente. Así discrimina palabras "noisy" o con alto error de palabras reales.

### Usos en el mundo real
* Cualquier tipo de aplicación que requiera el uso de texto predictivo, tales como aquellos de mensajería instantánea o editores de texto, pueden implementar un modelo skip-gram, puesto que se basa en el contexto para sugerir posibles palabras.

### Screenshots
##### Resultados de la operación de training
![alt text](http://image.ibb.co/j0WLJG/Screen_Shot_2017_11_08_at_7_24_57_PM.png)
![alt text](http://image.ibb.co/hzvVJG/Screen_Shot_2017_11_08_at_7_31_13_PM.png)
![alt text](http://image.ibb.co/kSZUCb/Screen_Shot_2017_11_08_at_7_33_09_PM.png)