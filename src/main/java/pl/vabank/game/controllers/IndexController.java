package pl.vabank.game.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * klasa IndexController
 * adnotacja @GetMapping("") wskazuje, że po otrzymaniu żądania HTTP GET skierowanego do katalogu głównego
 * ścieżki tj. do http://localhost:8080/ metoda viewHomePage() powinna zostać użyta do obsługi żądania
 * 
 * metoda viewHomePage() zwraca nazwę widoku do wyświetlenia
 */

@Controller
public class IndexController {
    @GetMapping("")
    public String viewHomePage() {
        return "home";
    }

}
