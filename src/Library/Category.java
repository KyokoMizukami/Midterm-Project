package Library;

public class Category {

	public String category;
	
	public  Category( String category) {
		this.category = category;
		
		
	}
	@Override
	public String toString() {
		return category ;
	}

	public String getCategory() {
		return category;
	}
}
