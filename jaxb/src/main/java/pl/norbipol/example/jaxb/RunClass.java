package pl.norbipol.example.jaxb;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.ws.soap.AddressingFeature;

import pl.norbipol.example.jaxb.objects.Address;
import pl.norbipol.example.jaxb.objects.Osoba;

public class RunClass {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Address> addresses = new ArrayList<>();
		Osoba osoba = new Osoba();
		osoba.setNazwa("norbert");
		osoba.setWiek(32);
		osoba.setDefaultText("");
		osoba.setIntValue(62);
		
		Address address = new Address();
		address.setMiejscowosc("Krojczyn");
		address.setNrDomu(58);
		addresses.add(address);
		address = new Address();
		address.setMiejscowosc("Łódź");
		address.setNrDomu(22);
		addresses.add(address);
		
		osoba.setAdresy(addresses);
		
		File file = new File("D:\\file.xml");
		JAXBContext jaxbContext;
		try {
			jaxbContext = JAXBContext.newInstance(Osoba.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	
			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	
			jaxbMarshaller.marshal(osoba, file);
			jaxbMarshaller.marshal(osoba, System.out);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		try {

			jaxbContext = JAXBContext.newInstance(Osoba.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Osoba customer = (Osoba) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer);

			} catch (JAXBException e) {
				e.printStackTrace();
			}
	}

}
