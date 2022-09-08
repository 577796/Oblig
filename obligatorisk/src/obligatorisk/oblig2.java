package obligatorisk;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class oblig2 {
	public static void main(String[] args) {

		{
			for (int nr = 1; nr <= 10; nr++) {
				String Poengtxt = showInputDialog("Antall poeng ");
				int poeng = 0;
				if (Poengtxt.equals("")) {
					nr--;
				} else
					poeng = parseInt(Poengtxt);

				if (poeng > 100) {
					System.out.println("ugyldig poengsum");
					nr--;
				} else if (poeng >= 90) {
					System.out.println("A");
				} else if ((poeng < 89) && (poeng > 80)) {
					System.out.println("B");
				} else if ((poeng < 79) && (poeng > 60)) {
					System.out.println("C");
				} else if ((poeng < 59) && (poeng > 50)) {
					System.out.println("D");
				} else if ((poeng < 49) && (poeng > 40)) {
					System.out.println("E");
				} else if ((poeng < 39) && (poeng > 0)) {
					System.out.println("F");
				}
			}
		}

	}
}