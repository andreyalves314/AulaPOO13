/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulapoo13;

/**
 *
 * @author andre
 */
public class AulaPOO13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Mamifero x = new Mamifero();
        Lobo Geralt = new Lobo();
        Cachorro Peludinho = new Cachorro();
       /* x.emitirSom();
        Geralt.emitirSom();
        Peludinho.emitirSom();  */
       Peludinho.reagir(2,12.5f);
       Peludinho.reagir(17, 4.5f);
       Peludinho.setCorPelo("Marrom");
       Geralt.setCorPelo("Branco");
        
    }
    
}
