package com.example.Kodlama.io.Devs.business.abstracts;

import com.example.Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageService {
    List<Language> getall();
    Boolean check(Language language);
    Boolean checkName(Language language);
    Boolean checkId(Language language);
    void getName(int id) throws Exception;
    void add(Language language);
    void delete(Language language);
    void update(Language language);
}
