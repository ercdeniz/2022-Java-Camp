package com.example.Kodlama.io.Devs.business.concretes;

import com.example.Kodlama.io.Devs.business.abstracts.LanguageService;
import com.example.Kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import com.example.Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements LanguageService {
    private LanguageRepository languageRepository;

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getall() {
        return languageRepository.getall();
    }

    @Override
    public Boolean check(Language language) {
        if (!checkName(language)) {
            return false;
        }
        if (!checkId(language)) {
            return false;
        }
        return true;
    }

    @Override
    public Boolean checkName(Language language) {
        for (Language lng : languageRepository.getall()) {
            if (!lng.getName().isEmpty()) {
                return true;
            }
            if (!lng.getName().equalsIgnoreCase(language.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean checkId(Language language) {
        for (Language lng : languageRepository.getall()) {
            if (!(lng.getId() == language.getId())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void getName(int id) throws Exception{
        for (Language lng : languageRepository.getall()) {
            if (lng.getId() == id) {
                System.out.println(lng.getName());
                break;
            }else {
                throw new Exception("Invalid Id");
            }
        }
    }

    @Override
    public void add(Language language) {
        if (check(language)) {
            System.out.println("Language Added: " + language.getName());
        }
    }

    @Override
    public void delete(Language language) {
        if (check(language)) {
            System.out.println("Language Deleted: " + language.getName());
        }
    }

    @Override
    public void update(Language language) {
        if (check(language)) {
            System.out.println("Language Updated: " + language.getName());
        }
    }
}
