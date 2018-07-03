import java.util.List;

public class Applicant {
	public String Name;
	public String Address;
	public String City;
	public String Zip;
	public List<String> Certifications;
	
	/** Applicant Constructor**/
	public Applicant() {}
	
	public Applicant(String name, String address, String city, String zip, List<String> certifications) {
		this.Name = name;
		this.Address = address;
		this.City = city;
		this.Zip = zip;
		this.Certifications = certifications;
	}
	
	/**
	 * Getters and Setters
	 * */
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getZip() {
		return Zip;
	}
	public void setZip(String zip) {
		Zip = zip;
	}
	public List<String> getCertifications() {
		return Certifications;
	}
	public void setCertifications(List<String> certifications2) {
		Certifications = certifications2;
	}
}
