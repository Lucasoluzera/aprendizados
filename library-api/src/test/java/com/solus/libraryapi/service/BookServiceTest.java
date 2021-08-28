package com.solus.libraryapi.service;

import com.solus.libraryapi.api.entity.Book;
import com.solus.libraryapi.api.service.BookService;
import com.solus.libraryapi.service.impl.BookServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;


@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
public class BookServiceTest {

    BookService service;

    @BeforeEach
    public void setUp(){
        this.service = new BookServiceImpl();
    }

    @Test
    @DisplayName("Must create a book successfully.")
    public void saveBookTest() {
        //cenario
        Book book = Book.builder()
                .isbn("22")
                .author("Ana Paula")
                .title("Ama o Lukinha da galera")
                .build();

        //execucao
        Book savedBook = service.save(book);

        //verificacao
        assertThat(savedBook.getId()).isNotNull();
        assertThat(savedBook.getIsbn()).isEqualTo("22");
        assertThat(savedBook.getTitle()).isEqualTo("Ama o Lukinha da galera");
        assertThat(savedBook.getAuthor()).isEqualTo("Ana Paula");
    }
}
