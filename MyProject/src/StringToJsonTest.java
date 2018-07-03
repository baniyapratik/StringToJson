import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

class StringToJsonTest {
	/* This test is responsible to validate the output of the display_json_obj method. 
	 * */
	@Test
	void test_display_json_obj() throws IOException {
		
		String test_filePath = "/Users/prabaniy/Documents/new_file.txt";
		StringToJson my_test_obj = new StringToJson(test_filePath);
		
		String expected_output = "[\n" + 
				"  {\n" + 
				"    \"Name\": \"Pratik Baniya\",\n" + 
				"    \"Address\": \"123 Test Lane\",\n" + 
				"    \"City\": \"Oklahoma City\",\n" + 
				"    \"Zip\": \"73160\",\n" + 
				"    \"Certifications\": [\n" + 
				"      \"UAS Pilot I\",\n" + 
				"      \"UAS Pilot II\",\n" + 
				"      \"UAS Support Crew V\"\n" + 
				"    ]\n" + 
				"  }\n" + 
				"]";
		String actual_string = my_test_obj.display_json_obj();
		assertEquals(expected_output, actual_string);
	}
	/* This test checks if the file not found exception is raised and caught
	 * */
	@Test
	void test_multi_context() throws IOException  {
		
		String test_filePath = "/Users/prabaniy/Documents/multiple_applicants.txt";
		StringToJson my_test_obj = new StringToJson(test_filePath);
		String expected_output = "[\n" + 
				"  {\n" + 
				"    \"Name\": \"Pratik Baniya\",\n" + 
				"    \"Address\": \"123 Test Lane\",\n" + 
				"    \"City\": \"Oklahoma City\",\n" + 
				"    \"Zip\": \"73160\",\n" + 
				"    \"Certifications\": [\n" + 
				"      \"UAS Pilot I\",\n" + 
				"      \"UAS Pilot II\",\n" + 
				"      \"UAS Support Crew V\",\n" + 
				"      \"UAS Pilot I\"\n" + 
				"    ]\n" + 
				"  },\n" + 
				"  {\n" + 
				"    \"Name\": \"New Emp\",\n" + 
				"    \"Address\": \"123 Test Lane\",\n" + 
				"    \"City\": \"california\",\n" + 
				"    \"Zip\": \"94041\",\n" + 
				"    \"Certifications\": [\n" + 
				"      \"UAS Pilot I\",\n" + 
				"      \"UAS Pilot II\",\n" + 
				"      \"UAS Support Crew V\",\n" + 
				"      \"UAS Pilot I\"\n" + 
				"    ]\n" + 
				"  }\n" + 
				"]";
		String actual_string = my_test_obj.display_json_obj();
		assertEquals(expected_output, actual_string);
	}
	
	/* This test checks if the file not found exception is raised and caught
	 * */
	@Test
	void test_invalid_path()  {
		
		String test_filePath = "/thispath/doesnot/exist";
		StringToJson my_test_obj = new StringToJson(test_filePath);
		try {
			my_test_obj.display_json_obj();
		}
		catch(java.io.FileNotFoundException e) {
			System.out.println("Expected output");
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

}
