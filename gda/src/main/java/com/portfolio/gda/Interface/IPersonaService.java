
package com.portfolio.gda.Interface;

import com.portfolio.gda.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaService extends JpaRepository<Persona,Long>{
    
}
