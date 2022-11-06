package Kodlama.io.Devs.DataAccess.Abstracts;

import Kodlama.io.Devs.Entities.Concrete.Language;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LanguageRepository
{
    List<Language> getAll();
    Language getById(int id) throws Exception;
    void add(Language language) throws Exception;
    void update(Language language, int id) throws Exception;
    void delete(int id) throws Exception;

}
