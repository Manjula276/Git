package com.trackorder.domain.model;

import java.util.Date;

public class OrderDispatchedDomainEvent extends DomainEvent {

	public OrderDispatchedDomainEvent() {
		super(new Date());
	}

}
