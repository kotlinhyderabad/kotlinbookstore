package kotlinhyderabad.bookstore.controllers

import kotlinhyderabad.bookstore.models.Book
import org.jnosql.artemis.document.DocumentTemplate
import org.jnosql.diana.api.document.DocumentQuery
import org.jnosql.diana.api.document.query.DocumentQueryBuilder.select
import java.util.*
import javax.inject.Inject
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path


@Path("/api/books")
open class BookStoreController {

    @Inject
    var documentTemplate: DocumentTemplate? = null

    @GET
    fun getBook(): MutableList<Book>? {
        val query: DocumentQuery = select().from("book").build()
        return documentTemplate?.select(query)
    }

    @POST
    fun saveBook() : Book? {
        val random = Random()
        val id: Long = random.nextLong()
        val book = Book()
        book.id = id
        book.bookName = "Effective Java"
        book.author = "Joshi Bloch"
        book.publisher = "ORelly"
        return documentTemplate?.insert(book)
    }
}
