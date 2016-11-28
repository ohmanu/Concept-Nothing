package com.oh.concept_nothing.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("storage")
public class StorageProperties {
	
	// Folder location for storing files.
	private String location = "C:/Users/casas/Pictures/concept-nothing";

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
