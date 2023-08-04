package com.khadri.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.khadri.spring.mvc.form.Order;

@Controller
public class OrderController {
	
	@Autowired
	private ModelAndView modelAndView;

	@RequestMapping("/order")
	public ModelAndView orderItem(Order order) {

		System.out.println("Order Name : " + order.getOrderName());
		System.out.println("Order Type : " + order.getOrderType());
		System.out.println("Order Cost : " + order.getOrderCost());
		System.out.println("Order Location : " + order.getOrderLocation());
		System.out.println("Order GST : " + order.getOrderGST());
		System.out.println("Order Total Cost : " + order.getOrderTotalCost());
		
		modelAndView.addObject("orderData", order);
		modelAndView.setViewName("result");
		
		return modelAndView;
		
	}

}
