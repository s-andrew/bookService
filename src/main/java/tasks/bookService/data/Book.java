package tasks.bookService.data;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Book {
    private List<Author> authors;
    private List<Word> words;

    public Book(List<Author> authors, List<Word> words)
    {
        this.authors = authors;
        this.words = words;
    }


    public List<Word> getWords(Predicate<Word> filter){
        return words.stream()
                .filter(filter)
                .collect(Collectors.toList());
    }
    public List<Word> getWords(){
        return words;
    }

    public List<Author> getAuthors(Predicate<Author> filter) {
        return authors.stream()
                .filter(filter)
                .collect(Collectors.toList());
    }

    public List<Author> getAuthors() {
        return authors;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
