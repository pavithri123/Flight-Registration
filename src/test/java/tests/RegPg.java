package tests;

import org.junit.Test;
import org.openqa.selenium.By;

import util.Base;

public class RegPg extends Base {
	
	@Test
	public void registration(){
		
		common.fill("Pavithri", regpgobj.firstName);
		common.fill("Fernando", regpgobj.lastName);
		common.fill("pavithrifdo@gmail.com", regpgobj.email);
		common.fill("1234", regpgobj.pwd);
		common.fill("1234", regpgobj.conPwd);
		common.click(regpgobj.createAccount);
	}

}

