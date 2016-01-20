package pl.norbipol.example.jaxb.objects;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="NazwaRootElement")
//kolejnośc wyświetlania pól w xml
@XmlType(propOrder={"wiek", "nazwa", "defaultText", "intValue", "adresy"})
public class Osoba {

	private String nazwa;
	private int wiek;
	private String defaultText;
	private Integer intValue;
	private List<Address> adresy = new ArrayList<>(0);
	
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getWiek() {
		return wiek;
	}
	public void setWiek(int wiek) {
		this.wiek = wiek;
	}
	//wartośc domyślna wyświetla się gdy tag xml jest pusty
	@XmlElement(defaultValue="domyślna wartośc")
	public String getDefaultText() {
		return defaultText;
	}
	public void setDefaultText(String defaultText) {
		this.defaultText = defaultText;
	}
	
	public Integer getIntValue() {
		return intValue;
	}
	public void setIntValue(Integer intValue) {
		this.intValue = intValue;
	}
	@Override
	public String toString() {
		return "Osoba [nazwa=" + nazwa + ", wiek=" + wiek + ", defaultText=" + defaultText + ", intValue=" + intValue
				+ "]";
	}
	
	
	@XmlElementWrapper(name="adresy")
	@XmlElement(name="adres")
	public List<Address> getAdresy() {
		return adresy;
	}
	public void setAdresy(List<Address> adresy) {
		this.adresy = adresy;
	}
	
	
	
	
}
