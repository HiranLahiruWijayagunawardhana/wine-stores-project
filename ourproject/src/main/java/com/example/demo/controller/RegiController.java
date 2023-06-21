package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RegiDTO;
import com.example.demo.service.RegiService;

@RestController
@RequestMapping(value="api/v1/regi")
@CrossOrigin
public class RegiController {
	@Autowired
	private RegiService regiService;
	
	@GetMapping("/getRegi")
	public List<RegiDTO> getRegi(){
		return regiService.getAllRegi();
	}
	
	@PostMapping("/saveRegi")
	public RegiDTO saveRegi(@RequestBody RegiDTO regiDTO){
		return regiService.saveRegi(regiDTO);
	}

}
