package chainOfResponsibility;

public class SimpleReportNotifier extends Notifier {

	public SimpleReportNotifier(Priority priority) {
		super(priority);
	}

	@Override
	public void write(String message) {
		System.out.println("Notifing using simple report :" + message );
	}

}
