package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Hiduke;

@Repository
public interface HidukeRepository extends  JpaRepository<Hiduke, Long>{

	



}
