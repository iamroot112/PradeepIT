package in.pradeep.Service;

import java.util.List;

import in.pradeep.entity.Book;

public interface BookService {
	public String upsertBook(Book book);
	public List<Book> getAllBooks();
	public String deleteBook(Integer bookId);
	

}
