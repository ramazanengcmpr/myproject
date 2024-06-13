package KtyPackage;

public class KtyMain {

	public static void main(String[] args) {

		System.out.println("-------------------------\nBefore Sort");
		int[] Array=new int[10];
		 for(int i=0;i<Array.length;i++) {
			 Array[i]=(int)(Math.random()*10);
			 System.out.print("Array["+i+"]="+Array[i]+"  ,  ");

		 }
		  System.out.println();
		for(int i=0;i<Array.length;i++) {
			for(int j=i+1;j<Array.length;j++)                           
		    if(Array[i]>Array[j]) {                                     
			 int temp=Array[i];                                         
			 Array[i]=Array[j];                                        
			 Array[j]=temp;                                             
			 		 }
          
				}
		System.out.println("-------------------------\nAfter Sort");
		 for(int i=0;i<Array.length;i++)
	      System.out.print("Array["+i+"]="+Array[i]+"  ,  ");
	}

}

