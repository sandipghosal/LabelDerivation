package label_derivation;

public class RWFMOperations {
	
	public void operationRead(Label source, Label target)
	{		
		target.getReaders().retainAll(source.getReaders());
		target.getWriters().addAll(source.getWriters());
	}
}
