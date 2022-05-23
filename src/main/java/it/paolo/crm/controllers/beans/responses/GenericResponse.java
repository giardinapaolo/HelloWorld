package it.paolo.crm.controllers.beans.responses;

import it.paolo.crm.controllers.beans.Esito;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class GenericResponse {
	private Esito esito = new Esito();
}