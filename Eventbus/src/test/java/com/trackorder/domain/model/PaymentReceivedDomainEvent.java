package com.trackorder.domain.model;

import java.util.Date;


public class PaymentReceivedDomainEvent extends DomainEvent {

	protected PaymentReceivedDomainEvent() {
		super(new Date());
	}

}
