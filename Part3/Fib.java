public class Fib extends Seq {
	
	int first1, first2, last;
	static int count;
	
	public Fib(int first1, int first2, int last) {
		this.first1=first1;
		this.first2=first2;
		this.last=last;
		count++;
	}

	public static int getCount() {
		return count;
	}	

	public int upperBound() {
		return last;	
	}
	
	public String toString(){
		return "< "+first1+", "+first2+" to "+last+" >";
	}
}
