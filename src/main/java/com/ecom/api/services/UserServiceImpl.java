package com.ecom.api.services;

import com.ecom.api.entity.User;
import com.ecom.api.repositary.UserRepo;
import com.ecom.api.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

//    @Autowired
//    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUserDetailsService jwtUserDetailsService;
    @Autowired
    UserRepo userRepo;

    @Override
    public void signup(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        userRepo.save(user);
    }

//    @Override
//    public String login(String username, String password) {
//        try {
//            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
//        }catch (BadCredentialsException e){
//            throw new RuntimeException("Invalid Exception");
//        }
//        final UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(username);
//        return jwtTokenUtil.generateToken(userDetails);
//    }
}
