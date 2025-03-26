package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World update!";
    }

    @GetMapping("/user")
    public String UserPage() {
        return "Only for user!";
    }

    @GetMapping("/admin")
    public String AdminPage() {
        return "Only for admin!";
    }
}