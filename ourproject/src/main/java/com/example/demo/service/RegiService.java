package com.example.demo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RegiDTO;
import com.example.demo.entity.Regi;
import com.example.demo.repository.RegiRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class RegiService {
	@Autowired
	private RegiRepository regiRipository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public RegiDTO saveRegi(RegiDTO regiDTO){
		regiRipository.save(modelMapper.map(regiDTO, Regi.class));
		return regiDTO;
	}
	
	public List<RegiDTO> getAllRegi(){
		List<Regi>regiList=regiRipository.findAll();
		return modelMapper.map(regiList,new TypeToken<List<RegiDTO>>(){}.getType());
	}

}
