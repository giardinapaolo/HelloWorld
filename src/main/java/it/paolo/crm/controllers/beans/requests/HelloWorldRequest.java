package it.paolo.crm.controllers.beans.requests;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class HelloWorldRequest extends GenericRequest {
	private String message;
}