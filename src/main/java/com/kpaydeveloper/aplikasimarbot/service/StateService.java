package com.kpaydeveloper.aplikasimarbot.service;

import com.kpaydeveloper.aplikasimarbot.model.State;
import com.kpaydeveloper.aplikasimarbot.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    // kita menampilkan list data

    @Autowired
    private StateRepository stateRepository;

    // menampilkan list

    public List<State> getState(){
        return stateRepository.findAll();
    }
    // save data
    public void save(State state){
        stateRepository.save(state);
    }

    // delete data
    public void delete(Integer id) {
        stateRepository.deleteById(id);
    }

    // get data by id
    public Optional<State> findById(Integer id){
        return stateRepository.findById(id);
    }
}
