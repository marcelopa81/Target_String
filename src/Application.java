import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		 String texto;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Digite uma string: ");
	        texto = sc.nextLine();

	        if (Caracteres.palavraDigita(texto)) {
	            System.out.println("A string - " + texto + " - possui a letra 'a'!" );
	        } else {
	            System.out.println("A string - " + texto + " - NÃO possui a letra 'a'!");
	        }
	}
}
