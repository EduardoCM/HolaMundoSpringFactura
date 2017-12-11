package com.tesji.estoico.pojo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("facturaBean")
public class Factura {

	private String rfcEmisor;
	private String rfcReceptor;
	private BigDecimal montoTotal;
	
	@Autowired
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

	@Autowired
	public void setRfcEmisor(@Value("CAME4567433") String rfcEmisor) {
		this.rfcEmisor = rfcEmisor;
	}

	public String getRfcReceptor() {
		return rfcReceptor;
	}

	@Autowired
	public void setRfcReceptor(@Value("HGT98744678")String rfcReceptor) {
		this.rfcReceptor = rfcReceptor;
	}

	
	public BigDecimal getMontoTotal() {
		return montoTotal;
	}

	@Autowired
	public void setMontoTotal(@Value("10000")BigDecimal montoTotal) {
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
