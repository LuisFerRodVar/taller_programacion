public class Ejercicio2 {
  public static int contarDigitos(int num){
    if(num == 0){
      return 0;
    }
    return 1 + contarDigitos (num / 10);
  }
  public static void main(String[] args) {
    int entrada = Integer.parseInt(args[0]);
    System.out.println(contarDigitos(entrada));
  }
}
