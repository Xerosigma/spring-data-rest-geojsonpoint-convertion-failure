package demo;

import java.util.List;

import org.springframework.data.geo.Polygon;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = Event.URI)
public interface EventRepository extends MongoRepository<Event, String> {
	
	void delete(Event event);
	
	Event save(Event event);
	
	Event findOne(String id);
	
	List<Event> findAll();
	
	List<Event> findByLocationWithin(@Param(value = "polygon") Polygon polygon);
}
