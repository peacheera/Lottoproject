package javabasic1;

public class CountingStrar {

		public static void main(String[] args) {
			
			int e = 7;
			
			 
             for (int i = 0; i <e; i++) { // 
            	int l = Math.abs(e/2-i);
//            	System.out.println(l);
            	 for (int k = 0; k <l; k++) { 
                     System.out.print("0");
                 	}	 
                 
                     for (int j= 0; j < -2*l+e; j++) {
						System.out.print("*");
					}
                 System.out.println();
             }
                 
                 
        }//main
}//class

		

			
			


