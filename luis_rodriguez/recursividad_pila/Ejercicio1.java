public class Ejercicio1 {
  /**
   * Recursividad de pila
   */
  public static int factorialPila(int num){
    if(num == 1){
      return 1;
    }
    return num * factorialPila(num - 1);
  }
  /**
   * Recursividad de cola
   */
  public static int factorialCola(int resultado, int cola){
    if(cola == 1){
      return resultado;
    }
    return factorialCola(resultado * cola, cola - 1);
  }
  public static int factorialColaAux(int num){
    return factorialCola(1, num);
  }

  public static void main(String[] args) {
    int entrada = Integer.parseInt(args[0]);
    System.out.println(factorialPila(entrada));
    System.out.println(factorialColaAux(entrada));
  }
}
