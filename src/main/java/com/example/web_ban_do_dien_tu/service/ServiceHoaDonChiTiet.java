package com.example.web_ban_do_dien_tu.service;

import com.example.web_ban_do_dien_tu.model.HoaDonChiTiet;
import com.example.web_ban_do_dien_tu.repository.IRePoHoaDon;
import com.example.web_ban_do_dien_tu.repository.IRepoHoaDonChiTiet;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceHoaDonChiTiet implements IServiceHoaDonChiTiet {
    @Autowired
    IRepoHoaDonChiTiet iRepoHoaDonChiTiet;

    @Override
    public List<HoaDonChiTiet> findAll() {
        return (List<HoaDonChiTiet>) iRepoHoaDonChiTiet.findAll();
    }

    @Override
    public HoaDonChiTiet findById(long id) {
        return iRepoHoaDonChiTiet.findById(id).get();
    }

    @Override
    public HoaDonChiTiet save(HoaDonChiTiet hoaDonChiTiet) {
        return iRepoHoaDonChiTiet.save(hoaDonChiTiet);
    }

    @Override
    public void remove(HoaDonChiTiet hoaDonChiTiet) {
        iRepoHoaDonChiTiet.delete(hoaDonChiTiet);

    }
}
