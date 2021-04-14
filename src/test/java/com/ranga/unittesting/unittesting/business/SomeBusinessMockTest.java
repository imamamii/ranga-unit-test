package com.ranga.unittesting.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import com.ranga.unittesting.unittesting.data.DataService;

/*
class DataServiceMock implements DataService{
	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return null;
	}
}


class DataServiceEmptyMock implements DataService{
	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {};
	}
}


class DataServiceOneValueMock implements DataService{
	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {5};
	}
}*/


class SomeBusinessMockTest {

	@Test
	public void calculateSumDataService_basic() {
		BusinessImpl business = new BusinessImpl();
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		business.setDataService(dataServiceMock);
		int actualResult = business.calculateSumDataService();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void calculateSumDataService_empty() {
		BusinessImpl business = new BusinessImpl();
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		business.setDataService(dataServiceMock);
		int actualResult = business.calculateSumDataService();
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void calculateSumDataService_oneValue() {
		BusinessImpl business = new BusinessImpl();
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
		business.setDataService(dataServiceMock);
		int actualResult = business.calculateSumDataService();
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}
	

}
