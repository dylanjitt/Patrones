package practica7;

public class Originator {
	private Backup backup;
	
	public void setBackup(Backup backup) {
		this.backup = new Backup(backup.getName());
		this.backup.setListpersonas(backup.getListpersonas());
		
	}
	
	public Memento createMemento() {
		return new Memento(backup);
	}
	
	public Backup restoreFromMemento(Memento m) {
		backup = m.getBackupState();
		return backup;
	}

}
