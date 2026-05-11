package ru.mtuci.coursemanagement.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
// import ru.mtuci.coursemanagement.service.PluginLoader;  // Временно отключено

@Controller
@RequiredArgsConstructor
public class IndexController {
    // private final PluginLoader loader;  // Временно отключено

    @GetMapping("/")
    public String index(Model model) {
        // loader.tryLoad();  // Временно отключено
        return "index";
    }
}