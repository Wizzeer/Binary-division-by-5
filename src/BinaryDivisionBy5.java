import java.util.Scanner;

class BinaryDivisionBy5 {
  public static void main(String[] args) {
    String userInput;
		Scanner sc = new Scanner(System.in);

		System.out.print("Podaj liczb� binarn�: ");
		userInput = sc.nextLine();
    int decimal=Integer.parseInt(userInput, 2);
    if(decimal%5==0){
      System.out.print("Liczba w posatci dziesi�tnej wynosi "+decimal+" i jest podzielna przez 5");
    }
    else{
      System.out.print("Liczba w posatci dziesi�tnej wynosi "+decimal+" i NIE jest podzielna przez 5");
    }
  }
}