package com.nationwide.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nationwide.data.Achievements;
import com.nationwide.repo.AchievementsRepo;
import com.nationwide.repo.CriteriaRepo;
import com.nationwide.repo.EmpAchievementsRepo;


@Component
public class AchievementsService {
	
	@Autowired
	private AchievementsRepo arepo;
	
	@Autowired
	private CriteriaRepo crepo;
	
	@Autowired
	private EmpAchievementsRepo erepo;
	
	public ArrayList<Achievements> getAllAchievements() {
		return arepo.findAll();
	}
}
