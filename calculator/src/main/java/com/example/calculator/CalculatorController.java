package com.example.calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    // Home page ki mapping
    @GetMapping("/")
    public String home() {
        return "index"; // index.html page render
    }

    // Addition calculation
    @GetMapping("/add")
    public String add(@RequestParam int num1, @RequestParam int num2, Model model) {
        int result = num1 + num2;
        model.addAttribute("result", result); // Add result to model
        return "result"; // Redirect to result page
    }

    // Subtraction calculation
    @GetMapping("/subtract")
    public String subtract(@RequestParam int num1, @RequestParam int num2, Model model) {
        int result = num1 - num2;
        model.addAttribute("result", result); // Add result to model
        return "result"; // Redirect to result page
    }

    // Multiplication calculation
    @GetMapping("/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2, Model model) {
        int result = num1 * num2;
        model.addAttribute("result", result); // Add result to model
        return "result"; // Redirect to result page
    }

    // Division calculation
    @GetMapping("/divide")
    public String divide(@RequestParam double num1, @RequestParam double num2, Model model) {
        double result = (num2 != 0) ? num1 / num2 : 0; // Handle division by zero
        model.addAttribute("result", result); // Add result to model
        return "result"; // Redirect to result page
    }
}
