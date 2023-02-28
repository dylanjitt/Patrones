package practica7;

public class Launcher {

	public static void main(String[] args) {
		Personas p1 = new Personas("Walter White", "00001", 20);
		Personas p2 = new Personas("Skyler White", "00002", 20);
		Personas p3 = new Personas("Jesse Pinkman", "00003", 20);
		Personas p4 = new Personas("Saul Goodman", "00004", 20);
		Personas p5 = new Personas("Kim Wexler", "00005", 20);
		
		Personas p6 = new Personas("Luz Noceda", "00001", 20);
		Personas p7 = new Personas("Willow Park", "00002", 20);
		Personas p8 = new Personas("Gus Porter", "00003", 20);
		Personas p9 = new Personas("Amity Blight", "00004", 20);
		Personas p10 = new Personas("Hunter Caleb", "00005", 20);
		
		Personas p11 = new Personas("Damon Albarn", "00001", 20);
		Personas p12 = new Personas("2-D", "00002", 20);
		Personas p13 = new Personas("Watashi Noodle", "00003", 20);
		Personas p14 = new Personas("Russel Hobbs", "00004", 20);
		Personas p15 = new Personas("Murdoc Niccals", "00005", 20);
		
		Personas p16 = new Personas("Elton John", "00001", 20);
		Personas p17 = new Personas("Miley Cyrus", "00002", 20);
		Personas p18 = new Personas("Stevie Nicks", "00003", 20);
		Personas p19 = new Personas("Britney Spears", "00004", 20);
		Personas p20 = new Personas("Lil Nas X", "00005", 20);
		
		Personas p21 = new Personas("Vince Gilligan", "00001", 20);
		Personas p22 = new Personas("Thomas Bangalter", "00002", 20);
		Personas p23 = new Personas("Guy Manuel de Homem Cristo", "00003", 20);
		Personas p24 = new Personas("Andrew Garfield", "00004", 20);
		Personas p25 = new Personas("Tobey Maguire", "00005", 20);
		
		CareTaker caretaker = new CareTaker();
		Originator originator = new Originator();
		
		Backup b = new Backup("Backup enero");
		
		b.setPersonas(p1);
		b.setPersonas(p2);
		b.setPersonas(p3);
		b.setPersonas(p4);
		b.setPersonas(p5);
		
		originator.setBackup(b);
		caretaker.createRestorePoint(b.getName(), originator.createMemento());
		
		b.setName("Backup febrero");
		b.setPersonas(p6);
		b.setPersonas(p7);
		b.setPersonas(p8);
		b.setPersonas(p9);
		b.setPersonas(p10);
		originator.setBackup(b);
		caretaker.createRestorePoint(b.getName(), originator.createMemento());
		
		b.infoBackup();
		
		Backup b2 = originator.restoreFromMemento(caretaker.getMemento("Backup enero"));
		
		System.out.println("DEBE SOLO TENER 5 USERS");
		b2.infoBackup();
		

	}

}
