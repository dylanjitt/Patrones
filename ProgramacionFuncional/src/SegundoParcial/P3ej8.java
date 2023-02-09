package SegundoParcial;

import java.text.Normalizer;

public class P3ej8 {

	public static void main(String[] args) {
		 String a = "Adrian Nuñez Ávila";
		 String s = Normalizer.normalize(a, Normalizer.Form.NFD);
		 s =s.replaceAll("[^\\p{ASCII}]","");
		 s =s.replaceAll("[^a-zA-Z0-9]", " ");
		 System.out.println(s);

	}

}
