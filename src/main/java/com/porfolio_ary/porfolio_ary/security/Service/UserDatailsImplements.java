
package com.porfolio_ary.porfolio_ary.security.Service;

import com.porfolio_ary.porfolio_ary.security.Entity.Usuario;
import com.porfolio_ary.porfolio_ary.security.Entity.UsuarioPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service

public class UserDatailsImplements implements UserDetailsService{
    @Autowired
    UsuarioService usuarioService; 

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
        return UsuarioPrincipal.biuld(usuario);
    }
}
