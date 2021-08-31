package view;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		int[] vetnum = new int[1000];
		
		for (int i = 0; i < 1000; i++) {
			int num = (int) ((Math.random() * 100) + 1);
			vetnum[i] = num;
		}
		
		ThreadVetor td1 = new ThreadVetor(vetnum, 1);
		ThreadVetor td2 = new ThreadVetor(vetnum, 2);
		
		td1.start();
		td2.start();
	}

}