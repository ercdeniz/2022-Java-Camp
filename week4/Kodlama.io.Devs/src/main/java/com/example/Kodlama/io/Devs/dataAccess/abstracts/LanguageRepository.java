package com.example.Kodlama.io.Devs.dataAccess.abstracts;

import com.example.Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface LanguageRepository {
    List<Language> getall();
    Language getById(int id);
    void add(Language language);
    void delete(int id);
    void update(Language language,int id);
}
