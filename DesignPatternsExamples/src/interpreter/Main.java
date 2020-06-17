package interpreter;

public class Main {
	public static Expression getJavaExpression(){
		Expression isJava = new TerminalExpression("Java");
		Expression isJavaCore = new TerminalExpression("Java Core");
		return new OrExpression(isJava,isJavaCore);
	}
	public static Expression getJavaEEExpression(){
		Expression java = new TerminalExpression("Java");
		Expression spring = new TerminalExpression("Spring");
		return new AndExpression(java,spring);
	}
	public static void main(String[] args) {
		Expression isJava = getJavaExpression();
		Expression isJavaEE = getJavaEEExpression();
		System.out.println("Does developer knows java : " + isJava.interpret("Java") );
		System.out.println("Does developer knows javaEE : " + isJavaEE.interpret("Java Spring") );
	}

}
