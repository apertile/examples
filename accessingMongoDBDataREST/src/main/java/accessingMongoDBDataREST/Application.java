package accessingMongoDBDataREST;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
//Activa MongoDB y Spring Data Mongo crea una implementación de MyCustomerRepository.
//Usa el query language Cypher
@EnableMongoRepositories
//Importa controllers MVC, JSON converters, etc. para proveer un front-end REST
@Import(RepositoryRestMvcConfiguration.class)
//Cambia hacia comportamiento por default dependiendo de las variables del classpath
@EnableAutoConfiguration
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
