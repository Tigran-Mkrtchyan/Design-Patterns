package singlton;

public class ProgramLoger {
	private static ProgramLoger programLoger;
	private static String logFile = "This is log file \n";
	private ProgramLoger() {
		
	}
	public static synchronized ProgramLoger getProgramLoger() {
		if (programLoger == null) {
			return new ProgramLoger();
		}
		return programLoger;
	}
	public  void addLogInfo (String newFile) {
		logFile += newFile + "\n";
	}
	public  static void showLogFile() {
		System.out.println(logFile);
	}
}
