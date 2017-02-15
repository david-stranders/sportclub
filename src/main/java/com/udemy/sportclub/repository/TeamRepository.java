package com.udemy.sportclub.repository;

import com.udemy.sportclub.model.Team;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Dell on 14-1-2017.
 */
public interface TeamRepository extends CrudRepository<Team, Integer> {

    List<Team> findAllByOrderByNameAsc();

}
