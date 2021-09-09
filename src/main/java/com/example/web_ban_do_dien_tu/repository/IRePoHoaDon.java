package com.example.web_ban_do_dien_tu.repository;

import com.example.web_ban_do_dien_tu.model.HoaDon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IRePoHoaDon extends PagingAndSortingRepository<HoaDon,Long> {

}
