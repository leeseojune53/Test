package com.example.fakelogin.Controller;

import com.example.fakelogin.Payload.Request.LoginRequest;
import com.example.fakelogin.Service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @GetMapping("/login")
    public String loginView(){
        return "main";
    }

    @PostMapping("/login")
    public String login(LoginRequest request){
        return loginService.login(request);
    }
}
