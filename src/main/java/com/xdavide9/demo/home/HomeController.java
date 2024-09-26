package com.xdavide9.demo.home;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@AllArgsConstructor
public class HomeController {

    private final HomeService homeService;

    @GetMapping("home")
    public String getHomePage(Model model) {
        model.addAttribute("best_sellers", homeService.getBestSellers());
        return "home";
    }
}
