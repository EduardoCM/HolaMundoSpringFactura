package com.tesji.estoico.pojo;

import java.math.BigDecimal;

public class Factura {

	private String rfcEmisor;
	private String rfcReceptor;
	private BigDecimal montoTotal;
	private ComplementoPago complementoPago;

	public Factura() {

	}

	public Factura(String rfcEmisor, String rfcReceptor) {
		this.rfcEmisor = rfcEmisor;
		this.rfcReceptor = rfcReceptor;
	}

	public String getRfcEmisor() {
		return rfcEmisor;
	}

	public void setRfcEmisor(String rfcEmisor) {
		this.rfcEmisor = rfcEmisor;
	}

	public String getRfcReceptor() {
		return rfcReceptor;
	}

	public void setRfcReceptor(String rfcReceptor) {
		this.rfcReceptor = rfcReceptor;
	}

	public BigDecimal getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(BigDecimal montoTotal) {
		this.montoTotal = montoTotal;
	}
	

	public ComplementoPago getComplementoPago() {
		return complementoPago;
	}

	public void setComplementoPago(ComplementoPago complementoPago) {
		this.complementoPago = complementoPago;
	}

	@Override
	public String toString() {
		return "Factura [rfcEmisor=" + rfcEmisor + ", rfcReceptor=" + rfcReceptor + ", montoTotal=" + montoTotal
				+ ", complementoPago=" + complementoPago + "]";
	}

	
	

}
