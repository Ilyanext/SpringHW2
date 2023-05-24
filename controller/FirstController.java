package ru.skypro.homework.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.homework.service.CounterService;


@RestController
@RequestMapping
public class FirstController {
    private final CounterService counterService;

    public FirstController(CounterService counterService) {
        this.counterService = counterService;
    }

    @GetMapping
    public String showHelloWorld() {
        return "Hello World";
    }

    @GetMapping("/counter")
    public String showCounter() {
        return counterService.showCounter();
    }
}
