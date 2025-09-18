package data_driven_testing;

import org.testng.annotations.DataProvider;

public class LearnDataProvider {
	@DataProvider
public Object[][] getData() {
	Object[][]data= {{"admin","manager"},{"admin123","manager123"},{"admin","manager"},
			{"admin321","manager321"},{"admin456","manager456"},{"admin","manager"},};
	return data;}}
