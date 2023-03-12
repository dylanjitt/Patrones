package practica6Mediator;

public class Launcher {

	public static void main (String args[]){

        Skype skype = new Skype();

        Persona dev1 =  new DEV(skype);
        dev1.setCi("111").setName("Jose");
        Persona dev2 =  new DEV(skype);
        dev2.setCi("222").setName("Ambar");
        Persona dev3 =  new DEV(skype);
        dev3.setCi("333").setName("Ander");
    

        Persona qa1 = new QA(skype);
        qa1.setCi("444").setName("Hugo");
        Persona qa2 = new QA(skype);
        qa2.setCi("666").setName("Brenda");
        Persona qa3 = new QA(skype);
        qa3.setCi("888").setName("Emanuel");

        Persona sm1 = new SM(skype);
        sm1.setCi("00022").setName("Eynar");
        Persona sm2 = new SM(skype);
        sm2.setCi("00055").setName("Alexia");
        Persona sm3 = new SM(skype);
        sm2.setCi("00056").setName("Rosalia");

        skype.addToTheChat(dev1)
                .addToTheChat(dev2)
                .addToTheChat(dev3)
                .addToTheChat(qa1)
                .addToTheChat(qa2)
                .addToTheChat(qa3)
                .addToTheChat(sm1)
                .addToTheChat(sm2)
                .addToTheChat(sm3);


        qa1.send("Hola a todos los QAS");
        dev3.send("Hola a todos los DEV");
        sm1.send(" >> Hola a Todos <<");


    }

}
