package ru.olegcherednik.utils.gson.feign;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.Import;
import ru.olegcherednik.utils.gson.feign.app.client.BookClient;
import ru.olegcherednik.utils.gson.feign.app.dto.Book;
import ru.olegcherednik.utils.gson.feign.app.server.BookController;

@SuppressWarnings("unused")
@Import(BookController.class)
public class BookClientTest extends BaseClientTest {

    private BookClient client;

    @BeforeEach
    public void setUp() {
        client = buildClient(BookClient.class);
    }

    @Test
    public void foo() {
        Book book = new Book();
        book.setTitle("title");
        book.setAuthor("author");

        Book actual = client.createBook(book);

        int a = 0;
        a++;
    }

}
