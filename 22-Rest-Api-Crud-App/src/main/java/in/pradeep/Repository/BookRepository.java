package in.pradeep.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pradeep.entity.Book;

public interface BookRepository  extends JpaRepository<Book,Serializable>{

}
