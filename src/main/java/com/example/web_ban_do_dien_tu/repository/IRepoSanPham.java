package com.example.web_ban_do_dien_tu.repository;

import com.example.web_ban_do_dien_tu.model.SanPham;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface IRepoSanPham extends PagingAndSortingRepository<SanPham,Long> {
    List<SanPham>findAllByAnh(SanPham sanPham);
}
