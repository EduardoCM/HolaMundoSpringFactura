package com.tesji.estoico.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tesji.estoico.pojo.ComplementoPago;
import com.tesji.estoico.pojo.Factura;

public class MainSpring {
	
	
	public static void main(String[] args){
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("spring-context.xml");
		
		Factura factura = (Factura) appContext.getBean("factura");
		
		System.out.println(factura);
		
		
	}

}
