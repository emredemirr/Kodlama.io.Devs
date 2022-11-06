package Kodlama.io.Devs.Business.Abstracts;

import Kodlama.io.Devs.Entities.Concrete.Language;

import java.util.List;

public interface LanguageService
{
    List<Language> getAll();
    Language getById(int id) throws Exception;
    void add(Language language) throws Exception;
    void update(Language language, int id) throws Exception;
    void delete(int id) throws Exception;
}
