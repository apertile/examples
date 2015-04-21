package accessingDataMongoDB;

import org.springframework.data.annotation.Id;


public class MyCustomer {

    @Id
    private String id;

    private String firstName;
    private String lastName;

    public MyCustomer() {}

    public MyCustomer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

}
