package com.example.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "StudentLogin";
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

    @GetMapping("/dashboard")
    public String dashboard() {
        return "AdminCRUD";
    }

    @PostMapping("/login/student")
    public String processStudentLogin(@RequestParam String username, @RequestParam String password) {
        if (LoginController.CheckStudent(new LoginCredentials(username, password))) {
            return "redirect:/dashboard"; // Redirect to dashboard on success
        }
        return "redirect:/login?error";
    }

    @PostMapping("/login/admin")
    public String processAdminLogin(@RequestParam String username, @RequestParam String password) {
        if (LoginController.CheckAdmin(new LoginCredentials(username, password))) {
            return "redirect:/dashboard";
        }
        return "redirect:/admin?error";
    }
}
