package org.astrazeneca.parceltracking.controller;


import java.util.Arrays;
import java.util.List;

import org.astrazeneca.parceltracking.model.ParcelTracking;
import org.astrazeneca.parceltracking.service.ParcelTrackingService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
//@WebMvcTest(value = ParcelTrackingController.class, secure = false)
public class ParcelTrackingControllerTest {

	
	private MockMvc mockMvc;

	@Mock
	private ParcelTrackingService parcelTrackingService;
	
	@InjectMocks
	private ParcelTrackingController parcelTrackingController;
	
	@Before
    public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(parcelTrackingController).build();
    }
	
	@Test
	 public void addParcel() throws Exception {
		String jsonString = "{\n" +
                "\"id\":1,\n" +
                "\"type\":\"Electronics\",\n" +
                "\"name\":\"Mobile\"\n" +
                "\"status\":\"Ordered\"\n" +
                "\"location\":\"Chennai\"\n" +
                "}";
		ParcelTracking item = new ParcelTracking(new Long(1),"Electronics","Mobile","Ordered","Chennai");
        mockMvc.perform(MockMvcRequestBuilders.post("/parceltracking/add/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonString))
                .andExpect(MockMvcResultMatchers.status().isCreated());
	 }
	/*
	@Test
	 public void updateParcel() throws Exception {
		String jsonString = "{\n" +
                "\"id\":1,\n" +
                "\"type\":\"Electronics\",\n" +
                "\"name\":\"Mobile\"\n" +
                "\"status\":\"Ordered\"\n" +
                "\"location\":\"Chennai\"\n" +
                "}";
		ParcelTracking item = new ParcelTracking(new Long(1),"Electronics","Mobile","Ordered","Chennai");
        mockMvc.perform(MockMvcRequestBuilders.post("/parceltracking/update/item")
                .contentType(MediaType.APPLICATION_JSON)
                .content(jsonString))
                .andExpect(MockMvcResultMatchers.status().isCreated());
	 }
	*/
	
	/*@Test
	 public void deleteParcel() throws Exception {
		
		mockMvc.perform(MockMvcRequestBuilders.delete("/parceltracking/delete/Mobile")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(MockMvcResultMatchers.status().isAccepted());
	 }*/
	
	/*@Test
	 public void searchParcel() throws Exception {
		ParcelTracking item = new ParcelTracking(new Long(1),"Electronics","Mobile","Ordered","Chennai");
        Mockito.when(parcelTrackingService.searchParcel("Mobile")).thenReturn(item);
        mockMvc.perform(MockMvcRequestBuilders.get("/parceltracking/search/Mobile")
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(MockMvcResultMatchers.status().isOk());
        Mockito.verify(parcelTrackingService).searchParcel("Mobile");
	 }
	
	@Test
	 public void getStatusParcel() throws Exception {
		ParcelTracking item = new ParcelTracking(new Long(1),"Electronics","Mobile","Ordered","Chennai");
        Mockito.when(parcelTrackingService.getStatusParcel("Mobile")).thenReturn(item.getParcelStatus());
        mockMvc.perform(MockMvcRequestBuilders.get("/parceltracking/status/Mobile")
        .accept(MediaType.APPLICATION_JSON))
        .andExpect(MockMvcResultMatchers.status().isOk());
        Mockito.verify(parcelTrackingService).getStatusParcel("Mobile");
	 }
	
	
	@Test
	 public void getAllParcel() throws Exception {
		List<ParcelTracking> items = Arrays.asList(new ParcelTracking(new Long(1),"Electronics","Mobile","Ordered","Chennai"));
        Mockito.when(parcelTrackingService.getAllParcel()).thenReturn(items);
        mockMvc.perform(MockMvcRequestBuilders.get("/parceltracking/getAll"))
                .andExpect(MockMvcResultMatchers.status().isOk());
	 }*/
}
