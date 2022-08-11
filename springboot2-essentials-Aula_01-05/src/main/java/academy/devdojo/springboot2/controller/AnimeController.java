package academy.devdojo.springboot2.controller;

import academy.devdojo.springboot2.domain.Anime;
import academy.devdojo.springboot2.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/anime")
@Log4j2
@RequiredArgsConstructor
public class AnimeController {

    private final DateUtil dateUtil;

    @GetMapping("")
    public String home (){
        log.info(dateUtil.formatLocalDateTimaToDatabaseStyle(LocalDateTime.now()));
        return "Bem vindo deu certo";
    }

    @GetMapping("/list")
    public List<Anime> list (){
        return List.of(new Anime("Naruto"),new Anime("Dragon Ball"));
    }
}
