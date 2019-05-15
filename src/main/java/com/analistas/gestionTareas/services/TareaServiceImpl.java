/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionTareas.services;

import com.analistas.gestionTareas.models.Tarea;
import com.analistas.gestionTareas.models.dao.ITareaDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Usuario
 */

@Service
public class TareaServiceImpl implements ITareaService{
    
 @Autowired
 private ITareaDao tareaDao;

@Override
@Transactional(readOnly = true)
public List<Tarea> findAll(){
 return tareaDao.findAll();
}
}
