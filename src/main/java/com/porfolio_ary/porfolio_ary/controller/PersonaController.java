
package com.porfolio_ary.porfolio_ary.controller;

import com.porfolio_ary.porfolio_ary.model.Persona;
import com.porfolio_ary.porfolio_ary.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = {"http://localhost:4200"})
public class PersonaController {
    @Autowired
    private IPersonaService interPersona;
    @GetMapping("/personas/traer")
    public List<Persona> getPersonas(){
        return interPersona.getPersonas();
    }
    @PostMapping("/personas/crear")
    public String createStudent(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        return "La persona fue creada correctamente";
    }
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        interPersona.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                              @RequestParam("nombre")String nuevoNombre,
                              @RequestParam("apellido")String nuevoApellido,
                              @RequestParam("acercaDe")String nuevoacercaDe,
                              @RequestParam("titulo1")String nuevotitulo1,
                              @RequestParam("titulo2")String nuevotitulo2,
                              @RequestParam("img")String nuevoing,
                              @RequestParam("cumple")String nuevocuample,
                              @RequestParam("telefono")String nuevotelefono,
                              @RequestParam("edad")int nuevoedad,
                              @RequestParam("email")String nuevoemail
                                ){
        Persona perso=interPersona.findPersona(id);
        perso.setApellido(nuevoApellido);
        perso.setAcercaDe(nuevoacercaDe);
        perso.setNombre(nuevoNombre);
        perso.setCumple(nuevocuample);
        perso.setEdad(nuevoedad);
        perso.setEmail(nuevoemail);
        perso.setTitulo1(nuevotitulo1);
        perso.setTitulo2(nuevotitulo2);
        perso.setImg(nuevoing);
        perso.setTelefono(nuevotelefono);
        interPersona.savePersona(perso);
        return  perso;
    }
    @GetMapping("personas/traer/perfil")
    public Persona findPersona(){
        return interPersona.findPersona((long)1);
    }
}
