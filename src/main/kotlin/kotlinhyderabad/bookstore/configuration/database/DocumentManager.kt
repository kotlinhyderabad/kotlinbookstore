package kotlinhyderabad.bookstore.configuration.database

import org.jnosql.diana.api.Settings
import org.jnosql.diana.api.document.DocumentCollectionManager
import org.jnosql.diana.api.document.DocumentCollectionManagerFactory
import org.jnosql.diana.mongodb.document.MongoDBDocumentCollectionManager
import org.jnosql.diana.mongodb.document.MongoDBDocumentConfiguration
import java.util.*
import javax.annotation.PostConstruct
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.inject.Produces


@ApplicationScoped
class DocumentManager {

    private val COLLECTION = "bookstore"

    private lateinit var managerFactory: DocumentCollectionManagerFactory<MongoDBDocumentCollectionManager>

    @PostConstruct
    fun init(): Unit {
        val configuration = MongoDBDocumentConfiguration()
        val settings = Collections.singletonMap<String, Any>("mongodb-server-host-1", "localhost:27017")
        managerFactory = configuration.get(Settings.of(settings))
    }

    @Produces
    fun getManager(): DocumentCollectionManager? {
        return managerFactory[COLLECTION]
    }
}