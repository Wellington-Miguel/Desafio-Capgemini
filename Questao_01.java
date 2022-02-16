import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   int altura ;
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Informe o tamanho da escada: ");
        altura = input.nextInt();
    }
     for(int i = 1; i<=altura; i++){
      for(int j = 1; j<=altura-i; j++){
        System.out.print(" ");}
        for(int z = 1; z<= i; z++ ){
          System.out.print("*");
        }
      
      System.out.print("\n");
    }
}
    }
