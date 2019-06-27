package com.trackorder.domain.eventstore;

import java.util.List;
import com.trackorder.domain.model.DomainEvent;

public interface EventStore{

	public void append(DomainEvent event);
	
	public List<DomainEvent> allDomainEventsSince(long stroredEventId);
		
}
