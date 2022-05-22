package it.sincrono.crm.controllers.beans;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Esito {

	private Integer code = 0;
	private String target;
}