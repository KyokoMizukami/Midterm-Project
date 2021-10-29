package Library;
import java.time.LocalDate;

public class Reservation {
	public LocalDate date;
	public UserName name;
	public Category category;
	public String book;
	
	public String getBook() {
		return book;
	}



	public void setBook(String book) {
		this.book = book;
	}



	public  Reservation() {
		this.date= LocalDate.now();
		
	}

	

	public LocalDate getDate() {
		return date;
	}


	public Category getCategory() {
		return category;
	}



	public UserName getName() {
		return name;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}




	public void setCategory(Category category) {
		this.category = category;
	}



	public void setName(UserName name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Reservation Rentdate; " + date + ", Booktitle: " + book + ", Username: " + name ;
	}



	



	



	

}
