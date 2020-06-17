package chainOfResponsibility;

public class SMSNotifier extends Notifier {

	public SMSNotifier(Priority priority) {
		super(priority);
	}

	@Override
	public void write(String message) {
		System.out.println("Sending SMS :" + message );
	}

}
