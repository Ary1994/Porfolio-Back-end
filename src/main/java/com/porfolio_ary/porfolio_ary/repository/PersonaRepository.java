
package com.porfolio_ary.porfolio_ary.repository;
import com.porfolio_ary.porfolio_ary.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long>{
    
}