import java.util.ArrayList;

import org.antlr.v4.runtime.tree.TerminalNode;


public class MethodPrinter extends JavaLanguageBaseListener{
	boolean inMethod;
	String currentMethod;
	ArrayList<String> methods;
	
	public MethodPrinter() {
		// TODO Auto-generated constructor stub
		inMethod=false;
		methods=new ArrayList<String>();
	}
	
	@Override
	public void enterMethodDeclaration(JavaLanguageParser.MethodDeclarationContext ctx) {
		// TODO Auto-generated method stub
		inMethod=true;
		currentMethod="";
	}
	
	@Override
	public void exitMethodDeclaration(JavaLanguageParser.MethodDeclarationContext ctx) {
		// TODO Auto-generated method stub
		inMethod=false;
		methods.add(currentMethod);
	}
	
	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		if(inMethod)
			currentMethod += node.getText()+" ";
	}
}
