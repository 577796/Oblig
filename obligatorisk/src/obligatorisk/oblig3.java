package obligatorisk;

	import static javax.swing.JOptionPane.*;
	import static java.lang.Integer.*;

	public class oblig3 {
		
		public static void main(String[] args) 
		
		{
			
			String Tall = showInputDialog ("skriv et heltall over null");
			int n = parseInt(Tall);
			int a = n;
			int svar = 1;
			
			while (n>0) {
				svar *=n;
				n--;
				
			}
				System.out.println(a + "! = " + svar);
		}

	}

