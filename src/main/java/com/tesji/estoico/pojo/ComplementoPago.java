package com.tesji.estoico.pojo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ComplementoPago {

	
	private long idFactura;
	
	
	private BigDecimal monto;
	
	
	private String moneda;

	public ComplementoPago() {

	}

	public ComplementoPago(long idFactura, BigDecimal monto, String moneda) {
		this.idFactura = idFactura;
		this.monto = monto;
		this.moneda = moneda;
	}

	public long getIdFactura() {
		return idFactura;
	}

	@Autowired
	public void setIdFactura(@Value("1234568")long idFactura) {
		this.idFactura = idFactura;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	@Autowired
	public void setMonto(@Value("10000")BigDecimal monto) {
		this.monto = monto;
	}

	public String getMoneda() {
		return moneda;
	}

	@Autowired
	public void setMoneda(@Value("MXN")String moneda) {
		this.moneda = moneda;
	}

	@Override
	public String toString() {
		return "ComplementoPago [idFactura=" + idFactura + ", monto=" + monto + ", moneda=" + moneda + "]";
	}

}
