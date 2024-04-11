public class Ejercicio6 {
  public static int contarDigitos(int num){
    if(num == 0){
      return 0;
    }
    return 1 + contarDigitos(num / 10);
  }
  public static int calcularPotencia(int base, int exponente){
    if(exponente == 0){
      return 1;
    }
    return base * calcularPotencia(base, exponente - 1);
  }
  public static int invertirNumero(int numero){
    if(numero == 0){
      return 0;
    }
    return (numero % 10) * (calcularPotencia(10,contarDigitos(numero) - 1)) + invertirNumero(numero / 10);
  }
  public static void main(String[] args) {
    int entrada = Integer.parseInt(args[0]);
    System.out.println(invertirNumero(entrada));
    
  }
}
