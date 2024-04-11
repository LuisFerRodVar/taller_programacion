public class Laberinto {
  public static boolean verificarCasilla(int[][] laberinto, int fila, int columna){
    try {
      int prueba = laberinto[fila][columna];
      return true;
    } catch (Exception e) {
      return false;
    }
  }
  public static boolean tieneSolucion(int fila, int columna, int[][] laberinto, int fsalida, int csalida){
    if(laberinto[fila][columna] == 1){
      return false;
    }
    if((fila == fsalida) && (columna == csalida)){
      return true;
    }
    laberinto[fila][columna] = 1;
    //Verifica hacia la izquierda
    if(verificarCasilla(laberinto, fila, columna - 1) && tieneSolucion(fila, columna - 1, laberinto, fsalida, csalida)){
      return true;
    }
    //Verifica hacia la derecha
    if(verificarCasilla(laberinto, fila, columna + 1) && tieneSolucion(fila, columna + 1, laberinto, fsalida, csalida)){
      return true;
    }
    //Verifica hacia abajo
    if(verificarCasilla(laberinto, fila + 1, columna) && tieneSolucion(fila + 1, columna, laberinto, fsalida, csalida)){
      return true;
    }
    //Verifica hacia arriba
    if(verificarCasilla(laberinto, fila - 1, columna) && tieneSolucion(fila - 1, columna, laberinto, fsalida, csalida)){
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    
    int [][] laberinto1 = {
      {0,1,0},
      {0,1,0},
      {0,1,0}
    };
    boolean prueba = tieneSolucion(0,0,laberinto1,2,2); 
    System.out.println(prueba);
  }
}
