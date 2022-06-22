package pl.vabank.game.access;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.vabank.game.data.QuestionsData;
// import org.springframework.data.repository.CrudRepository;


//// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
//// CRUD refers Create, Read, Update, Delete

/**
 * interfejs QuestionsRepository rozszerza interfejs JpaRepository, który posiada 2 typy 
 * jako parametry: typ encji (w tym przypadku QuestionsData) oraz typ jej identyfikatora (w tym przypadku Long)
 */

public interface QuestionsRepository extends JpaRepository<QuestionsData, Long>{
 

}
