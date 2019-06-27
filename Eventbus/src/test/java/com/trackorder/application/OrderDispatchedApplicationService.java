package com.trackorder.application;

import notification.system.eventbus.SubscribeEvent;
import org.springframework.stereotype.Service;
import com.trackorder.domain.model.OrderDispatchedDomainEvent;
import com.trackorder.domain.model.DomainEvent;

@Service
public class OrderDispatchedApplicationService extends BaseTrackOrderApplicationService{

	@SubscribeEvent
	public void when(OrderDispatchedDomainEvent event){
		System.out.println(this.getClass().getSimpleName()+"  received event "+event.getClass().getSimpleName());	
	}
	
	@SubscribeEvent
	public void when(DomainEvent event) {
		System.out.println(this.getClass().getSimpleName()+"  received event "+event.getClass().getSimpleName());
	}
}
