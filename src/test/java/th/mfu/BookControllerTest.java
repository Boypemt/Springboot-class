// package th.mfu;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertNull;
// import static org.junit.jupiter.api.Assertions.assertTrue;

// import java.util.Collection;

// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;

// public class BookControllerTest {

//     private BookController controller;

//     @BeforeEach
//     public void setUp() {
//         controller = new BookController();
//         BookController.bookMap.clear();
//     }

//     @Test
//     public void testCreateBook() {
//         Book book = new Book(0, "Clean Code", "Robert C. Martin", 2008);

//         ResponseEntity<String> response = controller.createBook(book);

//         assertEquals(HttpStatus.CREATED, response.getStatusCode());
//         assertTrue(response.getBody().contains("Book created with ID:"));
//         assertEquals(1, BookController.bookMap.size());
//     }

//     @Test
//     public void testListBooksEmpty() {
//         ResponseEntity<Collection> response = controller.listBooks();

//         assertEquals(HttpStatus.OK, response.getStatusCode());
//         assertTrue(response.getBody().isEmpty());
//     }

//     @Test
//     public void testListBooksWithData() {
//         controller.createBook(new Book(0, "Clean Code", "Robert C. Martin", 2008));
//         controller.createBook(new Book(0, "Effective Java", "Joshua Bloch", 2001));

//         ResponseEntity<Collection> response = controller.listBooks();

//         assertEquals(HttpStatus.OK, response.getStatusCode());
//         assertEquals(2, response.getBody().size());
//     }

//     @Test
//     public void testGetBookByIdFound() {
//         controller.createBook(new Book(0, "Clean Code", "Robert C. Martin", 2008));

//         ResponseEntity<Book> response = controller.getBookById(1L);

//         assertEquals(HttpStatus.OK, response.getStatusCode());
//         assertEquals("Clean Code", response.getBody().getTitle());
//     }

//     @Test
//     public void testGetBookByIdNotFound() {
//         ResponseEntity<Book> response = controller.getBookById(999L);

//         assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
//         assertNull(response.getBody());
//     }

//     @Test
//     public void testDeleteBookByIdFound() {
//         controller.createBook(new Book(0, "Clean Code", "Robert C. Martin", 2008));

//         ResponseEntity<String> response = controller.deleteBookById(1L);

//         assertEquals(HttpStatus.OK, response.getStatusCode());
//         assertTrue(response.getBody().contains("Book deleted with ID:"));
//         assertEquals(0, BookController.bookMap.size());
//     }

//     @Test
//     public void testDeleteBookByIdNotFound() {
//         ResponseEntity<String> response = controller.deleteBookById(999L);

//         assertEquals(HttpStatus.NOT_FOUND, response.getStatusCode());
//         assertEquals("Book not found", response.getBody());
//     }
// }
