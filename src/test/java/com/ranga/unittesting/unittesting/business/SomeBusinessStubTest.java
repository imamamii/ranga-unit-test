package com.ranga.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ranga.unittesting.unittesting.data.DataService;

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3};
	}
	
}


class DataServiceEmptyStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {};
	}
	
}


class DataServiceOneValueStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {5};
	}
	
}


class SomeBusinessStubTest {

	@Test
	public void calculateSumDataService_basic() {
		BusinessImpl business = new BusinessImpl();
		business.setDataService(new DataServiceStub());
		int actualResult = business.calculateSumDataService();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void calculateSumDataService_empty() {
		BusinessImpl business = new BusinessImpl();
		business.setDataService(new DataServiceEmptyStub());
		int actualResult = business.calculateSumDataService();
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void calculateSumDataService_oneValue() {
		BusinessImpl business = new BusinessImpl();
		business.setDataService(new DataServiceOneValueStub());
		int actualResult = business.calculateSumDataService();
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}

}
