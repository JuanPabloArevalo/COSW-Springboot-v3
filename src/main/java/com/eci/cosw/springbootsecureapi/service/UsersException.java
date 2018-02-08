/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.springbootsecureapi.service;

/**
 *
 * @author hcadavid
 */
public class UsersException extends Exception{

    public UsersException(String message) {
        super(message);
    }

    public UsersException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
