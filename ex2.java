public class ex2 {

	public static void main(String[] args) {
		int numero=37;
		String primo=null;
		
		   for (int j = 2; j < numero; j++) {
		       if (numero % j == 0) {
			       primo = "n�o � primo";
			       break;
		       }
		   }		
		if (numero <= 1) {
			primo = "n�o � primo";
		}		   
		
	    if (primo == null) {
			primo ="� primo";
		}
	    System.out.println(primo); 
	}

}
