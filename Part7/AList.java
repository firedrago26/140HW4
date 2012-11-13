import java.util.ArrayList;

public class AList {
	
	ArrayList<Object> list=new ArrayList<Object>();

	public void add(Seq s) {
		list.add(s);
	}
	
	public void add(AList a) {
		list.add(a);
	}
	
	public void add(int i) {
		list.add(new Integer(i));
	}
	public String toString() {
		String str="[ ";
		for(int i=0;i<list.size();i++) {
			if(i<list.size()-1)
				str+=list.get(i)+" ";
			else
				str+=list.get(i);
		}
		str+=" ]";
		return str;
	}	
}

