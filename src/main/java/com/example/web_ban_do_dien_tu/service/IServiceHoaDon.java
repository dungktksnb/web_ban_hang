package com.example.web_ban_do_dien_tu.service;

import com.example.web_ban_do_dien_tu.model.HoaDon;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IServiceHoaDon {
    List<HoaDon> findAll();

    HoaDon findById(long id);

    HoaDon save(HoaDon hoaDon);

    void remove(HoaDon hoaDon);


}
