package collectionFramework;

import java.util.PriorityQueue;

/**
 * This example shows how you could use PriorityQueue Collection for processing Tasks.
 * @author zoe
 *
 */
public class PriorityQueueExample {
	
	
	/**
	 * Create PriorityQueue with Tasks and process queue by logging tasks
	 */
	public static void createAndListTasks() {
		PriorityQueue<Task> tasks = new PriorityQueue<Task>();
		
		tasks.offer(new Task("Aufgabe 1", StatusTask.closed, PriorityTask.high));
		tasks.offer(new Task("Aufgabe 2", StatusTask.active, PriorityTask.high));
		tasks.offer(new Task("Aufgabe 3", StatusTask.open, PriorityTask.normal));
		tasks.offer(new Task("Aufgabe 4", StatusTask.open, PriorityTask.low));
		tasks.offer(new Task("Aufgabe 5", StatusTask.open, PriorityTask.normal));
		tasks.offer(new Task("Aufgabe 6", StatusTask.open, PriorityTask.high));
		tasks.offer(new Task("Aufgabe 7", StatusTask.closed, PriorityTask.normal));
		
		while (!tasks.isEmpty()) {
			Task task = tasks.poll();
			System.out.println(task);
		}
	}

}
