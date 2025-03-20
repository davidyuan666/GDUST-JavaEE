import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Auther:bingli
 * ClassName:BookServiceTest
 * Package:PACKAGE_NAME
 * Description:
 *
 * @date:2023/4/15-04-15 19:32
 * @author:2550976002@qq.com
 * @version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-service.xml", "classpath:application-dao.xml"})
public class BookServiceTest {
    @Autowired
    private BookService bookService;

    @Test
    public void findBookById() {
        Book book = bookService.findBookById(1);
        System.out.println("图书id:" + book.getId());
        System.out.println("图书名称:" + book.getName());
        System.out.println("作者:" + book.getAuthor());
        System.out.println("出版社:" + book.getPress());
    }
}
