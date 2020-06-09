package singlton;

public class ProgramRuner {

	public static void main(String[] args) {
		ProgramLoger.getProgramLoger().addLogInfo("first file...");
		ProgramLoger.getProgramLoger().addLogInfo("Second file ...");
		ProgramLoger.getProgramLoger().addLogInfo("third file ... ");
		ProgramLoger.showLogFile();
	}

}
