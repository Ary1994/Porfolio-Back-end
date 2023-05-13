
package com.porfolio_ary.porfolio_ary.security.Service;

import com.porfolio_ary.porfolio_ary.security.Entity.Rol;
import com.porfolio_ary.porfolio_ary.security.Enums.RolNombre;
import com.porfolio_ary.porfolio_ary.security.Repository.iRolRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    public Optional<Rol>getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    public void save(Rol rol){
        irolRepository.save(rol);
    }
}
