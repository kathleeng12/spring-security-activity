package com.sevensevengsi.springsecurity.repository;

import com.sevensevengsi.springsecurity.model.Owner;
import com.sevensevengsi.springsecurity.model.Store;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OwnerRepository extends  JpaRepository<Owner, Long>{


}