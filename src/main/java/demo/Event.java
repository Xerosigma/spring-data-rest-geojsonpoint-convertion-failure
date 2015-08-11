package demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Event {

    public final static String URI = "/events";
	
	@Id
	private String id;
	
	private GeoJsonPoint location;
	
	public Event() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public GeoJsonPoint getLocation() {
		return location;
	}

	public void setLocation(GeoJsonPoint location) {
		this.location = location;
	}
}
