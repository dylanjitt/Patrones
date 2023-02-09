package SegundoParcial;

import java.util.ArrayList;
import java.util.List;

public class P4ej2 {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(1);
		li.add(1);
		li.add(1);
		li.add(1);
		
		Lista l = new Lista(li);
		contador(l);

	}
	
	public static void contador(Lista l) {
		int acc =l.getList().stream().mapToInt(Integer::valueOf).sum();
		System.out.println(acc);
	}
}
