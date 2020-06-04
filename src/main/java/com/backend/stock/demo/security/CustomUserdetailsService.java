package com.backend.stock.demo.security;

import com.backend.stock.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.backend.stock.demo.entity.user;
import com.backend.stock.demo.entity.role;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class CustomUserdetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
              boolean   accountNonExpired = true;
              boolean   credentialsNonExpired = true;
              boolean   accountNonLocked = true;
              boolean   authorities = true;

        user user1 = userRepository.findByusername(username);
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(username, user1.getPassword(), user1.isEnable(),
                accountNonExpired,
                credentialsNonExpired,
                accountNonLocked,
                getAuthorities(user1.getRoles()));

        return userDetails;
    }

    private Collection<? extends GrantedAuthority> getAuthorities(List<role> roles) {
        Collection<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>();
        for (role rolee: roles) {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(rolee.getName());
            grantedAuthorities.add(grantedAuthority);
        }
        return grantedAuthorities;
    }
}
