package br.edu.ifrn.ecociclo.controller;

import br.edu.ifrn.ecociclo.dto.LoginDTO;
import br.edu.ifrn.ecociclo.service.AuthService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService service;

    @PostMapping("/login")
    public void login(HttpServletResponse response, @RequestBody LoginDTO loginDTO) {
        service.attempLogin(response, loginDTO.email(), loginDTO.password());
    }

}
