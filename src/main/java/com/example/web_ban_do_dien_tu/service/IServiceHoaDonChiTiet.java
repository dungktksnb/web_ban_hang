package com.example.web_ban_do_dien_tu.service;

import com.example.web_ban_do_dien_tu.model.HoaDon;
import com.example.web_ban_do_dien_tu.model.HoaDonChiTiet;

import java.util.List;

public interface IServiceHoaDonChiTiet {
    List<HoaDonChiTiet> findAll();

    HoaDonChiTiet findById(long id);

    HoaDonChiTiet save(HoaDonChiTiet hoaDonChiTiet);

    void remove(HoaDonChiTiet hoaDonChiTiet);
}
