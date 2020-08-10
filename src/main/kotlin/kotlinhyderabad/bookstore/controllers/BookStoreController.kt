package kotlinhyderabad.bookstore.controllers

import kotlinhyderabad.bookstore.models.Book
import javax.ws.rs.GET
import javax.ws.rs.Path

@Path("/api/books")
public class BookStoreController {

    @GET
    public fun getBook(): Book {
        return Book()
    }
}