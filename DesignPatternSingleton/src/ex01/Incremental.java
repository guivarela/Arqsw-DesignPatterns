package ex01;

import java.io.Serializable;

public class Incremental implements Serializable{

	private static final long serialVersionUID = -1093810940935189395L;
	private static Incremental sc = new Incremental();
	private Incremental(){
		if(sc!=null){
			throw new IllegalStateException("Already created.");
		}
	}
	
	public static Incremental getInstance(){
		return sc;
	}
	
	public static void somar() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Incremental "+(i+1));
		}
	}	
}
