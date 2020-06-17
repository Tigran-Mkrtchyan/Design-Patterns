package chainOfResponsibility;

public abstract class Notifier {
	private Priority priority;
	private Notifier nextNotifier;
	public Notifier (Priority priority) {
		this.priority = priority;
	}
	public void setNextNotifier(Notifier nextNotifier) {
		this.nextNotifier = nextNotifier;
	}
	
	public void notifyManager(String message, Priority level) {
		if(level.equals(priority)) {
			write(message);
		}
		else if(nextNotifier != null) {
			write(message);
			nextNotifier.notifyManager(message, level);
		}
	}
	public abstract void write(String message);
}
