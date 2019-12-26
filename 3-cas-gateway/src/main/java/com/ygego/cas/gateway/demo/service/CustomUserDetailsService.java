package com.ygego.cas.gateway.demo.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;


public class CustomUserDetailsService implements UserDetailsService {


    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("当前的用户名是：" + username);
        // 通过校验器获取的用户名，
        // 如果想要获取更多的用户信息，则需要查询数据库获取更多用户信息（例如角色等）
        List<GrantedAuthority> authorities=new ArrayList();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new User(username, ""  , authorities);
    }

}
