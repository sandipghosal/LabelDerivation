
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class GenerateParseTree {

	public static void main(String[] args) {
		GenerateParseTree pt =new GenerateParseTree();
		ParseTree tree = pt.Generate(args[0]);
		pt.printTree(tree);	
	}
	
	public ParseTree Generate(String filename)
	{
		ParseTree tree=null;
		try{
			ANTLRFileStream input = new ANTLRFileStream(filename);
			JavaLanguageLexer lexer = new JavaLanguageLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			JavaLanguageParser parser = new JavaLanguageParser(tokens);
			
			tree = parser.block();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		return tree;
	}
	
	public void printTree(ParseTree tree)
	{
		if(tree.getChildCount()==0)
		{
			System.out.println(tree.getText());
			return;
		}
		
		for(int i=0;i<tree.getChildCount();i++)
		{
			printTree(tree.getChild(i));
		}
	}
}
