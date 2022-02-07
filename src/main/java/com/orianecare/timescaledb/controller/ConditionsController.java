/**
 * 
 */
package com.orianecare.timescaledb.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orianecare.timescaledb.entity.ConditionsEntity;
import com.orianecare.timescaledb.repo.ConditionsRepo;

/**
 * @author vennelakanti
 *
 */
@RestController
public class ConditionsController {
	
	@Autowired
	private ConditionsRepo conditionsRepo;

	@PostMapping("/save")
	public String saveCondition(@RequestBody ConditionsEntity condition) {
		condition.setTimeOfMeasurement(new Date());
		return conditionsRepo.save(condition).toString();
	}
}

