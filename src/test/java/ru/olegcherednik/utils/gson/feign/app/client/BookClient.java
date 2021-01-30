package ru.olegcherednik.utils.gson.feign.app.client;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.olegcherednik.utils.gson.feign.app.dto.Book;

import java.util.List;
import java.util.Map;

/**
 * @author Oleg Cherednik
 * @since 30.01.2021
 */
@SuppressWarnings("InterfaceNeverImplemented")
public interface BookClient {

    @PostMapping(value = "book", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    Book createBook(@RequestBody Book book);

    @GetMapping("books")
    List<Book> findBooks();

    @GetMapping("books/group/author")
    Map<String, List<Book>> groupBooksByAuthor();
}
