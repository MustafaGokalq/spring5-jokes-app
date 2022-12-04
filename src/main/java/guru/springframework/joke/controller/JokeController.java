package guru.springframework.joke.controller;

import guru.springframework.joke.services.JokeServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {
    private final JokeServices jokeService;

    public JokeController(JokeServices jokeService) {
        this.jokeService = jokeService;
    }


    @RequestMapping({"/",""})
    public String showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }
}
