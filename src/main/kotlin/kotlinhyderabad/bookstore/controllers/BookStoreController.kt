package kotlinhyderabad.bookstore.controllers

import kotlinhyderabad.bookstore.configuration.database.DbInitializer
import kotlinhyderabad.bookstore.models.Book
import kotlinhyderabad.bookstore.repository.BooksRepo
import org.jnosql.artemis.Database
import org.jnosql.artemis.DatabaseType
import javax.annotation.PostConstruct
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path

@Path("/api/books")
open class BookStoreController {

    private var booksRepo: BooksRepo ?= null

    @Inject
    lateinit var dbInitializer: DbInitializer

    @GET
    fun getBook(): Book {
        return Book()
    }

    @POST
    fun saveBook() : Book? {
        val book = Book()
        book.bookName = "Effective Java"
        book.author = "Joshi Bloch"
        book.publisher = "ORelly"
        return booksRepo?.save(book)
    }
}
