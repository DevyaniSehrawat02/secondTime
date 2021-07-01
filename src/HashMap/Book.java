package HashMap;

public class Book {
	
	int id;
	String name,author,publisher;    
	int quantity;
	public Book(int id, String name, String author, String publisher, int quantity)
	{
		this.author=author;
		this.id=id;
		this.name=name;
		this.publisher=publisher;
		this.quantity=quantity;
	}
	
	public String display()
	{
		return this.author+" "+this.id+" "+this.name+" "+this.publisher+" "+this.quantity;
	}

}
