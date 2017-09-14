package com.davidstranders.sportclub.repository;

import com.davidstranders.sportclub.model.Game;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by DS on 4-2-2017.
 */
public interface GameRepository extends CrudRepository<Game, String> {

    List<Game> findAllByOrderByDateAsc();

    List<Game> findAllByCompetitionIdOrderByDateAsc (String id);

    List<Game> findAllByLocationId (String id);


}
