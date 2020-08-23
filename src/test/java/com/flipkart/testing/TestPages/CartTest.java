package com.flipkart.testing.TestPages;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import com.flipkart.testing.BaseClass.Basecls;
import com.flipkart.testing.Pages.Cart;

public class CartTest extends Basecls {

	Cart cart;
	public CartTest() {
		super();
	}

	@BeforeTest()
		public void setup() {
			intialization();
		cart=new Cart();
	}
	
	@Test (priority = 1)
	public void pageTest() {
	String txt=cart.PageTitle();
	Assert.assertEquals(txt, txt);
	
		
	}
	
}
