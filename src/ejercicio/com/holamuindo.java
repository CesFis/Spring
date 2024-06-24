package ejercicio.com;

public class holamuindo {

	public static void main(String[] args) {
		
		 

		String  h = "Hola mundo";
	
		 int longitud;
		 longitud = h.length();
		 System.out.println(h);
		 
		 System.out.println("");
		 
		 while ( longitud != 0){
			 
			 
		 String ha =  h.substring(longitud - 1, longitud);
		 longitud --;
		 System.out.print(ha);
		 
		 
		 }
		
		 
		 
		 
		 

		
		

	}

}
