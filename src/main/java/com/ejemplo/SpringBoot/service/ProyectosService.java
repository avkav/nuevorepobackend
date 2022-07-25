package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Proyectos;
import com.ejemplo.SpringBoot.repository.ProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService implements IProyectosService {

    @Autowired //anotattion que nos permite hacer injección de dependencias
   public  ProyectosRepository proRepo;
    
    @Override
    public List<Proyectos> verProyectos() {
          return proRepo.findAll();
    }

    @Override
    public void crearProyectos(Proyectos pro) {
         proRepo.save(pro);  
    }

    @Override
    public void borrarProyectos(Long id) {
         proRepo.deleteById(id);   
    }

    @Override
    public Proyectos buscarProyectos(Long id) {
        return  proRepo.findById(id).orElse(null);
}

     
}