package kotlinhyderabad.bookstore.models

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Book (
        @Id
        var id: String = "",
        var bookName: String = "",
        var bookDesc: String = "",
        var author: String = "",
        var publisher: String = "",
        var bookImageUri: String = "",
        var isbn: String = "",
        var rating: String = ""
)
