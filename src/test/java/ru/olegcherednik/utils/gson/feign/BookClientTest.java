package ru.olegcherednik.utils.gson.feign;

import org.springframework.context.annotation.Import;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.olegcherednik.utils.gson.feign.app.client.BookClient;
import ru.olegcherednik.utils.gson.feign.app.dto.Book;
import ru.olegcherednik.utils.gson.feign.app.server.BookController;

import java.util.List;
import java.util.Map;

/**
 * @author Oleg Cherednik
 * @since 17.01.2021
 */
@SuppressWarnings("unused")
@Import(BookController.class)
public class BookClientTest extends BaseClientTest {

    private BookClient client;

    @BeforeMethod
    public void setUp() {
        client = buildClient(BookClient.class);
    }

    @Test
    public void foo() {
        Book book = client.createBook(new Book("title", "author"));
        List<Book> books = client.findBooks();
        Map<String, List<Book>> map = client.groupBooksByAuthor();

        int a = 0;
        a++;
    }

}
