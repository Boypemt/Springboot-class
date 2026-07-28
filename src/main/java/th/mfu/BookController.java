package th.mfu;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")

public class BookController {


    public static Map<Long, Book> bookMap = new HashMap<>();
    private static long nextId = 1;
    
    //Create new book
    @PostMapping("/books")
    public ResponseEntity<String> createBook(@RequestBody Book book) {
        long id = nextId++;
        book.setId(id);
        bookMap.put(id, book);
        return new ResponseEntity<String>("Book created with ID: " + id, HttpStatus.CREATED);
    }

    //list all books
    @GetMapping("/books")
    public ResponseEntity<Collection> listBooks(){
        return new ResponseEntity<Collection>(bookMap.values(), HttpStatus.OK);
    }

    //get book by id
    

    //delete book by id
    
    
}
