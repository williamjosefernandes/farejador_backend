package be.com.mooby.farejador.curso;

import be.com.mooby.farejador.curso.FarejadorCursoApp;
import be.com.mooby.farejador.curso.config.AsyncSyncConfiguration;
import be.com.mooby.farejador.curso.config.EmbeddedElasticsearch;
import be.com.mooby.farejador.curso.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { FarejadorCursoApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
