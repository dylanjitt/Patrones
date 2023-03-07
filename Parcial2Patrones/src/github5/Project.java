package github5;

public class Project {
	private String name;
	private String comment;
	private String code;
	
	public Project(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public void show() {
		System.out.println("----------------------");
		System.out.println("Project: "+name);
		System.out.println("//"+comment);
		System.out.println("	> "+code);
	}
	

}
