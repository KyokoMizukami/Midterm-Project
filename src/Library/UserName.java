package Library;

public class UserName {
	public String name;
	
	public UserName(String name) {
		this.name=name;
	}

	@Override
	public String toString() {
		return name ;
	}

	public String getName() {
		return name;
	}

}
