package it.paolo.crm.controllers.beans.responses;

import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class HelloWorldResponse extends GenericResponse {
	private String message;
}