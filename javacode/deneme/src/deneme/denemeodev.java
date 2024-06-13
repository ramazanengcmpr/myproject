package deneme;
import java.util.Scanner;
public class denemeodev {
	
	
	public static void main (String[] args) {
		
		int faktoryel=0,k=0;
		Scanner scan=new Scanner(System.in);
		System.out.println(" k degerini gir");
	    k=scan.nextInt();
		while(k<0) {
			
		System.out.println("pozitif giriniz");	
			
		break;
			
		}
		if(k==1) {
			
			System.out.println(faktoryel);
		}
		else {
			
			
			return faktoryel=faktoryel*k;
			k--;
		}
		
	}
	

	;
	

}
