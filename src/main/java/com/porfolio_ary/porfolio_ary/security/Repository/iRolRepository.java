
package com.porfolio_ary.porfolio_ary.security.Repository;

import com.porfolio_ary.porfolio_ary.security.Entity.Rol;
import com.porfolio_ary.porfolio_ary.security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol,Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
