
package com.portfolio.gda.Repository;

import com.portfolio.gda.Entity.Persona;
import java.util.List;


public interface IPersonaRepository {
    // traer una lista de personas
    public List<Persona> getPersona();
    
    // Guardar un objeto de tipo Persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto de tipo Persona lo buscamos por id
    public void deletePersona(Long id);
    
    //Buscar una Persona por id
    public Persona findPersona(Long id);
    
}
