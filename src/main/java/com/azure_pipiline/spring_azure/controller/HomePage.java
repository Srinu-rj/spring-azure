/**
 * Author: Sreenivasa Raju
 * User:dnsri
 * Date:9/15/2025
 * Time:8:10 PM
 */

package com.azure_pipiline.spring_azure.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {
    @GetMapping("/test")
    public String test(){
        return "Hello All";
    }
    @GetMapping("/wellcome")
    public String wellcome(){
        return "Wellcome to Azure Spring Boot Application";
    }

}
