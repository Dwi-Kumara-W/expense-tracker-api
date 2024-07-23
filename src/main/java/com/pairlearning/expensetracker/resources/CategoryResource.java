package com.pairlearning.expensetracker.resources;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
public class CategoryResource {

    @GetMapping("")
    public String getAllCategories(HttpServletRequest request) {
        System.out.print("haha");
        int userId = (Integer) request.getAttribute("userId");
        return "Authenticated! userId: "+userId;
    }
}
