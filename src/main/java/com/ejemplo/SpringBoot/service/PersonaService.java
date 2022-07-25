package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Persona;
import com.ejemplo.SpringBoot.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired //anotattion que nos permite hacer injección de dependencias
   public  PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersonas() {
          return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
         persoRepo.save(per);  
    }

    @Override
    public void borrarPersona(Long id) {
         persoRepo.deleteById(id);   
    }

    @Override
    public Persona buscarPersona(Long id) {
        return  persoRepo.findById(id).orElse(null);
}
    
    
}
// min 1 22 37
//error, no se muestra la opción de importar los métodos abstractos en IPersonaService