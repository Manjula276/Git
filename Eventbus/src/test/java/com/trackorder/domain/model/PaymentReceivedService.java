package com.trackorder.domain.model;


public class PaymentReceivedService {

	public void update(){
		
		DomainEventPublisher.publish(new PaymentReceivedDomainEvent());
			
	}

}
