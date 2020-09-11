package com.example.demo.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Hiduke {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private LocalDate date;
	private String date_id;
    private String date_name;
    private LocalDate calculationResult;
    private LocalDate nengappi;
    
    @Override
    public String toString() {
    	return "hiduke [date=" + date +", id=" + id + ", date_id=" + date_id + ", date_name" + date_name +
    			       ", calculationResult" + calculationResult + ", nengappi" + nengappi +"]";
    }
}
