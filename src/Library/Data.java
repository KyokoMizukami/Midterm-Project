package Library;
import java.time.LocalDate;
import java.util.ArrayList;

public class Data {
	public ArrayList<UserName> user;
	public ArrayList<Category> category;
	public ArrayList<Reservation> reserve;

	
	public Data() {
		this.user=new ArrayList<UserName>();
		this.category=new ArrayList<Category>();
		this.reserve=new ArrayList<Reservation>();
		
	}

	
	
	public ArrayList<UserName> getUser() {
		return user;
	}



	public ArrayList<Category> getCategory() {
		return category;
	}



	public ArrayList<Reservation> getReserve() {
		return reserve;
	}



	
	
	public void addBook( String categories) {
		category.add(new Category(categories));
	}
	
	public boolean addUsername(String UserName) {
		boolean userExist = false;
		
		for (UserName item : user)
		{
			if(UserName.equals(item.name)){
				userExist = true;
		}
		}
		if(userExist==false){
			
				user.add(new UserName(UserName));
			
			
			
		}
		  return userExist;
	}
	
	public String addReserve(LocalDate date, String bookTitle, String name)
	{
		UserName reserveName = null;
		for(UserName item: user)
		{
			if(name.equals(item.name)){
				reserveName = item;
			}
		}
	
//	
		Reservation paper = new Reservation();
		paper.setDate(date);
		paper.setName(reserveName);
		paper.setBook(bookTitle);
		
		reserve.add(paper);
		return paper.toString();
	}
	

	

	public void addDetail() {

		addBook("New");	
		addBook("Horror");	
		addBook("Fantasy");	
		addBook("Romance");	
		
	}

}
