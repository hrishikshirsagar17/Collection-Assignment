/*"There is arraylist which contains objects of class BookSale { Book b , int copiesSold }
Book { int bookid , String author , float price } 
There is also a hashmap which contains information about business done by each book.
Map<int bookid , float amount> Map already has information about all books and business
done till now. You can take hardcoded values in map. Write a program to update map using
new information in given array. If book is present in map calculate its business amount (price
* copiessold) and add to existing amount in map. If book is not present add its entry in map."
*/
package ExtraAssignment;
import java.util.*;

class Book
{
	private int bookid;
	private String bookname;
	private String authorname;
	private float price;
	
	public Book() {
	}

	public Book(int bookid, String bookname, String authorname, float price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authorname = authorname;
		this.price = price;
		
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthorname() {
		return authorname;
	}

	public void setAuthorname(String authorname) {
		this.authorname = authorname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", authorname=" + authorname + ", price=" + price
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorname == null) ? 0 : authorname.hashCode());
		result = prime * result + bookid;
		result = prime * result + ((bookname == null) ? 0 : bookname.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authorname == null) {
			if (other.authorname != null)
				return false;
		} else if (!authorname.equals(other.authorname))
			return false;
		if (bookid != other.bookid)
			return false;
		if (bookname == null) {
			if (other.bookname != null)
				return false;
		} else if (!bookname.equals(other.bookname))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		return true;
	}
	
	
}

class BookSale
{
	private Book b;
	private int copiesSold;
	
	public BookSale() {
	}

	public BookSale(Book b, int copiesSold) {
		super();
		this.b = b;
		this.copiesSold = copiesSold;
	}

	public Book getB() {
		return b;
	}

	public void setB(Book b) {
		this.b = b;
	}

	public int getCopiesSold() {
		return copiesSold;
	}

	public void setCopiesSold(int copiesSold) {
		this.copiesSold = copiesSold;
	}

	@Override
	public String toString() {
		return "BookSale ["+ b + ", copiesSold=" + copiesSold + "]";
	}
	
}
public class Ques1 {

	public static void main(String[] args) {
		

		Map<Integer, Float> m1=new HashMap<Integer, Float>();
		
		m1.put(1, 500000f);
		m1.put(2, 600000f);
		m1.put(3, 400000f);
		m1.put(4, 300000f);
		m1.put(5, 450000f);
		
		Book b1=new Book(1, "Hemlet", "William Shakespeare", 350);
		Book b2=new Book(2, "Harry Potter", "J K Rowling", 500);
		Book b3=new Book(3, "Othello", "William Shakespeare", 300);
		Book b4=new Book(4, "War And Peace", "Leo Tolstoy", 300);
		Book b5=new Book(5, "Julius Caesar", "William Shakespeare", 450);
		Book b6=new Book(6, "Resurrection", "Leo Tolstoy", 400);
		
		BookSale bs1=new BookSale(b1, 10000); 
		BookSale bs2=new BookSale(b2, 9000);
		BookSale bs3=new BookSale(b3, 8000);
		BookSale bs4=new BookSale(b4, 5000);
		BookSale bs5=new BookSale(b5, 9000);
		BookSale bs6=new BookSale(b6, 6000);
		
		BookSale b[]=new BookSale[6];
		b[0]=bs1;
		b[1]=bs2;
		b[2]=bs3;
		b[3]=bs4;
		b[4]=bs5;
		b[5]=bs6;
		
		float amount;
		for(int i=0;i<b.length;i++)
		{
			amount=0;
			Integer key=b[i].getB().getBookid();
			if(m1.containsKey(key))
			{
				amount=b[i].getB().getPrice()*b[i].getCopiesSold();
				m1.put(key, m1.get(key)+amount);
			}
			else
			{
				amount=b[i].getB().getPrice()*b[i].getCopiesSold();
				m1.put(key, amount);
				
			}
		}
		
		for(Map.Entry<Integer, Float> e:m1.entrySet())
			System.out.println("Book ID : "+e.getKey()+" --> "+"Bussiness Done : "+e.getValue());
	}
}
