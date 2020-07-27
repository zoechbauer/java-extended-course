package collectionFramework;

public class Task implements Comparable{
	private String task;
	private PriorityTask priority;
	private StatusTask status;
	
	public Task(String task, StatusTask status, PriorityTask priority) {
		this.task  = task;
		this.priority = priority;
		this.status = status;
	}
	
	/**
	 * compare status then priority
	 * @param obj
	 * @return
	 */
	@Override
	public int compareTo(Object obj) {
		if (!(obj instanceof Task)) return 0;
		Task other = (Task) obj;
		
		if (this.status == other.status) {
			return this.priority.compareTo(other.priority);
		} 
		
		return this.status.compareTo(other.status);
	}
	
	@Override
	public String toString() {
		return String.format("Die Aufgabe %s mit Priorität %s ist in Status %s", 
				this.task, this.priority, this.status);
	}
}
