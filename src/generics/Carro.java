/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

/**
 *
 * @author alan.menezes
 */
abstract class Carro<T> {
    
    private T modelo;
    private T marca;

    public Carro(T modelo, T marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public T getModelo() {
        return modelo;
    }

    public void setModelo(T modelo) {
        this.modelo = modelo;
    }

    public T getMarca() {
        return marca;
    }

    public void setMarca(T marca) {
        this.marca = marca;
    }
    
    public void acelerar() {
        System.out.println("Carro acelerando!");
    }
    
    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
    
}
