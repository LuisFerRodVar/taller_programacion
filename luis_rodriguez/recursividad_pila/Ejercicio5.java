public class Ejercicio5 {
  public static int sumarDigitos(int num){
    if(num == 0){
      return 0;
    }
    return num % 10 + sumarDigitos(num / 10); 
  }
  public static void main(String[] args) {
    int entrada = Integer.parseInt(args[0]);
    System.out.println(sumarDigitos(entrada));
  }
}
