package mediator4;

public class Launcher {

	public static void main(String[] args) {
		Whatsapp whatsapp = new Whatsapp();
		
		Persona p1 = new Regular(whatsapp);
		p1.setNombre("Sara Biyin");
		
		Persona p2 = new Regular(whatsapp);
		p2.setNombre("AuronPlay");
		
		Persona p3 = new Grupal(whatsapp);
		Persona p4 = new Grupal(whatsapp);
		Persona p5 = new Grupal(whatsapp);
		Persona p6 = new Grupal(whatsapp);
		Persona p7 = new Grupal(whatsapp);
		Persona p8 = new Grupal(whatsapp);
		Persona p9 = new Grupal(whatsapp);
		Persona p10 = new Grupal(whatsapp);

		p3.setNombre("ZellenDust");
		p4.setNombre("Rubius");
		p5.setNombre("Xokas");
		p6.setNombre("Jordi Wild");
		p7.setNombre("Vegetta777");
		p8.setNombre("WillyRex");
		p9.setNombre("Luzu");
		p10.setNombre("Mangel");
		
		whatsapp.addToChat(p10).addToChat(p9).addToChat(p8).addToChat(p7).addToChat(p6).addToChat(p5).addToChat(p4).addToChat(p3).addToChat(p2).addToChat(p1);
		
		p1.send("Sale stream");
		p10.send("Karmaland 5 :D");


	}

}
