public class For extends Seq {

	protected int first, last, step;
	static int count;

	public For(int first, int last, int step) {
		this.first=first;
		this.last=last;
		this.step=step;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	public int upperBound() {
		if(step>0)
			return last;
		else //step<=0
			return first;
	}
	
	public String toString() {
		return "{ "+first+" to "+last+" by "+step+ " }";
	}	
	
	public SeqIt createSeqIt() {
		return new ForIt(this);
	}
}
