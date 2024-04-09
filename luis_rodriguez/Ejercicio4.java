public class Ejercicio4 {
  public static int calcularPotencia(int base, int exponente){
    if(exponente == 0){
      return 1;
    }
    return base * calcularPotencia(base, exponente - 1);
  }
  public static void main(String[] args) {
      
  }
}
