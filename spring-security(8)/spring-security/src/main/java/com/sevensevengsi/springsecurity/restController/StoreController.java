package com.sevensevengsi.springsecurity.restController;

import com.sevensevengsi.springsecurity.model.Store;
import com.sevensevengsi.springsecurity.repository.OwnerRepository;
import com.sevensevengsi.springsecurity.repository.StoreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class StoreController {
    @Autowired
    private StoreRepository storeRepo;

    @Autowired
    private OwnerRepository ownerRepo;

    	@GetMapping("/store")
	public ResponseEntity<List<Store>> getData (@RequestParam Long owner) {
		return new ResponseEntity<List<Store>>(storeRepo.findByOwnerId(owner), HttpStatus.OK);
	}
}
