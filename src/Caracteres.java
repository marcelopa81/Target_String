
public class Caracteres {
	public static boolean palavraDigita(String caracteres) {

		  int quantidadeLetraA = 0;

	        for (int i = 0; i < caracteres.length(); i++) {
	            if (caracteres.charAt(i) == 'a' || caracteres.charAt(i) == 'A') {
	                quantidadeLetraA++;
	            }
	        }
	        System.out.println("A letra 'a' aparece " + quantidadeLetraA + " vezes!");
	        return quantidadeLetraA > 0;
	    }
	
}
