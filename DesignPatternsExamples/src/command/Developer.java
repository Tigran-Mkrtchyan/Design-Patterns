package command;

public class Developer {
	private Command insert;
	private Command update;
	private Command select;
	private Command delete;
	
	public Developer(Command insert, Command update, Command select, Command delete) {
		this.insert = insert;
		this.update = update;
		this.select = select;
		this.delete = delete;
	}
	
	public void InsertRecord() {
		insert.execute();
	}
	public void UpdateRecord() {
		update.execute();
	}
	public void SelectRecord() {
		select.execute();
	}
	public void DeleteRecord() {
		delete.execute();
	}
}
