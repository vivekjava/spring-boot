/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Gopal
 */
@Controller
public class Status {
   @RequestMapping("/")
   @ResponseBody
   public String hello() {
      return "Hello Spring Boot";
   }
}
