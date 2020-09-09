package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Hiduke;
import com.example.demo.repository.HidukeRepository;

@Service
public class HidukeService {
	@Autowired
	private HidukeRepository hidukeRepository;
	public List<Hiduke>findAll(){
		return hidukeRepository.findAll();
	}
	public Hiduke findOne(Long id) {
		return hidukeRepository.findById(id).orElse(null);
	}
	public Hiduke save(Hiduke hiduke) {
		return hidukeRepository.save(hiduke);
	}
	public void delete(Long id) {
		hidukeRepository.deleteById(id);
	}

}
