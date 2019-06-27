package com.trackorder.infrastructure.eventstore;

import java.util.ArrayList;
import java.util.List;

import com.trackorder.domain.eventstore.EventStore;
import com.trackorder.domain.model.DomainEvent;

import notification.system.eventbus.SubscribeEvent;
import org.springframework.stereotype.Repository;

@Repository
public class InMemoryEventStore implements EventStore{
	
	private static final List<DomainEvent> IN_MEMORY_EVENT_STORE = new ArrayList<DomainEvent>();

	
	@SubscribeEvent
	public void append(DomainEvent event) {
		System.out.println(this.getClass().getSimpleName()+"  received event "+event.getClass().getSimpleName());
		IN_MEMORY_EVENT_STORE.add(event);
	}

	
	public List<DomainEvent> allDomainEventsSince(long stroredEventId) {
		return IN_MEMORY_EVENT_STORE;
	}
	
}
