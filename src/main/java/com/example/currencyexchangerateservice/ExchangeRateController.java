package com.example.currencyexchangerateservice;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/exchanges")
public class ExchangeRateController {
	
	
	@GetMapping(value="/converter")
	public CurrencyExchangeRateDto  getInfo(@RequestParam("fromCurrency") String fromCurrency, 
			@RequestParam("toCurrency") String toCurrency) throws UnknownHostException {
		return new CurrencyExchangeRateDto(fromCurrency, toCurrency, 1.2);// hard coded excahnge rate =1.2 
		
	}

}
