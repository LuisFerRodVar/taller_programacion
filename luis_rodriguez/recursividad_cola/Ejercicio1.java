public class Ejercicio1 {
  public static boolean esPrimoAux(int divisor, int num){

    if((num % divisor) == 0){
      return false;
    }
    if(divisor == num - 1){
      return true;
    }
    return esPrimoAux(divisor + 1, num);
  }
  public static boolean esPrimo(int num){
    return esPrimoAux(2,num); 
  }
  public static void main(String[] args) {
    int entrada = Integer.parseInt(args[0]);
    System.out.println(esPrimo(entrada));
  }
}
