package com.shital.SpringSecurityExample.service;

import com.shital.SpringSecurityExample.model.UserPrincipal;
import com.shital.SpringSecurityExample.model.Users;
import com.shital.SpringSecurityExample.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Users user = repo.findByUsername(username);
        if(user == null)
        {
            System.out.println("User Not Found !!!!");
            throw new UsernameNotFoundException("User not found !!!!");
        }
        return new UserPrincipal(user);
    }
}
