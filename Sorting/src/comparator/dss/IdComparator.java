package comparator.dss;

import java.util.Comparator;

public class IdComparator implements Comparator<Product>{

	@Override
	//desc order
	public int compare(Product o1, Product o2) {
		if(o2.id ==o1.id)
			return 0;
		else if(o2.id > o1.id)
			return 1;
		else
			return 1;
	}
	

}
