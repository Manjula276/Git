package com.trackorder.domain.model;

public class OrderDispatchedService {
	
	public void update(){
		
		DomainEventPublisher.publish(new OrderDispatchedDomainEvent());
			
	}
	

}
