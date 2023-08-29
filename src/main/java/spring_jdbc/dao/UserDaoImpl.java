package spring_jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import spring_jdbc.entity.User;

public class UserDaoImpl implements UserDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertUser(User user) {
		 String insertQuery="insert into user"
		 		+ "( Name,MobileNumber,Subject)"
		 		+ " values( ?,?,?);" ;
//		 System.out.println(user.getDateOfPublication());
		return  jdbcTemplate.update(insertQuery, 
				user.getName(),user. getMobileNumber(),
				user.getSubject() );
	}

	 

//	@Override
//	public int updateUser(User user) {
//		 String updateQuery="update "
//		 
//		return jdbcTemplate.update(updateQuery,book.getBookName(),
//				book.getBookPrice(),book.getNoOfCopies(),
//				book.isInStock(),book.getDateOfPublication(),book.getBookId());
//	}
	
//	@Override
//	public int deleteBook(int bookId) {
//		 String DeleteQuery="DELETE FROM books WHERE bookId = ?";
//		 
//		return jdbcTemplate.update(DeleteQuery,bookId);
//	}

//	@Override
//	public Book getBook(int bookId) {
//		String getBookQuery="SELECT * FROM books WHERE bookId = ?";
//		
//		return jdbcTemplate.queryForObject(getBookQuery, 
//				new RowMapperImpl(),bookId);
//	}

//	@Override
//	public List<Book> getAllBook() {
//		 String getAllBooksQuery="select * from books";
//		return jdbcTemplate.query(getAllBooksQuery,
//				new RowMapperImpl());
//	}

	 
	
}
