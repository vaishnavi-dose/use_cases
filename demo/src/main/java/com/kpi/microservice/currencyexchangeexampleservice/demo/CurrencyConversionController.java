package com.kpi.microservice.currencyexchangeexampleservice.demo;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController 
{
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to, @PathVariable double quantity) 
	{
		/*
		 * Map<String, String>uriVariables=new HashMap<>(); uriVariables.put("from",
		 * from); uriVariables.put("to", to);
		 * ResponseEntity<CurrencyConversionSampleBean>responseEntity=new
		 * RestTemplate().getForEntity(
		 * "http://localhost:8000/currency-exchange/from/{from}/to/{to}",
		 * CurrencyConversionSampleBean.class, uriVariables);
		 * CurrencyConversionSampleBean response=responseEntity.getBody();
		 */
		final String currency1 = "USD";
		final String currency2 = "Rupee";
		final String currency3 = "EURO";
		final String currency4 = "DIRHAM";
		final String currency5 = "POUND";
		
		double per=0;
		double mul=0;
		
		//USD
		  if (from.equals(currency1))
		  {
			  if (to.equals(currency1)) 
			  {
				 mul=1;
				 per=quantity*mul;
			  }
			  if(to.equals(currency2)) 
			  {
				 mul=82.33;
				 per=quantity*mul;
			  }
			  if(to.equals(currency3))
			  {
				  mul=0.99;
				  per=quantity*mul;
			  }
			  if(to.equals(currency4))
			  {
				  mul=3.67;
				  per=quantity*mul;
			  }
			  else if(to.equals(currency5))
			  {
				  mul=0.86;
				  per=quantity*mul;
			  }
		  }
		  
		//Rupee
		  if (from.equals(currency2))
		  {
			  if (to.equals(currency1)) 
			  {
				 mul=0.012;
				 per=quantity*mul;
			  }
			  if(to.equals(currency2)) 
			  {
				 mul=1;
				 per=quantity*mul;
			  }
			  if(to.equals(currency3))
			  {
				  mul=0.012;
				  per=quantity*mul;
			  }
			  if(to.equals(currency4))
			  {
				  mul=0.045;
				  per=quantity*mul;
			  }
			  else if(to.equals(currency5))
			  {
				  mul=0.010;
				  per=quantity*mul;
			  }
		  }
		  
		//EURO
		  if (from.equals(currency3))
		  {
			  if (to.equals(currency1)) 
			  {
				 mul=1.01;
				 per=quantity*mul;
			  }
			  if(to.equals(currency2)) 
			  {
				 mul=82.82;
				 per=quantity*mul;
			  }
			  if(to.equals(currency3))
			  {
				  mul=1;
				  per=quantity*mul;
			  }
			  if(to.equals(currency4))
			  {
				  mul=3.70;
				  per=quantity*mul;
			  }
			  else if(to.equals(currency5))
			  {
				  mul=0.87;
				  per=quantity*mul;
			  }
		  }
		  
		//DIRHAM
		  if (from.equals(currency4))
		  {
			  if (to.equals(currency1)) 
			  {
				 mul=0.27;
				 per=quantity*mul;
			  }
			  if(to.equals(currency2)) 
			  {
				 mul=22.40;
				 per=quantity*mul;
			  }
			  if(to.equals(currency3))
			  {
				  mul=0.27;
				  per=quantity*mul;
			  }
			  if(to.equals(currency4))
			  {
				  mul=1;
				  per=quantity*mul;
			  }
			  else if(to.equals(currency5))
			  {
				  mul=0.23;
				  per=quantity*mul;
			  }
		  }
		  
		//POUND
		  if (from.equals(currency5))
		  {
			  if (to.equals(currency1)) 
			  {
				 mul=1.16;
				 per=quantity*mul;
			  }
			  if(to.equals(currency2)) 
			  {
				 mul=95.38;
				 per=quantity*mul;
			  }
			  if(to.equals(currency3))
			  {
				  mul=1.15;
				  per=quantity*mul;
			  }
			  if(to.equals(currency4))
			  {
				  mul=4.26;
				  per=quantity*mul;
			  }
			  else if(to.equals(currency5))
			  {
				  mul=1;
				  per=quantity*mul;
			  }
		  }
		
		return new CurrencyConversionBean(1L, from,to,mul,quantity,per,0 );  
    }
}