package com.example.web_ban_do_dien_tu.repository;

import com.example.web_ban_do_dien_tu.model.Anh;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRePoAnh extends PagingAndSortingRepository<Anh,Long> {
}
