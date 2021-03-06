package com.example.web_ban_do_dien_tu.service;

import com.example.web_ban_do_dien_tu.model.NguoiDung;
import com.example.web_ban_do_dien_tu.repository.IRepoNguongDung;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceNguoiDung implements IServiceNguoiDung{
    @Autowired
    IRepoNguongDung iRepoNguongDung;
    @Override
    public List<NguoiDung> findAll() {
        return (List<NguoiDung>) iRepoNguongDung.findAll();
    }

    @Override
    public NguoiDung findById(long id) {
        return iRepoNguongDung.findById(id).get();
    }

    @Override
    public NguoiDung save(NguoiDung nguoiDung) {
        return iRepoNguongDung.save(nguoiDung);
    }

    @Override
    public void remove(NguoiDung nguoiDung) {
        iRepoNguongDung.delete(nguoiDung);

    }
}
