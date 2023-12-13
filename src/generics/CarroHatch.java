/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

/**
 *
 * @author alan.menezes
 */
public class CarroHatch extends Carro{
    
    public CarroHatch(String modelo, String marca) {
        super(modelo, marca);
    }

    @Override
    public void acelerar() {
        System.out.println("Carro Hatch acelerando!");
    }
    
    
}
