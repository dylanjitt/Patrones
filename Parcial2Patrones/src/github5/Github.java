package github5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Github implements Inotify {
	private int comver;
	private Map<Integer,Memento> commitMap = new HashMap<>();
	
	private List<Developer> devsList = new ArrayList<>();
	
	public void createCommit(int numberCommit, Memento memento) {
		commitMap.put(numberCommit, memento);
		//setComver(numberCommit);
	}
	
	public Memento getCommit(int numberCommit) {
		notifyDev(numberCommit);
		return commitMap.get(numberCommit);
	}
	
	public int getComver() {
		return comver;
	}

	public void setComver(int comver) {
		this.comver = comver;
	}

	public void addDev(Developer dev) {
		devsList.add(dev);
		dev.infoUser();
	}
	
	public void removeAllDevs() {
		System.out.println("<<<<<<<<<<<<<<<<<<<<<");
		for (Developer d:devsList) {
			System.out.println(d.getName()+" ha salido del proyecto");
		}
		devsList.clear();
	}

	@Override
	public void notifyDev(int comver) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Se ha recuperado el commit "+comver);
		for (Developer dev: devsList) {
			if (dev.getComver()==comver) {
				System.out.println("- Notified to user: "+dev.getName());
				
			}
		}	
		
	}

}
