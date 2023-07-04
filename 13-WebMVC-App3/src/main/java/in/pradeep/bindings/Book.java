package in.pradeep.bindings;


public class Book {

	private String BookName;
	/*public Book(Integer BookId, String getBookName, Integer BookPrice) {
		// TODO Auto-generated constructor stub
	}*/
	public Book(Integer BookId, String BookName, Integer BookPrice){
		
		bookId=BookId;
		bookName=BookName;
		bookPrice=BookPrice;
		
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
	}
	private  Integer bookId;
	private String bookName;
    private Integer bookPrice;

}
