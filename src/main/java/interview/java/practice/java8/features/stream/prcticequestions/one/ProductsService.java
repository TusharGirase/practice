package interview.java.practice.java8.features.stream.prcticequestions.one;

import java.util.ArrayList;
import java.util.List;

public class ProductsService {

	private static List<SmartPhone> smartphones = new ArrayList<>();

	private static List<Laptop> laptops = new ArrayList<>();

	static {
		smartphones.add(new SmartPhone(1, new Seller(1, "ABC Co."), 11000f, 15f, "Snapdragon 8", "LED", "A3"));
		smartphones.add(new SmartPhone(2, new Seller(1, "ABC Co."), 16000f, 15f, "Snapdragon 8", "LCD", "A3"));
		smartphones.add(new SmartPhone(3, new Seller(2, "DEF Co."), 11000f, 15f, "Snapdragon 7", "LED", "A4"));
		smartphones.add(new SmartPhone(4, new Seller(3, "HIJ Co."), 13000f, 15f, "Snapdragon 9", "LED", "A8"));
		smartphones.add(new SmartPhone(5, new Seller(2, "DEF Co."), 12000f, 12.1f, "Snapdragon 8", "LED", "A2"));
		smartphones.add(new SmartPhone(6, new Seller(1, "ABC Co."), 18000f, 15f, "Snapdragon 8", "LED", "A7"));

		laptops.add(new Laptop(1, new Seller(1, "ABC Co."), 45000f, 15F, "Intel 9th Gen", "LED", "8gb", "Dell 1122"));
		laptops.add(new Laptop(2, new Seller(1, "ABC Co."), 40000f, 15F, "Intel 8th Gen", "LED", "4gb", "Lenovo 1144"));
		laptops.add(new Laptop(3, new Seller(1, "ABC Co."), 40000f, 15F, "Intel 8th Gen", "LED", "2gb", "Lenovo 8855"));
		laptops.add(
				new Laptop(4, new Seller(2, "DEF Co."), 34000f, 15.5F, "Intel 8th Gen", "LED", "2gb", "Lenovo 774"));
		laptops.add(new Laptop(5, new Seller(2, "DEF Co."), 45000f, 15F, "Intel 9th Gen", "LED", "8gb", "Dell 1122"));
		laptops.add(new Laptop(6, new Seller(3, "HIJ Co."), 45000f, 15F, "Intel 9th Gen", "LED", "8gb", "Dell 1122"));
	}

	public List<SmartPhone> getAllSmartPhones() {
		return smartphones;
	}

}
