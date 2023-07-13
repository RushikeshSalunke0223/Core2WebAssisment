package com.example.ExamPortal.Backend.model;


import org.springframework.security.core.GrantedAuthority;


@SuppressWarnings("serial")
public class Authority implements GrantedAuthority {

    private String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority;
    }

}
