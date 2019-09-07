package com.self.learn.spring.core.service;

import com.self.learn.spring.core.dto.AbstractBox;
import com.self.learn.spring.core.dto.Country;

public class CountryService implements IService{
	private IService boxService;

	@Override
	public Object add() {
		Country country = populateCountry(new Country());
		return country;
	}

	private Country populateCountry(Country country) {

		 country.setBox((AbstractBox)boxService.add());
		return country;
	}
	
	

}
