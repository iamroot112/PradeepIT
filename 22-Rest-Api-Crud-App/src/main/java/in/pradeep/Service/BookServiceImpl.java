package in.pradeep.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.pradeep.Repository.BookRepository;
import in.pradeep.entity.Book;

@Service
public class BookServiceImpl implements BookService {
@Autowired
	private BookRepository repository;
	/*public BookServiceImpl(BookRepository repository) {
		this.repository=repository;
		
	}*/
	@Override
	public String upsertBook(Book book) {
		// TODO Auto-generated method stub
		Integer bookid=book.getBookId();
		repository.save(book);
		
		if (bookid==null) {
			return 	"record inserted";
		}
		else
			return "record updated";
		
	}

	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return  repository.findAll();
		
	}

	@Override
	public String deleteBook(Integer bookId) {
		// TODO Auto-generated method stub
		repository.deleteById(bookId);
		return "book deleted";
	}

}
