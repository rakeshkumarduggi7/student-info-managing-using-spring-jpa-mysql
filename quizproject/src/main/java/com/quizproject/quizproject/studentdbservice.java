package com.quizproject.quizproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentdbservice {
    @Autowired
    jparepository jparep;

public List<studentdb> getall(){
    return jparep.findAll();
}

    public Optional<studentdb> getbyroll(int roll) {
    return jparep.findById(roll);
    }

    public  void putdata(studentdb sd) {
               jparep.save(sd);

    }

    public void updtdb(studentdb db) {
    jparep.save(db);
    }

    public void deldata(int roll) {
    jparep.deleteById(roll);
    }
}
