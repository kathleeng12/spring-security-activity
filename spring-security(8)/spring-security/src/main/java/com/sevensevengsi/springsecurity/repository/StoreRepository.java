package com.sevensevengsi.springsecurity.repository;

import com.sevensevengsi.springsecurity.model.Store;
import com.sevensevengsi.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StoreRepository extends  JpaRepository<Store, Long>{

    List<Store> findByOwnerId(Long id);
}