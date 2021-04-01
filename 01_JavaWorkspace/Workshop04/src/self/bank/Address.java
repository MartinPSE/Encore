package self.bank;

public class Address {
	public int Zipcode;
	public String region;
	public String city;
	
	public Address(int Zipcode, String region, String city) {
		this.Zipcode = Zipcode;
		this.region = region;
		this.city = city;
	}
	
	
	@Override
	public String toString() {
		return "Address [Zipcode=" + Zipcode + ", region=" + region + ", city=" + city + "]";
	}
	
	
	
}
