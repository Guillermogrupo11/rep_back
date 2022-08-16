
package com.portfolio.gda.Service;

import com.portfolio.gda.Entity.Persona;
import com.portfolio.gda.Interface.IPersonaService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonaService implements IPersonaService {
   
    @Override
    public List<Persona> getPersona(){
        throw new UnsupportedOperationException("No supported yet.");
    }
    
    @Override
    public void savePersona(Persona persona){
        throw new UnsupportedOperationException("No supported yet.");
    }
    @Override
    public void deletePersona(Long id){
        throw new UnsupportedOperationException("No supported yet.");
    }
    @Override
    public Persona findPersona(Long id){
        throw new UnsupportedOperationException("No supported yet.");
    }
}
