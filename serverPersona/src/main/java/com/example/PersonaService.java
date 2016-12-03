/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import com.example.stubs.Persona;
import org.springframework.stereotype.Component;

/**
 *
 * @author avega
 */
@Component("PersonaService")
public class PersonaService implements Persona{

    @Override
    public String getPersona(String name, Integer age) {
        return "Hola "+name+", tu edad es: "+age;
    }
    
}
