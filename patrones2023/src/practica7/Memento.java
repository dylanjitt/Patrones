package practica7;

public class Memento {
	private Backup backup;
	
	public Memento(Backup backup) {
		this.backup = backup;
	}
	
	public Backup getBackupState() {
		return backup;
	}

}
