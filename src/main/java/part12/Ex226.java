package part12;

import java.awt.print.Book;
import java.util.Optional;

/**
 * Инициализация объекта класса Optional
 */
public class Ex226 {

    //Нежелательно
    Optional<Book> book1 = null;

    // Предпочительно
    Optional<Book> book = Optional.empty();
}
