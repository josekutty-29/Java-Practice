
public class Books {
	int bookid;
	String name;
	String author;
	
	Books(int bookid,String name,String author){
		
		this.bookid=bookid;
		this.name=name;
		this.author=author;
	}
	
	void printBookDetails() {
		System.out.println("Book Name : "+name+" | Book Id: "+bookid+" | Author: "+author);
	}
	
	
	

}
