package github5;

public class Launcher {

	public static void main(String[] args) {
		Git git = new Git();
		Github github = new Github();
		
		Project project = new Project("Mario 2");
		
		Developer d1 = new Developer("Andres");
		Developer d2 = new Developer("Fernando");
		Developer d3 = new Developer("Maria");
		
		github.addDev(d1);
		github.addDev(d2);
		github.addDev(d3);
		
		project.setCode("public void NFT");
		project.setComment("el futuro del arte");
		
		git.setProject(project);
		github.createCommit(1, git.createCommit());
		
		d1.setComver(1);
		d2.setComver(1);
		d3.setComver(1);
		
		project.setCode(project.getCode()+"\n	public void CryptoCurrency");
		project.setComment(project.getComment()+" y las transacciones");
		
		git.setProject(project);
		github.createCommit(2, git.createCommit());
		
		project.setCode(project.getCode()+"\n	private NFT security");
		project.setComment(project.getComment()+" tienen");
		
		git.setProject(project);
		github.createCommit(3, git.createCommit());
		
		project.setCode(project.getCode()+"\n		System.out.print(Hola)");
		project.setComment(project.getComment()+" un riesgo");
		
		git.setProject(project);
		github.createCommit(4, git.createCommit());
		
		project.setCode(project.getCode()+"\n	Public NFT Blockchain");
		project.setComment(project.getComment()+" que se debe tomar en cuenta");
		
		git.setProject(project);
		github.createCommit(5, git.createCommit());
		
		project.show();
		
		project = git.checkoutCommit(github.getCommit(1));
		project.show();
		
		github.removeAllDevs();
		
		Developer d4 = new Developer("Ronaldo");
		Developer d5 = new Developer("Ricardo");
		Developer d6 = new Developer("Sara");
		
		github.addDev(d4);
		github.addDev(d5);
		github.addDev(d6);
		
		d4.setComver(5);
		d5.setComver(5);
		d6.setComver(5);
		
		project = git.checkoutCommit(github.getCommit(5));
		project.show();
		
		


	}

}
