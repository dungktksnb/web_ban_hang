package com.example.web_ban_do_dien_tu.service;

import com.example.web_ban_do_dien_tu.model.HoaDon;
import com.example.web_ban_do_dien_tu.model.NguoiDung;

import java.util.List;

public interface IServiceNguoiDung {
    List<NguoiDung> findAll();

    NguoiDung findById(long id);

    NguoiDung save(NguoiDung nguoiDung);

    void remove(NguoiDung nguoiDung);
}
