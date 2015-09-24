package customer.domain;

public class Customer {

    private final long memberId;
    private final String firstName;
    private final String lastName;

    public Customer(long memberId, String firstName, String lastName) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getMemberId() {
        return memberId;
    }

    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
}