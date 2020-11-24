package comparator.dss;

public class Product implements Comparable<Product>{
	
	int id;
	String name;
	double cost;
	
	public Product(int id, String name, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

	@Override
	public int compareTo(Product o) {
		if(id == o.id)
			return 0;
		else if(id > o.id)
			return 1;
		else
			return -1;
	}
	
}
