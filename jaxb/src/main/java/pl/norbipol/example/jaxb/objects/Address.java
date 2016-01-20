package pl.norbipol.example.jaxb.objects;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="address")
public class Address {

	private String miejscowosc;
	private Integer nrDomu;
	
	public String getMiejscowosc() {
		return miejscowosc;
	}
	public void setMiejscowosc(String miejscowosc) {
		this.miejscowosc = miejscowosc;
	}
	public Integer getNrDomu() {
		return nrDomu;
	}
	public void setNrDomu(Integer nrDomu) {
		this.nrDomu = nrDomu;
	}
	
	
}
