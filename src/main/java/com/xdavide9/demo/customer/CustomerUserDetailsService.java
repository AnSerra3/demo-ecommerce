package com.xdavide9.demo.customer;

import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerUserDetailsService implements UserDetailsService {

    private final CustomerRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        Optional<Customer> customerOptional = repository.findByEmail(username);
        if (customerOptional.isEmpty())
            throw new UsernameNotFoundException(
                    String.format("Could not find customer with email [%s]", username)
            );
        return new CustomerUserDetails(customerOptional.get());
    }
}
