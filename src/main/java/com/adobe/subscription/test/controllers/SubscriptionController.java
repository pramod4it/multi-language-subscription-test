package com.adobe.subscription.test.controllers;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.adobe.subscription.test.models.Subscription;

@Controller
public class SubscriptionController {
	
	@GetMapping("/index")
	public ModelAndView index() {
		
		ModelAndView modelAndView = new ModelAndView();    
		modelAndView.setViewName("index");   
		
		List<Subscription> subscriptions = fetchProducts();
		modelAndView.addObject("subscriptions", subscriptions); 
						
		return modelAndView;
	}

	private List<Subscription> fetchProducts() {
		Locale locale = LocaleContextHolder.getLocale();
				
		List<Subscription> subscriptions = new ArrayList<Subscription>();
		
		Subscription subscription = new Subscription();
		subscription.setCourseName("Math");
		subscription.setSubscribedOn(localizeDate(locale, LocalDate.of(2021, Month.SEPTEMBER, 22)));
		subscription.setCanceledOn(localizeDate(locale, LocalDate.of(2022, Month.MARCH, 22)));
		subscriptions.add(subscription);
		
		subscription = new Subscription();
		subscription.setCourseName("Physics");
		subscription.setSubscribedOn(localizeDate(locale, LocalDate.of(2000, Month.SEPTEMBER, 22)));
		subscription.setCanceledOn(localizeDate(locale, LocalDate.of(2021, Month.MARCH, 22)));
		subscriptions.add(subscription);
		
		return subscriptions;
	}
 
	private String localizeDate(final Locale locale, final LocalDate date ) {
		String localizedDate = DateTimeFormatter.ISO_LOCAL_DATE.format(date);
		return localizedDate;	
	}
}
