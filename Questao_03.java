import java.util.Scanner;
class Main {
  public static void main(String[] args) {
   String palavra  ;
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Informe uma palavra qualquer: ");
        palavra = input.nextLine();
      }
    int quantidade_anagramas = 0;
    //Utilizei dois loops para navegar pela String procurando letras iguais
    // E a parti da distância entre letras iguais defini o número de anagramas correspondente 
    for (int i=0; i<(palavra.length()-1); i++){
      for(int j = palavra.length() - 1 ; j>0; j-- ){
        if (palavra.charAt(i) == palavra.charAt(j)){
            if(j-i > 1){
            quantidade_anagramas +=2;
          }else if (j-i==1){
            quantidade_anagramas ++;
          }
        }
      }
    }
    System.out.println(quantidade_anagramas);
    }
    }
