package aufgabe19_Sorting;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		Worker[] workers = new Worker[5];
		
		workers[0] = new Worker(5, "Mustermann");
		workers[1] = new Worker(4, "Musterfrau");
		workers[2] = new Worker(3, "Musterkind");
		workers[3] = new Worker(2, "Musterfrau");
		workers[4] = new Worker(1, "Mustermann");
		
		for(Worker worker: workers) {
			System.out.println(worker);
		}
		
		Arrays.sort(workers);
		System.out.println();
		System.out.println("Sortiert nach Nachname und Id");
		
		for(Worker worker: workers) {
			System.out.println(worker);
		}
		
	}

}
