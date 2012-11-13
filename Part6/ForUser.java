public class ForUser {

	//static ForIt forItr;
	
	public static int sum1(For r) {
		ForIt forItr;
		forItr=new ForIt(r);
		int sum=0; 
		//System.err.println("sum= "+sum); 
		if(!forItr.hasNext())    //empty return 0
			return 0;
		while(forItr.hasNext()) { //if for loop has element keep adding sum
			try {
				sum+=forItr.next(); 
			}
			catch (UsingIteratorPastEndException e){
				//System.out.println("Caught itr error");
			}
			//System.err.println("sum in loop = " + sum);
		}	
		return sum;
		//return 0;
	}

	public static int sum2(For r) {
		ForIt forItr;
		forItr=new ForIt(r);
		int sum=0;
		while(true) {   // can't use hasNext() so must use infinite loop
			try {
				sum+=forItr.next();
			}
			catch (UsingIteratorPastEndException e) {
				//System.out.println("Caught itr error");
				break;
			}
		}
		return sum;
	}
}
