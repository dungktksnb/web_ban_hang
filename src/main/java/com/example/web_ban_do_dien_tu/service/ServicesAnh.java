package com.example.web_ban_do_dien_tu.service;

import com.example.web_ban_do_dien_tu.model.Anh;
import com.example.web_ban_do_dien_tu.repository.IRePoAnh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public class ServicesAnh implements IServicesAnh {
    @Autowired IRePoAnh iRePoAnh;

    @Override
    public List<Anh> findAll() {
        return (List<Anh>) iRePoAnh.findAll();
    }

    @Override
    public Anh findById(long id) {
        return iRePoAnh.findById(id).get();
    }

    @Override
    public Anh save(Anh anh) {
        return iRePoAnh.save(anh);
    }

    @Override
    public void remove(Anh anh) {
        iRePoAnh.delete(anh);

    }
}
