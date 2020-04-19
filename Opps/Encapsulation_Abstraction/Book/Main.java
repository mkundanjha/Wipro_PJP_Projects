public class Main
{
	public static void main(String[] args) {
	Author author1=new Author("John","abc@xyz.com",'M');
	Book book1=new Book(author1,"Night Owl",452.6,5);
	
	System.out.println(book1.getName()+" "+book1.getPrice()+" "+book1.getQty()+" "+
	book1.getAuthor().getName()+" "+book1.getAuthor().getEmail()+" "+book1.getAuthor().getGender());
	
	  
		
	}
}

