package services;

import models.Book;
import repositories.BookDAO;

import java.sql.Connection;
import java.util.Optional;

public class BookService {

    final BookDAO bookDAO;

    public BookService(Connection dataSource) {
        this.bookDAO = new BookDAO(dataSource);
    }

    public Optional<Book> getOneByBookNumber(String bookNumber) {
        return bookDAO.getOneByBookNumber(bookNumber);
    }

    public Book insertNewBook(Book book) {
        return bookDAO.insertNewBook(book);
    }
}
