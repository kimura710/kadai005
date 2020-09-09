package com.example.demo.sub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DateTimeCalc {
	private List<LocalDate> dates = new ArrayList<>();
	
	@GetMapping("/show")
	public List<LocalDate> show(){
		return dates;
		
	}
	
	@PostMapping("/create")
	public void create(@RequestParam("date")
	@DateTimeFormat(pattern="yyyyMMdd") LocalDate date) {
		dates.add(date);
		
	}

}
