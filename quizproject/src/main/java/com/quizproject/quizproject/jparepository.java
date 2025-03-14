package com.quizproject.quizproject;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jparepository extends JpaRepository<studentdb,Integer> {
}
