package chainOfResponsibility;

public class Main {

	public static void main(String[] args) {
		Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
		Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
		Notifier smsNotifier = new SMSNotifier(Priority.ASAP);
		reportNotifier.setNextNotifier(emailNotifier);
		emailNotifier.setNextNotifier(smsNotifier);
		
		reportNotifier.notifyManager("All is OK",Priority.ROUTINE);
		reportNotifier.notifyManager("We have a problem",Priority.ASAP);
		
	}

}
