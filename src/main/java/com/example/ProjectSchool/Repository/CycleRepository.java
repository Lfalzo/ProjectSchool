package com.example.ProjectSchool.Repository;

import com.example.ProjectSchool.model.Cycle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface CycleRepository extends CrudRepository<Cycle, String> {
}
