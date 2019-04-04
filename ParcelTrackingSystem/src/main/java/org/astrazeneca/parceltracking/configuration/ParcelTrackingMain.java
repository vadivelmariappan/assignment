package org.astrazeneca.parceltracking.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
@ComponentScan("org.astrazeneca.parceltracking")
public class ParcelTrackingMain {
	
	public static void main(String[] args) 
    {
        SpringApplication.run(ParcelTrackingMain.class, args);
    }
	
	/*
	 * protected final SpringApplicationBuilder configure(final
	 * SpringApplicationBuilder application) { return
	 * application.sources(ParcelTrackingMain.class); }
	 */
	
}





