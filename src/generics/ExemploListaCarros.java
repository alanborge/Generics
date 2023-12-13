/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alan.menezes
 */
public class ExemploListaCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           // Criar uma lista de carros
        List<Carro> listaCarros = new ArrayList<>();

        // Adicionar carros à lista
        //listaCarros.add("Fusca" + " / " + "Volkswagen");
        listaCarros.add(new CarroEsportivo("Civic", "Honda"));
        listaCarros.add(new CarroSedan("Corolla", "Toyota"));
        listaCarros.add(new CarroHatch("Golf", "Volkswagen"));
        imprimirquelquercoisa(listaCarros);
        imprimir(listaCarros);
        
        // Iterar e exibir os carros na lista
        
    }
     
    public static <T> void imprimirquelquercoisa(List<T> listaCarros){
        System.out.println("Imprime qualquer coisa" + " \n");
        for (Object carro : listaCarros) {
             System.out.println(carro);   
        }
        System.out.println("");
    }
    
    public static void imprimir(List<? extends Carro> listaCarros){
        System.out.println("Imprime metodo especifico da classe Abstrata" + "\n");
        for (Carro carro : listaCarros) {
            carro.acelerar();
            System.out.println(carro);
        }
    }
       
}
