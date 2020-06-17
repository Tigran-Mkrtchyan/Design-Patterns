package interpreter;

public class TerminalExpression implements Expression {
	private String data;
	public TerminalExpression(String data) {
		this.data = data.toLowerCase();
	}
	@Override
	public boolean interpret(String context) {
		if (context.toLowerCase().contains(data)) {
			return true;
		}
		return false;
	}

}
