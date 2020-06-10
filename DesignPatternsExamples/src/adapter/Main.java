package adapter;

public class Main {

	public static void main(String[] args) {
		Remote remote = new RemoteWithTvRemote();
		remote.powerOn();
		remote.powerOff();
		remote.nextChannel();;
		remote.previuseChannel();
	}

}
