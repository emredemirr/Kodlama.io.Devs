package Kodlama.io.Devs.WebApi.Controllers;

import Kodlama.io.Devs.Business.Abstracts.LanguageService;
import Kodlama.io.Devs.Entities.Concrete.Language;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController
{
    private LanguageService languageService;

    @Autowired
    public LanguagesController(LanguageService languageService)
    {
        this.languageService = languageService;
    }

    @GetMapping("/getAll")
    public List<Language> getAll()
    {
        return languageService.getAll();
    }

    @GetMapping("/{id}")
    public Language getById(@PathVariable() int id) throws Exception
    {
        return languageService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody Language language) throws Exception
    {
        languageService.add(language);
    }

    @PutMapping("/update")
    public void update(@RequestBody Language language,@PathVariable int id) throws Exception
    {
        languageService.update(language,id);
    }

    @DeleteMapping("/delete/id={id}")
    public void delete(@PathVariable(name = "id") int id) throws Exception
    {
        languageService.delete(id);
    }
}