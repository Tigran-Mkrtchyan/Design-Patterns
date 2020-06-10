package adapter;

public class RemoteWithTvRemote extends TvRemote implements Remote {

	@Override
	public void powerOff() {
		super.turnOff();
	}
	@Override
	public void  powerOn() {
		super.turnOn();
	}
	
	@Override
	public void nextChannel() {
		super.turnNextChannel();
	}

	@Override
	public void previuseChannel() {
		super.turnPreviuseChannel();
	}
}
