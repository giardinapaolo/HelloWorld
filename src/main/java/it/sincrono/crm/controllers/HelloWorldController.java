package it.sincrono.crm.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import it.sincrono.crm.controllers.beans.Esito;
import it.sincrono.crm.controllers.beans.responses.HelloWorldResponse;
import it.sincrono.crm.controllers.constants.ControllerMaps;

@RestController
public class HelloWorldController {

	/**
	 * @return HttpEntity
	 */
	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = ControllerMaps.JSON)
	public @ResponseBody HttpEntity<HelloWorldResponse> hello() {

		HttpEntity<HelloWorldResponse> httpEntity;

		HelloWorldResponse helloWorldResponse = new HelloWorldResponse();

		try {
			helloWorldResponse.setMessage("Hello World!!!");
			helloWorldResponse.setEsito(new Esito());

			httpEntity = new HttpEntity<HelloWorldResponse>(helloWorldResponse);

		} catch(Exception e) {
			helloWorldResponse.setEsito(new Esito(-1, e.getMessage()));
			httpEntity = new HttpEntity<HelloWorldResponse>(helloWorldResponse);
		}

		return httpEntity;
	}
}