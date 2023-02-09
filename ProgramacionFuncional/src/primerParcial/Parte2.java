package primerParcial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Parte2 {
	public static void main(String[] args) {
        String cadena = "Hola Mundo";

        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
            if (Character.isLowerCase(cadena.charAt(i))) {
                contador++;
            }
        }

        System.out.println("La cadena tiene " + contador + " letras minusculas");

        System.out.println("La cadena tiene " + contarMinusculas(cadena) + " letras minusculas");

        
        List<String> listaCadenas = new ArrayList<>();
        
        listaCadenas.add("Hola");
        listaCadenas.add("Mundo");
        listaCadenas.add("Java");
        listaCadenas.add("Kotlin");
        listaCadenas.add("Apple");
        listaCadenas.add("Microsoft");
        
        
        String cadenaConMasMayusculas = listaCadenas.stream()
                .max(
                        Comparator.comparingLong(Parte2::contarMinusculas)
                ).get();
        
        System.out.println(cadenaConMasMayusculas);
        
    }

    public static long contarMinusculas(String cadena){
        return cadena.chars().filter(Character::isLowerCase).count();
    }
}
