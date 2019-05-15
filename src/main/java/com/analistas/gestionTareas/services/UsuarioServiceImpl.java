/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionTareas.services;

import com.analistas.gestionTareas.models.Usuario;
import com.analistas.gestionTareas.models.dao.IUsuarioDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */
@Service
public class UsuarioServiceImpl implements IUsuarioService{
    
@Autowired
private IUsuarioDao usuarioDao;

@Override
@Transactional(readOnly = true)
public List<Usuario> findAll(){
 return usuarioDao.findAll();
}
}
