import com.Biblioteca.Biblioteca;
import com.Biblioteca.Book;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by xlluo on 9/24/15.
 */
public class BibliotecaTest {
    @Test
    public void testForEven(){
        assertEquals(1,1);
    }

    @Test
    public void should_return_welcome(){
        String message = "welcome";
        assertEquals(message, Biblioteca.welcomeMessage());
    }

    @Test
    public void should_return_book_message(){
        assertEquals(1, Biblioteca.bookList().size());
    }

    @Test
    public void should_return_selected_book(){
        Book givenBook = new Book();
        givenBook.Name = "story";
        assertEquals(givenBook.Name, Biblioteca.selectedBook(givenBook));
    }
}
