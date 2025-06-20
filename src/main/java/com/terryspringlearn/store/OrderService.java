package com.terryspringlearn.store;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// this annotation defines this class as a bean for the IOC container
// for information on beans, see StoreApplication.java
// there are 4 types of annotations for beans:
// @Component - for general object, usually used for utility classes
// @Service - object related to business logic
// @Repository - object that interacts with a database
// @Controller - making controller classes for handling web requests
//     see an implementation of @Controller in HomeController.java
@Service
public class OrderService {
    private PaymentServiceInterface paymentService;

    // note that the paymentService here is an interface object
    // this will mess up springboot's logic in creating a bean
    // to solve this problem, we need to add an annotation to the classes
    // that are related to this interface
    // see the annotation in PaypalPaymentService.java for an example
    //@Autowired
    // if there are more than 1 constructor defined in a bean class
    // the constructor that we what IOC container to use should have
    // the annotation @Autowired
    // in older versions of springboot, this annotation is needed
    // even if there is only 1 constructor
    public OrderService(PaymentServiceInterface paymentService) {
        this.paymentService = paymentService;
    }

    public void placeOrder() {
        paymentService.processPayment(10.00);
    }

    public void setPaymentService(PaymentServiceInterface paymentService) {
        this.paymentService = paymentService;
    }
}
