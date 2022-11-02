package com.example.Kodlama.io.Devs.dataAccess.concretes;

import com.example.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.example.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import com.example.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {
    List<Language> languages;


    public InMemoryLanguageRepository() {
        languages= new ArrayList<Language>();
        languages.add(new Language(1,"Java"));
        languages.add(new Language(2,"Python"));
        languages.add(new Language(3,"C#"));
        languages.add(new Language(4,"Php"));
        languages.add(new Language(5,"Java Script"));
        languages.add(new Language(6,"HTML"));
        languages.add(new Language(7,"CSS"));
    }


    @Override
    public List<Language> getall() {
        return languages;
    }


    public Language getById(int id){
        for (Language lng: languages){
            if (lng.getId()==id){
                return lng;
            }
        }
        return null;
    }

    @Override
    public void add(Language language) {
        languages.add(language);
    }

    @Override
    public void delete(int id) {
        languages.remove(getById(id));
    }

    @Override
    public void update(Language language,int id) {
        getById(id).setName(language.getName());
    }
}
