package com.jp.cokking_album.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jp.cokking_album.dto.Users;
import com.jp.cokking_album.repository.UsersMapper;
import com.jp.cokking_album.security.MyUserDetails;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UsersMapper usersMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = usersMapper.findByName(username);
        if(user != null) {
            System.out.print(user.getName() + "でログインしようとしている");
            return new MyUserDetails(user);
        }
        throw new UsernameNotFoundException("not found :" + username);
    }

}
