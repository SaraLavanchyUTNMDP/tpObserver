# tpObserver
tp2 UTN-MDP 2018 TSSI

1-CICLO DE EJECUCIÓN DE LOS MÉTODOS DEL PATRON UTILIZADO.

 *MÉTODO TRAVEL() DEL OBJETO CAR 
  - Dentro del meétodo travel cambio los valores del estado del auto.
  - SETCHANGED(): Marca que el objeto Observable ha sido cambiado.Se le asigna true al atributo changed.
  - notifyObservers(): si el objeto ha cambiado (changed = true), avisa a los observers y llama al metodo cleanChanged() que vuelve el atributo changed = false.
    - Update(): al ser notificado, el observador llama al método Update() donde se realizan todas las acciones alli especificadas.  


2-QUE ARGUMENTOS SE PASAN AL METODO UPDATE() Y EN QUE MOMENTO SE EJECUTA DICHO MÉTODO.
  *El método Update recibe como parámetros el Observable que lo llamó y el objeto que se le pasó por parametros en el método notifyObservers del Observable. Se ejecuta cuando el observable llama al método NotifyObservers(). 
