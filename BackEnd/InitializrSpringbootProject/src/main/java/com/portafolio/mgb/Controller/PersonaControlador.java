package com.portafolio.mgb.controller;

import com.portafolio.mgb.Entity.Persona;
import com.portafolio.mgb.service.ImpPersonaService;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;

@RestController
//@RequestMapping("/persona")//localhost:8080/experiencia
//@CrossOrigin(origins={"http://localhost:4200"})
public class PersonaControlador {
    @Autowired ImpPersonaService  iPersonaService;
    
    
    @GetMapping ("/lista")
    public ResponseEntity<List<Persona>> list(){
        List<Persona> list = iPersonaService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<Persona> detail(@PathVariable("id") Long id){
        Persona perso = iPersonaService.getOne(id);
        return new ResponseEntity(perso, HttpStatus.OK);
    }       
    
    @PreAuthorize("hasRole('ADMIN')") //ARREGLAR
    @PostMapping("/persona/create")
    public void save(@RequestBody Persona persona){
        iPersonaService.save(persona);
    }
    
   @PreAuthorize("hasRole('ADMIN')") //ARREGLAR
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        iPersonaService.delete(id);
    }
    
    @PutMapping("/update")
    public void edit(@RequestBody Persona persona){
        iPersonaService.edit(persona);
    }
   
       
}
