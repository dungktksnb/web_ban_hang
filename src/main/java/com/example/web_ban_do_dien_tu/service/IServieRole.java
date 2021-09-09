package com.example.web_ban_do_dien_tu.service;

import com.example.web_ban_do_dien_tu.model.Role;

import java.util.List;

public interface IServieRole {
    List<Role> findAll();

    Role findById(long id);

    Role save(Role role);

    void remove(Role role);
}
