package ru.olegcherednik.utils.gson.feign.app.server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.olegcherednik.utils.gson.feign.app.dto.Book;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Oleg Cherednik
 * @since 30.01.2021
 */
@RestController
public class BookController {

    @PostMapping("books")
    public Book createBook(@RequestBody Book book) {
        book.setResponse("BookController");
        return book;
    }

    @GetMapping("books")
    public List<Book> findBooks() {
        return Arrays.asList(
                new Book("title1", "author1"),
                new Book("title2", "author2"));
    }

    @GetMapping("books/group/author")
    public Map<String, List<Book>> groupBooksByAuthor() {
        Map<String, List<Book>> map = new HashMap<>();
        map.put("Oleg Cherednik", Arrays.asList(
                new Book("Java", "Oleg Cherednik"),
                new Book("C++", "Oleg Cherednik")));
        map.put("Anna Pavlova", Arrays.asList(
                new Book("Go", "Anna Pavlova"),
                new Book("Python", "Anna Pavlova")));
        return map;
    }
}
