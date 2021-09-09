package com.example.web_ban_do_dien_tu.service;

import com.example.web_ban_do_dien_tu.model.Role;
import com.example.web_ban_do_dien_tu.repository.IRePoRole;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceRole implements IServieRole{
    @Autowired
    IRePoRole iRePoRole;
    @Override
    public List<Role> findAll() {
        return (List<Role>) iRePoRole.findAll();
    }

    @Override
    public Role findById(long id) {
        return iRePoRole.findById(id).get();
    }

    @Override
    public Role save(Role role) {
        return iRePoRole.save(role);
    }

    @Override
    public void remove(Role role) {
        iRePoRole.delete(role);

    }
}
