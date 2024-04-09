/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nicolesalas;

/**
 *
 * @author nicos
 */
public class NicoleSalas {
    
    // 3234

    public static int contarDigitos(int num, int i){
        
        if (num == 0 ) {
            return i;
        }
       
        return contarDigitos(num/10, i+1);
    }
    public static int contarDigitosAux(int num){
      return contarDigitos(num, 0);
    }
    
    public static void main(String[] args) {

        System.out.println(contarDigitos(1223, 0));
    }
    
}
