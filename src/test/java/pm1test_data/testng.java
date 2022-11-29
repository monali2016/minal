package pm1test_data;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import liberies.base_class;
import liberies.utility_class;
import main_module.pom1;
import main_module.pom2;

public class testng extends base_class {
	pom1 obj;
	pom2 obj1;

	@BeforeClass
	public void openbrowser() {
		intiliaze();
		obj = new pom1(driver);
		obj1 = new pom2(driver);
	}

	@Test

	public void method() throws EncryptedDocumentException, IOException, InterruptedException {

		obj.setusername(utility_class.Testd(0, 0));
		obj.setpassword(utility_class.Testd(0, 1));
		obj.setun();
		obj.setprivacypoice();
		obj.clicksignin();
		obj.settext();
		obj.setforgetpassword();
		Thread.sleep(2000);

		obj1.clickrestlogin();
		Thread.sleep(2000);
		obj1.clickgotologin();

		obj.setusername(utility_class.Testd(0, 2));
		obj.setpassword(utility_class.Testd(0, 3));
				obj.clicksignin();
	}

	@AfterClass
	public void close_class() {
		obj = null;
		obj1 = null;
		//obj2 = null;
		driver = null;
	}

}
