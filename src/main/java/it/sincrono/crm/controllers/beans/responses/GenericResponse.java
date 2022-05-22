package it.sincrono.crm.controllers.beans.responses;

import lombok.*;

import it.sincrono.crm.controllers.beans.Esito;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class GenericResponse {
	private Esito esito = new Esito();
}