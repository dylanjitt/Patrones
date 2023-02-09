package SegundoParcial;

import java.util.List;

public class P3ej9 {

	public static void main(String[] args) {
		List<String> password = List.of("Adsx1233");
		password.stream().map(P3ej9::verifier).forEach(System.out::print);
	}
	
	public static String verifier(String s) {
		if(upperCase(s)&&lowerCaseLetter(s)&&numcheck(s)&&s.length()>=8) {
			return "Contraseña Segura";
		}else {
			return "COntraseña No segura, intente otra";
		}
	}
	
	
	
	public static boolean upperCase(String s) {
		for (int i =0; i<s.length(); i++) {
			if(Character.isUpperCase(s.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
    public static boolean lowerCaseLetter(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean numcheck (String s) {

    	for (int i =0; i<s.length();i++) {
    		char a = s.charAt(i);
    		if (a=='1')return true;
    		else if (a=='2')return true;
    		else if (a=='3')return true;
    		else if (a=='4')return true;
    		else if (a=='5')return true;
    		else if (a=='6')return true;
    		else if (a=='7')return true;
    		else if (a=='8')return true;
    		else if (a=='9')return true;
    		else if (a=='0')return true;

    	}
    	return false;
    }
}
