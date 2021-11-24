/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
/**
 *
 * @author yumii
 */
public class Administrador {
    /**
     * Método constructor
     */
    public Administrador() {
    }
    
    /**
     * Funcionamiento: Valida los datos del administrador, para saber si se ingresó de manera
     * corresta el usuario y contraseña.
     * Entradas.
     * @param login
     * @param pwd
     * Salidas: boolean
     * @return 
     */
    public boolean validarAdm(String login, String pwd){
        return login.equals(IConstantes.userAdm) && pwd.equals(IConstantes.pwdAdm);
    }
}
