/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.dao;

import com.mycompany.Modelo.ModeloTO;
import java.util.List;


/**
 *
 * @author INTEL
 */
public interface MichiDaoI {
    public List listarResultados();
    public int create(ModeloTO re);
    
}
