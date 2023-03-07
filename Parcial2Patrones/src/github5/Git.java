package github5;

public class Git {
	private Project project;
	
	public void setProject(Project project) {
		this.project = new Project(project.getName());
		this.project.setComment(project.getComment());
		this.project.setCode(project.getCode());
	}
	
	public Memento createCommit() {
		return new Memento(project);
	}
	
	public Project checkoutCommit(Memento memento) {
		this.project = memento.getProjectState();
		return project;
	}

}
