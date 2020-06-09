package prototype;

public class HumanFactory {
	private Human human;
	 public HumanFactory (Human drawing) {
		 setHuman (drawing);
	 }
	 public void setHuman (Human human) {
		 this.human = human;
	 }
	  public Human makeCopy() {
		  return (Human)human.copy();
	  }
}
