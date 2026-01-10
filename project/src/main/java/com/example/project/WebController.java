package com.example.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "StudentLogin"; // Default to student login
    }

    @GetMapping("/login")
    public String login() {
        return "StudentLogin";
    }

    @GetMapping("/register")
    public String register() {
        return "StudentReg";
    }

    @GetMapping("/admin")
    public String adminLogin() {
        return "AdminLogin";
    }
    
    // Serve styles explicitly if needed (though Spring Boot static resources usually handle this if placed correctly)
    // Since Styles.css is in templates, we might not reach it via /Styles.css unless we move it or add a resource handler.
    // However, simplest fix for a "clean up" is to move Styles.css to static.
}
