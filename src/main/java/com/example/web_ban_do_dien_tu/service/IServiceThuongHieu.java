package com.example.web_ban_do_dien_tu.service;

import com.example.web_ban_do_dien_tu.model.ThuongHieu;

import java.util.List;

public interface IServiceThuongHieu {
    List<ThuongHieu> findAll();

    ThuongHieu findById(long id);

    ThuongHieu save(ThuongHieu thuongHieu);

    void remove(ThuongHieu thuongHieu);
}
