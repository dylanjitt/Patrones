package primerParcial;

import java.util.Scanner;

public class ParcialEj2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A=scan.nextInt();
		int B=scan.nextInt();
		int C=scan.nextInt();
		
		int Max=A;
		
		if (B>Max) {
			Max=B;
		}
		if(C>Max) {
			Max=C;
		}
		
		while((Max%A!=0)||(Max%B!=0)||(Max%C!=0)) {
			Max++;
		}
		System.out.println(Max);
	}

}
