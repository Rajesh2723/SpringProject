package spring_jdbc;
import spring_jdbc.dao.UserDao;
//import spring_jdbc.dao.User;
import spring_jdbc.entity.User;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  ctx=new ClassPathXmlApplicationContext("config.xml");
        UserDao userDao=(UserDao)ctx.getBean("UserDao");
        User user=new User("someone","9901200951","c++" );
        int result=userDao.insertUser(user);
        if(result==1) {
        	System.out.println("User added successfully");
        }else {
        	System.out.println("User cant be added");
        }
//        Book bookToUpdate=new Book(1,"Java",250,5,true,
//        		LocalDate.of(2023, 10, 10));
//        int updateResult=bookDao.updateBook(bookToUpdate);
//        if(updateResult==1) {
//        	System.out.println("update successfully");
//        }else {
//        	System.out.println("not updated");
//        }
//        int bookIdToDelete=2;
//        int deleteResult=bookDao.deleteBook(bookIdToDelete);
//        if(deleteResult==1) {
//        	System.out.println("Book Deleted successfully");
//        }else {
//        	System.out.println("Book cant be deleted");
//        }
//        int bookToFetch=3;
//        User fetchedBook=bookDao.getBook(bookToFetch);
//        System.out.println(fetchedBook);
//        List<User>books=bookDao.getAllBook();
//        System.out.println(books);
        
    }
}
