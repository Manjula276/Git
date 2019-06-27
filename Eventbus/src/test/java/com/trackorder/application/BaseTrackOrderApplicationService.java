package com.trackorder.application;

import com.trackorder.domain.model.OrderDispatchedService;
import com.trackorder.domain.model.OrderDispatchedDomainEvent;
import com.trackorder.domain.model.PaymentReceivedService ;
import notification.system.eventbus.SubscribeEvent;

public abstract class BaseTrackOrderApplicationService{

	private PaymentReceivedService paymentrecievedService = new PaymentReceivedService ();
	private OrderDispatchedService orderdispatchedService = new OrderDispatchedService();
	
	
	public void updatePayment(){
		paymentrecievedService.update();
	}
	
	public void updateOrderDispatched(){
		orderdispatchedService.update();
	}
	
	
	@SubscribeEvent
	public void when(OrderDispatchedDomainEvent event) {
		System.out.println(this.getClass().getSimpleName()+"  received event "+event.getClass().getSimpleName());
	}	
}
