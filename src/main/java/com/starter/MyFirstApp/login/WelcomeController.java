package com.starter.MyFirstApp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

//Get Mapping
@Controller
@SessionAttributes("name")
public class WelcomeController {



    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String gotoWelcomePage(ModelMap model) {
        model.put("name", getLoggedInUsername());
    return "welcome";
    }

    private String getLoggedInUsername() {
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

//    private AuthenticationService authenticationService;
//
//    public LoginController(AuthenticationService authenticationService) {
//        super();
//        this.authenticationService = authenticationService;
//    }

//post Mapping and login parameter model mapping

//    @RequestMapping(value = "login",method = RequestMethod.POST)
//    public String gotoWelcomePage(@RequestParam String name,
//                                  @RequestParam String password,
//                                  ModelMap model) {
//        if (authenticationService.authenticate(name, password)) {
//            model.put("name", name);
//            model.put("password", password);
//            return "welcome";
//        }

        //Authentication
        //name - Chuks (valid username = pass otherwise, return to login page)
        //password - password(same as username)

//        model.put("errorMessage", "Invalid Credentials! Please try again.");
//        return "login";
//    }

}

