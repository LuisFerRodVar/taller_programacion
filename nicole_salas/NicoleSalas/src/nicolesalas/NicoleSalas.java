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
    
    
    
    
    
    
    public static int calcularPotencia(int base, int expo){
        
        if (expo == 0) {
            return base;
        }
        
        return base * calcularPotencia(base, expo - 1);
    }
    
    public static void main(String[] args) {

        // System.out.println(contarDigitos(1223, 0));
        System.out.println(calcularPotencia(2, 2));
    }
    
}
