/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import org.springframework.stereotype.Component;

/**
 *
 * @author avega
 */
@Component("serviceCommon")
public class ServiceCommon {
    
    public String test(){
        return "from test";
    }
}
