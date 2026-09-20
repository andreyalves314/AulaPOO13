/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulapoo13;

/**
 *
 * @author andre
 */
public class Cachorro extends Lobo{
    
    @Override
    public void emitirSom(){
        System.out.println("Au au au");
        
    }
    
    public void reagir(String frase){
        if ("Olá".equals(frase) || "Toma comida".equals(frase)){
            System.out.println("Abanar e latir");
        }else{
            System.out.println("Rosnar");
        }
        
    }
    public void reagir(int hora, int min){
        if (hora < 12){
            System.out.println("Abanar");
        }else if(hora >=18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e latir");
        }
        
    }
    
    public void reagir (boolean dono){
        if (dono == true){
            System.out.println("Abanar");
        }else{
            System.out.println("Rosnar e latir");
        }
    }
    
    public void reagir(int idade, float peso){
        if (idade <5) {
            if (peso <10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
            }
        } else {
            if (peso <10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("Ignorar");
            }
        }
    }
    
    // Obs: Assinatura é a quantidade e o tipo de parametros. O NOME NÃO IMPORTA!
    // Dica: digitanto "ifelse" + TAB gera um uma estrutura if/else pronta
    
    
}
