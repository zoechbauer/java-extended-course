package aufgabe25_multithreading;

public class Program {
	
	public static void main(String[] args) {
		  
		letterAndNumberRace();
	}
	
	/**
	 * 3 Threads are started and are generating words and numberstrings
	 * The genderated Strings are printed and stored in statistics
	 * The Number of genderated words and numbers is printed at the end.
	 * 
	 * The 3 Threads are terminated accidentally.
	 * 
	 * Thread generateWord generates words
	 * Thread generateDigits generates Numberstrings
	 * Thread generateWordDigits genderates Numerstrings & words
	 */
	private static void letterAndNumberRace() {
		
		 System.out.println("\n***Wort und Zahlen-Generator gestartet");
		 
		 // start threads
		 // example 1 Thread Class
		 LetterThread generateWord = new LetterThread();
		 generateWord.start();
		 generateWord.setPriority(1);
		 
		 // example 2 class implements Runnable
		 Thread generateDigits = new Thread(new NumberThread(), "Thread-Digits");
		 generateDigits.start();
		 generateDigits.setPriority(7);
		 
		 // example 3 threads without separate classes
		 Thread generateWordDigits = new Thread(new Runnable() {
				@Override
				public void run() {
					do {
						generateWordsAndNumbers();
						try {
							Thread.currentThread().sleep(100);
						} catch (InterruptedException e) {
							//e.printStackTrace();
							System.out.printf("%s schlief als die Nachricht *** %s *** kam.%n", Thread.currentThread().getName(), e.getMessage());
							Thread.currentThread().interrupt();
						}
						
					} while (!Thread.currentThread().isInterrupted());
				}
			});
		 generateWordDigits.start();
			
		 // generate random numbers and terminate threads if specified numbers are generated
		 terminateThreads(generateWord, generateDigits, generateWordDigits);
		 
		 // wait until all threads have terminated
		 try {
			generateWord.join();
			generateDigits.join();
			generateWordDigits.join();
		 } catch (InterruptedException e) {
			e.printStackTrace();
		 }
		 
		 // print word and number counter
		 Statistics.printStatistics();
		 System.out.println("\n***Wort und Zahlen-Generator beendet");
	}
	
	/**
	 * The threads are terminated if a special Random Number is generated
	 * @param generateWord - thread
	 * @param generateDigits - thread
	 * @param generateWordDigits - thread
	 */
	private static void terminateThreads(Thread generateWord, Thread generateDigits, Thread generateWordDigits) {
		boolean wordThreadInterrupted = false;
		boolean digitThreadInterrupted = false;
		boolean digitWordThreadInterrupted = false;
		
		
		 while (!digitThreadInterrupted || !wordThreadInterrupted || !digitWordThreadInterrupted) {
			 randomDelay();
			 int random = (int) (Math.random() * 1000);
			 System.out.println("* Zufallszahl: " + random);
			 if (!wordThreadInterrupted && random % 11 == 0) {
				 generateWord.interrupt();
				 System.out.println("***generateWord.interrupt()");
				 wordThreadInterrupted = true;
			 }
			 if (!digitThreadInterrupted && random % 9 == 0 ) {
				 generateDigits.interrupt();
				 System.out.println("***generateDigits.interrupt();");
				 digitThreadInterrupted = true;
			 }
			 if (!digitWordThreadInterrupted && random % 7 == 0 ) {
				 generateWordDigits.interrupt();
				 System.out.println("***generateWordDigits.interrupt();");
				 digitWordThreadInterrupted = true;
			 }
		 }
	}
	
	/**
	 * The Thread sleeps an randomized time
	 */
	private static void randomDelay(){
		int time = (int)  (Math.random() * 2000);
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * generate Word and Numberstring and print string and update statistic
	 * This method is used by the 3rd Thread and is used to demonstrate
	 * synchronization of threads because this threads uses statistic methods
	 * thate the other 2 threads also use.
	 */
	private static void generateWordsAndNumbers() {
		final String wordString = "FINAL_CONSTANT of " + Thread.currentThread().getName();
		Statistics.incrementNumberCounter();
		Utils.printGeneratedString(wordString);
		
		String numberString = String.valueOf((int) (Math.random() * 99999));
		Statistics.incrementWordCounter();
		Utils.printGeneratedString(numberString);
	}

}
