package com.kpaydeveloper.aplikasimarbot.service;

import com.kpaydeveloper.aplikasimarbot.model.Country;
import com.kpaydeveloper.aplikasimarbot.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

    // kita menampilkan list dengan mereturn nilainya
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries(){
        return  countryRepository.findAll();
    }

    // save data baru
    public void save(Country country) {
        countryRepository.save(country);
    }


    //get by id
    public Optional<Country> findById(int id) {
        return countryRepository.findById(id);
    }

    public void delete(Integer id) {
        countryRepository.deleteById(id);
    }

}
