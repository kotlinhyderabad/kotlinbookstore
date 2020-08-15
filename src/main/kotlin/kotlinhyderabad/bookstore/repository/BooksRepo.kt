package kotlinhyderabad.bookstore.repository

import kotlinhyderabad.bookstore.models.Book
import org.jnosql.artemis.Repository

interface BooksRepo: Repository<Book, String> {

}
