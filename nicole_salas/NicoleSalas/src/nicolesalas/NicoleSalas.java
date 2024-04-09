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
        
        if (i == 1 ) {
            return 1;
        }
        
        return contarDigitos(num/10, i++);
    }
    
    public static void main(String[] args) {

        System.out.println(contarDigitos(1223, 0));
    }
    
}
