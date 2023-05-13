
package com.porfolio_ary.porfolio_ary.service;

import com.porfolio_ary.porfolio_ary.model.Persona;
import com.porfolio_ary.porfolio_ary.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {
    @Autowired
    private PersonaRepository persoRepository;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersona=persoRepository.findAll();
        return listaPersona;
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepository.save(perso);
    }

    @Override
    public void deletePersona(Long id) {
        persoRepository.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso=persoRepository.findById(id).orElse(null);
        return perso;
    }
}
