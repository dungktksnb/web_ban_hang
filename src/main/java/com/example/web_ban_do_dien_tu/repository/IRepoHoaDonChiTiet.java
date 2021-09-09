package com.example.web_ban_do_dien_tu.repository;

import com.example.web_ban_do_dien_tu.model.HoaDonChiTiet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IRepoHoaDonChiTiet extends PagingAndSortingRepository<HoaDonChiTiet,Long> {
}
