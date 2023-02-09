package terrenosDataBases;

import java.util.List;

public class Launch {
    public static void main(String[] args) {
        // Nombre Apellido Edad Ubicacion
        Persona p = new Persona("Messi", "Ronaldo", 56,69696969, "Irpavi, Av.Circunvalacion, C/13, Nro 34");
        // dueño base altura desc. terreno vegetacion ubicacionterreno
        Terreno t = new Terreno(p, 12, 12, "Suelo rocoso", "Casi Nada", "Irpavi 2, Av.Aruntaya, C/D , Nro 123");

        Persona p1 = new Persona("Mbappe", "Rataldo", 24,64206252, "Achumani, Av.Strongest, C/36, Nro 12");
        Terreno t1 = new Terreno(p1, 21, 11, "Suelo tierroso", "Mucha", "Irpavi 2, Av.Aruntaya, C/5, Nro 89");

        Persona p2 = new Persona("Haaland", "GOATaldo", 21,61644356, "Irpavi, Av.Circunvalacion C/3, Nro 65");
        Terreno t2 = new Terreno(p2, 24, 45, "Suelo fertil", "Moderada",
                "Achumani, Av. The Strongest, C/53 A, Nro 3123");

        Persona p3 = new Persona("Vinicius", "Goes", 90,77755774, "Irpavi 2, Av.Aruntaya, C/E Nro 3");
        Terreno t3 = new Terreno(p3, 34, 7, "Suelo tierroso", "Casi Nada", "Achumani, Av.Strongest, C/12, Nro 76");

        Persona p4 = new Persona("Mohamed", "Mane", 67,62458032, "Irpavi, Av.Circunvalacion, C/13 Nro 67");
        Terreno t4 = new Terreno(p4, 34, 7, "Suelo rocoso", "Mucha", "Irpavi, Av.Circunvalacion, C/1, Nro 50");

        Gestor g = new Gestor(List.of(p, p1, p2, p3, p4), List.of(t, t1, t2, t3, t4));
        //g.mostrardueno();
        
        Persona pp = new Persona("Daniel Alejandro", "Perez Hernandez", 35, 78898978, "Irpavi 2");
        Terreno tt = new Terreno(pp, 25, 30, "suelo rocoso", "abundante", "Irpavi 2, av. circunavalacion, Calle D, nro 356.");
        
        Gestor gg = new Gestor(List.of(pp), List.of(tt));
        
        gg.mostrardueno();

    }
}
