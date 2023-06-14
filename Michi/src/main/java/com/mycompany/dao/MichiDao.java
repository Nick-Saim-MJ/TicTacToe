/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mycompany.ConnS.ConnS;
import com.mycompany.Modelo.ModeloTO;


/**
 *
 * @author INTEL
 */
public class MichiDao implements MichiDaoI{
    ConnS intance=ConnS.getInstance();
    Connection conexion=intance.getConnection();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public java.util.List listarResultados() {
        java.util.List<ModeloTO> lista = new ArrayList();
        String sql = "select * from resultados";
        try {
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ModeloTO to = new ModeloTO();
                to.setIdResultado(rs.getInt("id_resultado"));
                to.setNombrePartida(rs.getString("nombre_partida"));
                to.setNombreJugador1(rs.getString("nombre_jugador1"));
                to.setNombreJugador2(rs.getString("nombre_jugador2"));
                to.setGanador(rs.getString("ganador"));
                to.setPunto(rs.getInt("punto"));
                to.setEstado(rs.getString("estado"));

                lista.add(to);
            }

        } catch (Exception e) {
        }
        return lista;
    }
    
    @Override
    public int create(ModeloTO re) {
        int exec=0;
        int i=0;
        String sql= "Insert INTO resultados(nombre_partida, nombre_jugador1, nombre_jugador2, ganador, punto, estado) VALUES(?, ?, ?,?, ?,?)";
        try {
            ps=conexion.prepareStatement(sql);
            ps.setString(++i, re.getNombrePartida());
            ps.setString(++i, re.getNombreJugador1());
            ps.setString(++i, re.getNombreJugador2());
            ps.setString(++i, re.getGanador());
            ps.setInt(++i, re.getPunto());
            ps.setString(++i, re.getEstado());

            
            exec=ps.executeUpdate();
        } catch (Exception e) {
        }
        return exec;
    }

}
