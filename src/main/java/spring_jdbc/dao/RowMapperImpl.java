//package spring_jdbc.dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.time.LocalDate;
//
//import org.springframework.jdbc.core.RowMapper;
//
////import org.springframework.jdbc.core.RowMapper;
//
//import spring_jdbc.entity.User;
//public class RowMapperImpl implements RowMapper<User>  {
//
//	@Override
//	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//		 int id=rs.getInt(1);
//		 String name=rs.getString(2);
//		 double price=rs.getDouble(3);
//		 int copies=rs.getInt(4);
//		 boolean stock=rs.getBoolean(5);
//		 LocalDate publicationDate=rs.getDate(6).toLocalDate();
//		 
//		return new User(id,name,price,copies,stock,publicationDate);
//	}
//	
//	 
//
//	 
//		
//}
