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
	
	BusinessImpl business = new BusinessImpl();
	DataService dataServiceMock = mock(DataService.class);

	@Test
	public void calculateSumDataService_basic() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
		business.setDataService(dataServiceMock);
		assertEquals(6, business.calculateSumDataService());
	}
	
	@Test
	public void calculateSumDataService_empty() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
		business.setDataService(dataServiceMock);
		assertEquals(0, business.calculateSumDataService());
	}
	
	@Test
	public void calculateSumDataService_oneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {8});
		business.setDataService(dataServiceMock);
		assertEquals(5, business.calculateSumDataService());
	}
	

}
