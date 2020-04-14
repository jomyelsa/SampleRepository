package pack1;

import java.io.IOException;

public class Excel4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 Excel3 ob= new Excel3();

		 String a=ob.readData(0,0);
	        System.out.println("Value of a is "+a);
	        
	        String b=ob.readData(0,1);
	        System.out.println("Value of b is "+b); 


	}

}
