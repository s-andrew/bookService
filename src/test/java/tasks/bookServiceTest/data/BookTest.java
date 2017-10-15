package tasks.bookServiceTest.data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tasks.bookService.data.Author;
import tasks.bookService.data.Book;
import tasks.bookService.data.Word;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BookTest {

    private List<Author> createAuthorList(){
        return Arrays.asList(
                new Author("Author1"),
                new Author("Author2"),
                new Author("Author3")
        );
    }
    private  List<Word> createWordsList(){
        return Arrays.asList(
                new Word("eng", "word1"),
                new Word("eng", "word2"),
                new Word("eng", "word3"),
                new Word("eng", "word4"),
                new Word("eng", "word5")
        );
    }
    private Book createBook(){
        List<Author> authors = createAuthorList();
        List<Word> words = createWordsList();
        return new Book(authors, words);
    }

    @Test
    public void testGetAuthors(){
        Book book = createBook();
        List<Author> actual = book.getAuthors();

        Assertions.assertEquals(createAuthorList().size(), book.getAuthors().size());
        Assertions.assertIterableEquals(
                Arrays.asList(new Author("Author1")),
                book.getAuthors(author -> author.equals(new Author("Author1")))
        );
    }

    @Test
    public void testGetWords(){
        Book book = createBook();
        Assertions.assertIterableEquals(Arrays.asList(new Word("eng", "word1")), book.getWords(word -> word.equals(new Word("eng", "word1"))));
    }

}
