package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Hiduke;
import com.example.demo.service.HidukeService;

@Controller
@RequestMapping("/dates")
public class HidukeController {
	@Autowired
	private HidukeService hidukeService;
	
	@GetMapping
	public String index(Model model) {
		List<Hiduke> dates = hidukeService.findAll();
		model.addAttribute("dates",dates);
		return "dates/index";
	}
	@GetMapping("new")
	public String newHiduke(Model model) {
		return "dates/new";
	}
	@GetMapping("{id}/edit")
	public String edit(@PathVariable Long id,Model model) {
		Hiduke hiduke = hidukeService.findOne(id);
		model.addAttribute("hiduke",hiduke);
		return "dates/edit";
	}
	@GetMapping("{id}")
	public String show(@PathVariable Long id,Model model) {
		Hiduke hiduke = hidukeService.findOne(id);
		model.addAttribute("hiduke",hiduke);
		return "dates/show";
	}
	@PostMapping
	public String create(@ModelAttribute Hiduke hiduke) {
		hidukeService.save(hiduke);
		return "redirect:/dates";
	}
	@PostMapping("{id}")
	public String update(@PathVariable Long id, @ModelAttribute Hiduke hiduke) {
		hiduke.setId(id);
		hidukeService.save(hiduke);
		return "redirect:/dates";
	}
	@DeleteMapping("{id}")
	public String destroy(@PathVariable Long id) {
		hidukeService.delete(id);
		return "redirect:/dates";
	}

}
