/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.analistas.gestionTareas.services;

import com.analistas.gestionTareas.models.Usuario;
import java.util.List;

/**
 *
 * @author Usuario
 */
public interface IUsuarioService {
    public List<Usuario>findAll();
}
