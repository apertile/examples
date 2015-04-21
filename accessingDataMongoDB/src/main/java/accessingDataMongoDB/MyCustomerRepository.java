package accessingDataMongoDB;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//@RepositoryRestResource indica a Spring MVC que cree un RESTful endpoint en /people
@RepositoryRestResource(collectionResourceRel = "people", path = "people")
public interface MyCustomerRepository extends MongoRepository<MyCustomer, String> {

    public MyCustomer findByFirstName(String firstName);
    public List<MyCustomer> findByLastName(String lastName);

}
