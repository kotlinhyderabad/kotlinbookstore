package kotlinhyderabad.bookstore.models

import org.jnosql.artemis.Column
import org.jnosql.artemis.Entity
import org.jnosql.artemis.Id

@Entity("book")
data class Book (
        @Id("id")
        var id: Long = 0L,

        @Column
        var bookName: String = "",

        @Column
        var bookDesc: String = "",

        @Column
        var author: String = "",

        @Column
        var publisher: String = "",

        @Column
        var bookImageUri: String = "",

        @Column
        var isbn: String = "",

        @Column
        var rating: String = ""
)
