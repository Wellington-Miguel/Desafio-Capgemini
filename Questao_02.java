import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   String senha ;
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Informe a senha: ");
        senha = input.nextLine();
      }
      if (senha.length()<6){
        System.out.printf("Faltam %d caractere(s) \n" ,6 - senha.length());
      }else{
        System.out.print("Sua senha já possui o tamanho mínimo! \n");
      }
    }
    }
