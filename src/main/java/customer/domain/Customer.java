package customer.domain;

public class Customer {

    private final long brinkerMemberId;
    private final String firstName;
    private final String lastName;

    public Customer(long brinkerMemberId, String firstName, String lastName) {
        this.brinkerMemberId = brinkerMemberId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getBrinkerMemberId() {
        return brinkerMemberId;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
}