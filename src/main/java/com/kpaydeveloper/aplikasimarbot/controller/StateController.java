package com.kpaydeveloper.aplikasimarbot.controller;

import com.kpaydeveloper.aplikasimarbot.model.State;
import com.kpaydeveloper.aplikasimarbot.service.StateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {

    // 1 kita injek data si servicenya

    StateService stateService;
    // kita get listnya
    @GetMapping("/states")
    public String getStates(Model model) {
        List<State> stateList = stateService.getState();

        model.addAttribute("state", stateList);
        return "state";
    }

    // kita save datanya

    @PostMapping("/states/addNew")
    public String addNew(State state){
        stateService.save(state);
        return "redirect:/states";
    }

    // find by id

    @RequestMapping("states/findById")
    @ResponseBody
    public Optional<State> findById(int id ) {
        return stateService.findById(id);
    }

    // kita update data

    @RequestMapping(value = "/states/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(State state) {
        stateService.save(state);
        return "redirect:/states";
    }

    // delete

    @RequestMapping(value = "/states/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        stateService.delete(id);
        return "redirect:/states";
    }
}
