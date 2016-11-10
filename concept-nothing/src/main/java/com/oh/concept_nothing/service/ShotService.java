package com.oh.concept_nothing.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oh.concept_nothing.domain.Shot;
import com.oh.concept_nothing.repository.ShotRepository;

@Service
@Transactional
public class ShotService {
	@Autowired
	private ShotRepository shotRepository;
	
	public List<Shot> findAll() {
		List<Shot> shotList = new ArrayList<>();
		for(Shot shot : shotRepository.findAll())
			shotList.add(shot);
		
		return shotList;
	}
}
