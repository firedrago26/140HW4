public interface SeqIt {   //class for seq itr
	public boolean hasNext(); //returns true if for loop continues
	public int next() throws UsingIteratorPastEndException; //returns next element in for loop
}
