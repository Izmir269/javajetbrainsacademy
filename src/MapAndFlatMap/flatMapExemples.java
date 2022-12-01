package MapAndFlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class flatMapExemples {
    public static void main(String[] args) {
        List<Book> javaBooks = List.of(
                new Book("Java EE 7 Essentials", 2013, List.of("Arun Gupta")),
                new Book("Algorithms", 2011, List.of("Robert Sedgewick", "Kevin Wayne")),
                new Book("Clean code", 2014, List.of("Robert Martin"))
        );
        // Liste de tous les auteurs
        List<String> authors = javaBooks.stream()
                .flatMap(book -> book.getAuthors().stream())
                .collect(Collectors.toList());
        System.out.println(authors);
    }
}
