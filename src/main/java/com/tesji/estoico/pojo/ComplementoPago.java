package com.tesji.estoico.pojo;

import java.math.BigDecimal;

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

	public void setIdFactura(long idFactura) {
		this.idFactura = idFactura;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	@Override
	public String toString() {
		return "ComplementoPago [idFactura=" + idFactura + ", monto=" + monto + ", moneda=" + moneda + "]";
	}

}
