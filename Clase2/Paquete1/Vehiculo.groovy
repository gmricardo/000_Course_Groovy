package Clase2.Paquete1

class Vehiculo {
    String placa
    Integer modelo
    String marca
    Double kilometraje

    Vehiculo (placa, modelo, marca, kilometraje) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.kilometraje = kilometraje
    }

    void girarDerecha (){
        println ("Girando a la derecha")
    }

    void girarIzquierda (){
        println ("Girando a la izquierda")
    }
}