package com.ecom.api.controllers;

import com.ecom.api.dto.AuthRequest;
import com.ecom.api.entity.User;
import com.ecom.api.services.JwtUserDetailsService;
import com.ecom.api.services.UserServiceImpl;
import com.ecom.api.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;
//    @Autowired
//    private AuthenticationManager authenticationManager;
    @PostMapping("/signup")
    public ResponseEntity<String> userSignUp(@RequestBody User user){
        userService.signup(user);
        return ResponseEntity.ok("You have registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AuthRequest authRequest) {
//        Authentication authentication = authent(
//                new UsernamePasswordAuthenticationToken(authRequest.getUsername(),
//                        authRequest.getPassword())
//        );
//        SecurityContextHolder.getContext().setAuthentication(authentication);
//        UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(authRequest.getUsername());
//        String token = jwtTokenUtil.generateToken(userDetails);
        return ResponseEntity.ok("token");
    }
}
