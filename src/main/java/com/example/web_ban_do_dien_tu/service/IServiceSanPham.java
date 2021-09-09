package com.example.web_ban_do_dien_tu.service;

import com.example.web_ban_do_dien_tu.model.SanPham;

import java.util.List;

public interface IServiceSanPham {
    List<SanPham> findAll();

    SanPham findById(long id);

    SanPham save(SanPham sanPham);

    void remove(SanPham sanPham);
}
