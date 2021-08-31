package controller;

public class ThreadVetor extends Thread {
	private int[] vet;
	private int om;
	//VETOR E OPERACAO MAIN
	
	public ThreadVetor(int[] vet, int om) {
		this.vet = vet;
		this.om = om;
	}

	@Override
	public void run() {
		if (om % 2 > 0) {
			Foreach();
		} else {
			For();
		}
	}

	private void Foreach() { 
		double tempinicial = System.nanoTime();
		
		for (int i : vet) {
			
		}
		
		double tempfinal = System.nanoTime();
		double tot = (tempfinal - tempinicial) * (10 ^ 9);
		System.out.println("Foreach = " + tot + " segundos");
	}

	private void For() {
		double tempinicial = System.nanoTime();
		
		for (int i = 0; i < vet.length; i++) {
			
		}
		
		double tempfinal = System.nanoTime();
		double tot = (tempfinal - tempinicial) * (10 ^ 9);
		
		System.out.println("For = " + tot + " segundos");
	}

}