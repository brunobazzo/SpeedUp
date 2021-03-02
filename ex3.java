public class ex3 {
	
	   public static void main(String[] args) {
	       int numero = 2147483647;
	       boolean ehPrimo = testePrimo(numero);
	       System.out.println(numero + " é primo? " + ehPrimo);
	
	   }
	
	   private static boolean testePrimo(int numero) {
	       java.math.BigInteger valorB = java.math.BigInteger.valueOf(numero);
	       boolean result = valorB.isProbablePrime(1);
	
	       return result;
	    }
	}