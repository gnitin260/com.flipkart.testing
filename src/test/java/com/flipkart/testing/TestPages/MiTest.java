package com.flipkart.testing.TestPages;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Login;
import com.flipkart.testing.Pages.Electronics.Mobile.Mi;
import com.flipkart.testing.Pages.Electronics.Mobile.Mobile;

public class MiTest extends Basecls{

	Mi mi;
	Login login;
	Mobile mobile;

	public MiTest() {
		super();
	}


	@BeforeMethod
	public void setUp() throws InterruptedException {
		intialization();
		mi=new Mi();
		mobile= new Mobile();
		login =new Login();
		login.login(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(3000);
		mobile.NavigatetoMi();

	}

	@Test (priority = 1)
	public void TitleVerifyTest() throws InterruptedException {
		String title= mi.TitleVerify();
		Thread.sleep(5000);
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", "Title Not Matched");

	}
	@Test (priority = 2)
	public void MiCompanyVerificationTest() throws InterruptedException {
		Thread.sleep(5000);
		String compName= mi.MiCompanyVerification();

		Assert.assertEquals(compName, "Mi Mobiles", "Company is not matched");

	}

	@Test (priority = 3)
	public void Mi6GBfilterTest() throws InterruptedException {
		Thread.sleep(1500);
		String RAMDetails = mi.Mi6GBRAMverification();
		Thread.sleep(1500);
		Assert.assertEquals(RAMDetails, "6 GB RAM | 64 GB ROM | Expandable Upto 256 GB");
		Thread.sleep(1500);

	}

	@Test (priority = 4)
	public void Mi4GBfilterTest() throws InterruptedException {
		mi.ClearallRAMfilter();
		Thread.sleep(1500);
		String RAMDetails = mi.RAM4GBVerification();
		Thread.sleep(1500);
		Assert.assertEquals(RAMDetails, "4 GB RAM | 64 GB ROM | Expandable Upto 256 GB");
		Thread.sleep(1500);

	}

	@Test (priority = 5)
	public void Mi3GBfilterTest() throws InterruptedException {
		mi.ClearallRAMfilter();
		Thread.sleep(1500);
		String RAMDetails = mi.Mi3GBRAMverification();
		Thread.sleep(2500);
		Assert.assertEquals(RAMDetails, "3 GB RAM | 32 GB ROM | Expandable Upto 256 GB");
		Thread.sleep(1500);

	}

	@Test (priority = 6)
	public void Mi2GBfilterTest() throws InterruptedException {
		mi.ClearallRAMfilter();
		Thread.sleep(1500);
		String RAMDetails = mi.Mi2GBRAMverification();
		Thread.sleep(1500);
		Assert.assertEquals(RAMDetails, "2 GB RAM | 16 GB ROM");
		Thread.sleep(1500);
	}

	@Test (priority = 7)
	public void Mi1GBfilterTest() throws InterruptedException {
		mi.ClearallRAMfilter();
		Thread.sleep(1500);
		String RAMDetails = mi.Mi1GBRAMverification();
		Assert.assertEquals(RAMDetails, "1 GB RAM | 8 GB ROM | Expandable Upto 128 GB");
		Thread.sleep(1500);
		mi.ClearallRAMfilter();
	}

	@Test (priority = 8)

	public void Mi256GBROMTest() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		mi.dropdownclick();
		Thread.sleep(1000);
		String RomText = mi.Mi256GBROMverification();
		Thread.sleep(2500);
		Assert.assertEquals(RomText, "8 GB RAM | 256 GB ROM");

	}

	@Test (priority = 9)

	public void Mi128GBROMTest() throws InterruptedException {
		mi.clearfilterveri();
		Thread.sleep(2000);
		mi.dropdownclick();
		Thread.sleep(1000);
		String RomText = mi.Mi128GBROMverification();
		Thread.sleep(2500);
		Assert.assertEquals(RomText, "6 GB RAM | 128 GB ROM | Expandable Upto 256 GB");

	}

	@Test (priority = 10)

	public void Mi64GBROMTest() throws InterruptedException {
		mi.clearfilterveri();
		Thread.sleep(2000);
		mi.dropdownclick();
		Thread.sleep(2000);
		String RomText = mi.Mi64GBROMverification();
		Thread.sleep(2500);
		Assert.assertEquals(RomText, "6 GB RAM | 64 GB ROM | Expandable Upto 256 GB");

	}

	@Test (priority = 11)

	public void Mi32GBROMTest() throws InterruptedException {
		mi.clearfilterveri();
		Thread.sleep(2000);
		mi.dropdownclick();
		Thread.sleep(2000);
		String RomText = mi.Mi32GBROMverification();
		Thread.sleep(2500);
		Assert.assertEquals(RomText, "3 GB RAM | 32 GB ROM | Expandable Upto 256 GB");

	}

	@Test (priority = 12)

	public void Mi16GBROMTest() throws InterruptedException {
		mi.clearfilterveri();
		Thread.sleep(2000);
		mi.dropdownclick();
		Thread.sleep(1000);
		String RomText = mi.Mi16GBROMverification();
		Thread.sleep(2500);
		Assert.assertEquals(RomText, "2 GB RAM | 16 GB ROM");

	}

	@Test (priority = 13)

	public void Mi8GBROMTest() throws InterruptedException {
		mi.clearfilterveri();
		Thread.sleep(2000);
		mi.dropdownclick();
		Thread.sleep(1000);
		String RomText = mi.Mi8GBROMverification();
		Thread.sleep(2500);
		Assert.assertEquals(RomText, "1 GB RAM | 8 GB ROM | Expandable Upto 128 GB");
		mi.clearfilterveri();
	}

	@Test (priority = 14)
	public void low_highTest() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(1500);
		String mobiledetail =mi.low_highVerification();
		Assert.assertEquals(mobiledetail, "Redmi Go (Black, 8 GB)");
	}

	@Test (priority = 15)
	public void high_lowTest() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(1500);
		String mobiledetail =mi.high_lowVerification();
		Assert.assertEquals(mobiledetail, "Redmi K20 Pro (Flame Red, 256 GB)");
	}

	@Test (priority = 16)
	public void newestTest() throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(1500);
		String mobiledetail =mi.newestVerification();
		Assert.assertEquals(mobiledetail, "Redmi Note 9 Pro (Interstellar Black, 64 GB)");
	}



	




}
