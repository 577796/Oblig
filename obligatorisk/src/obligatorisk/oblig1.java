package obligatorisk;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class oblig1 {

	public static void main(String[] args) {

		int p = 190349;
		int p2 = 267899;
		int p3 = 643799;
		int p4 = 969199;
		int p5 = 1999999;
		int p6 = 2000000;

		String Inntekt = showInputDialog("Årsinntekten min er ");

		double skatt = parseInt(Inntekt);
		double t1 = skatt * 0.17;
		double t2 = skatt * 0.4;
		double t3 = skatt * 0.134;
		double t4 = skatt * 0.164;
		double t5 = skatt * 0.174;

		if (skatt <= p) {
			System.out.print("du skatter  ingenting");
		} else if (skatt <= p2) {
			System.out.print("du skatter " + t1);
		} else if (skatt <= p3) {
			System.out.print("du skatter " + t2);
		} else if (skatt <= p4) {
			System.out.print("du skatter " + t3);
		} else if (skatt <= p5) {
			System.out.print("du skatter " + t4);
		} else if (skatt >= p6) {
			System.out.print("du skatter " + t5);
		}
	}
}