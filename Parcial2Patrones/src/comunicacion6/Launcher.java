package comunicacion6;

public class Launcher {

	public static void main(String[] args) {
		ChatRoom chat = new ChatRoom();
		
		Developer d1 = new Developer(chat, "Damon Albarn");
		Developer d3 = new Developer(chat, "Thomas Bangaltier");
		Developer d4 = new Developer(chat, "Guy Manuel de Homem Cristo");
		Developer d2 = new Developer(chat, "Elton John");
		Developer d5 = new Developer(chat, "Miley Cyrus");
		
		d1.setGroupMode(true);
		d2.setGroupMode(true);
		d3.setGroupMode(false);
		d4.setGroupMode(false);
		d5.setGroupMode(true);
		
		chat.addToChat(d1).addToChat(d2).addToChat(d3).addToChat(d4).addToChat(d5);
		
		d3.send("Sending new feature");
		d1.send("Uploading commit");


	}

}
