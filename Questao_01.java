import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   int altura ;
    // imput do valor 
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Informe o tamanho da escada: ");
        altura = input.nextInt();
        }
    //Laço de repetição que cria os espaços vazios 
    // E dentro dele o loop que cria os asteriscos 
    for(int i = 1; i<=altura; i++){
      for(int j = 1; j<=altura-i; j++){
        System.out.print(" ");}
        for(int z = 1; z<= i; z++ ){
          System.out.print("*");
        }
      //Quebra de linha 
        System.out.print("\n");
        }
    }
    }
