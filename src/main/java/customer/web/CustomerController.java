package customer.web;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import customer.domain.Customer;

@RestController
public class CustomerController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/customer")
    public Customer customer() {
        return new Customer(counter.incrementAndGet(),
                            "Aravind",
                            "Rajamani");
    }
}