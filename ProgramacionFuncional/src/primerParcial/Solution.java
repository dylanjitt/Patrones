package primerParcial;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.io.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4Scanner in = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int acc = a;
            for (int j = 0; j<n; j++){
                int x=(int)Math.pow(2,j);
                acc = acc+(x*b);
                System.out.print(acc+" ");  
            }
            System.out.println();
        }
        in.close();

	}
	
	//public static int sumarPares(int numero) {
		//return IntStream.range(1, numero+1).reduce(1, Parte3::multiplicar);
	//}

}
