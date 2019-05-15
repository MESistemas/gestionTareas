/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionTareas.models.dao;

import com.analistas.gestionTareas.models.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 */
public interface ITareaDao extends JpaRepository<Tarea, Integer> {
    
}
