package label_derivation;

import java.util.HashSet;
import java.util.Set;

public class Label {

	private String owner;
	private Set<String> readers=new HashSet<String>();
	private Set<String> writers=new HashSet<String>();
	
	public Label(String owner, String readers[], String writers[]) {
		this.owner=owner;
		this.setReaders(readers);
		this.setWriters(writers);
	}
	
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public Set<String> getReaders() {
		return readers;
	}
	
	public void setReaders(String readers[]) {
		for(String reader:readers)
			this.readers.add(reader);
	}
	
	public Set<String> getWriters() {
		return writers;
	}
	
	public void setWriters(String writers[]) {
		for(String writer:writers)
			this.writers.add(writer);
	}
	
	/*public void clearReaders()
	{
		this.readers.clear();
	}
	
	public void clearWriters() {
		this.writers.clear();
	}
	
	public void intersectionReaders(Label label)
	{
		this.readers.retainAll(label.getReaders());
	}
	
	public void unionWriters(Label label)
	{
		this.writers.addAll(label.getWriters());
	}*/
	
}
