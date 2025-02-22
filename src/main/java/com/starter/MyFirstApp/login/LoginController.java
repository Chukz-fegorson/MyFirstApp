package com.starter.MyFirstApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

//Get Mapping
@Controller
@SessionAttributes("name")
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        super();
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String gotoLoginPage() {
    return "login";
    }

    //post Mapping and login parameter model mapping

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name,
                                  @RequestParam String password,
                                  ModelMap model) {
        if (authenticationService.authenticate(name, password)) {
            model.put("name", name);
//            model.put("password", password);
            return "welcome";
        }

        //Authentication
        //name - chuks (valid username = pass otherwise, return to login page)
        //password - password(same as username)

        model.put("errorMessage", "Invalid Credentials! Please try again.");
        return "login";
    }

}

