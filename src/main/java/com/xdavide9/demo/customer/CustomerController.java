package com.xdavide9.demo.customer;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/api/v1")
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping("/customers")
    public String getCustomers(Model model) {
        model.addAttribute("customers", customerService.getCustomers());
        return "customer";
    }

}
