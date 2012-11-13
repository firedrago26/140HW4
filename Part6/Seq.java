// the Seq base class

public abstract class Seq {
	static int count=0;

	public Seq(){
		count++; 
	}

	public abstract int upperBound();

	public static int getCount() {
		return count;
	}
	
	public abstract SeqIt createSeqIt();
}
