package terrenosDataBases;

import java.util.List;

public class Gestor {

    private List<Persona> due;
    private List<Terreno> terr;

    public Gestor(List<Persona> due, List<Terreno> terr) {
        this.due = due;
        this.terr = terr;
    }

    public List<Persona> getDue() {
        return due;
    }

    public void setDue(List<Persona> due) {
        this.due = due;
    }

    public List<Terreno> getTerr() {
        return terr;
    }

    public void setTerr(List<Terreno> terr) {
        this.terr = terr;
    }

    public void mostrardueno() {
    	System.out.println("=================================================================");
    	System.out.println("Bienvenido a la Base de Datos de Terrenos, La Paz, Bolivia.");
    	System.out.println("=================================================================");
        System.out.println("Los dueños y sus terrenos son: ");
        terr.stream().map(Gestor::datosdueno).forEach(System.out::println);
    }

    public static String datosdueno(Terreno t) {
        return t.datosterri() +' '+ t.datosdueno();
    }
}
