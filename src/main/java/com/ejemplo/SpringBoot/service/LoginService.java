package com.ejemplo.SpringBoot.service;

import com.ejemplo.SpringBoot.model.Login;
import com.ejemplo.SpringBoot.repository.LoginRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService implements ILoginService {

    @Autowired //anotattion que nos permite hacer injección de dependencias
   public  LoginRepository loginRepo;
    
    @Override
    public List<Login> verLogins() {
          return loginRepo.findAll();
    }

    @Override
    public void crearLogin(Login log) {
         loginRepo.save(log);  
    }

    @Override
    public void borrarLogin(Long id) {
         loginRepo.deleteById(id);   
    }

    @Override
    public Login buscarLogin(Long id) {
        return  loginRepo.findById(id).orElse(null);
}
    
    
}
