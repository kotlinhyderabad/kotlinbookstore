package kotlinhyderabad.bookstore.configuration.database

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.annotation.PostConstruct
import javax.ejb.Singleton
import javax.ejb.Startup
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.inject.se.SeContainer
import javax.enterprise.inject.se.SeContainerInitializer

@ApplicationScoped
@Startup
@Singleton
class DbInitializer {
    val logger: Logger = LoggerFactory.getLogger(DbInitializer::class.java)
    var seContainer: SeContainer?=null

    @PostConstruct
    fun init() {
        try {
            seContainer = SeContainerInitializer.newInstance().initialize()
        } catch (exception: Exception) {
            logger.error("", exception)
        }
    }
}
