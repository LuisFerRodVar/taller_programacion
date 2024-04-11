public class Ejercicio3 {
  public static int fibonnacci(int num){
    if(num <= 1){
      return num;
    }
    return fibonnacci(num - 1) + fibonnacci(num -2);
  }
  public static void main(String[] args) {
    int entrada = Integer.parseInt(args[0]);
    System.out.println(fibonnacci(entrada));
  }
}
