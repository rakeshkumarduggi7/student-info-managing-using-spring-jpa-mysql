package com.quizproject.quizproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class studentmanagementcontroller {
@Autowired
studentdbservice sdbs;
    @GetMapping("/all")
    public List<studentdb> testboot(){
        return  sdbs.getall();
    }
    @GetMapping("/{roll}")
    public Optional<studentdb> getbyroll(@PathVariable int roll){
        return sdbs.getbyroll(roll);
    }
    @PostMapping("/add")
    public void putdata(@RequestBody studentdb sd) {
        System.out.println("Received Data -> Roll: " + sd.getRollno() + ", Name: " + sd.getName() + ", Branch: " + sd.getBranch());
        sdbs.putdata(sd);
    }

    @PutMapping("/update")
    public void update(@RequestBody studentdb db){
        sdbs.updtdb(db);
    }
    @DeleteMapping("/delete/{roll}")
    public void del(@PathVariable int roll){
        sdbs.deldata(roll);
    }

}
