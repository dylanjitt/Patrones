package SegundoParcial;

public class Verifier {
	private Persona2 p;

    public void contador(Persona2 p) {
        int acc = 1;
        String name = p.getNombres();

        for (int i = 0; i < name.length(); i++) {
            name.charAt(i);
            if (name.charAt(i) == ' ') {
                acc++;
            }

        }
        System.out.println("La cantidad de nombres de "+name+" es: " + acc);
        int acc1 = 1;
        String apel = p.getApellidos();

        for (int j = 0; j < apel.length(); j++) {
            apel.charAt(j);
            if (apel.charAt(j) == ' ') {
                acc1++;
            }

        }
        System.out.println("La cantidad de apellidos de "+name+" es: " + acc1);
    }
}
