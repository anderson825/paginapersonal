/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoMysql;

import appjava.modelo.Persona;
import java.util.ArrayList;

/**
 *
 * @author Mauro
 */
public class DAO {
    private ArrayList<Persona> listadoPersonas;
    
     public DAO(){
        listadoPersonas = new ArrayList<>();
    }

    public ArrayList<Persona> getListadoPersonas() {
        return listadoPersonas;
    }

    public void setListadoPersonas(ArrayList<Persona> listadoPersonas) {
        this.listadoPersonas = listadoPersonas;
    }
   public int obtenerCantidadPersonas(){
       return listadoPersonas.size();
   }
   public boolean adicionar(Persona p){
       return this.listadoPersonas.add(p);
   }
   
    
}
