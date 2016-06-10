package tests;

import org.junit.Test;

import PgObject.HomePgObject;
import util.Base;

public class HomePg extends Base {
	
	@Test
	public void createAccount(){
		common.click(homepgobj.Account);
		common.click(homepgobj.createAccount);
		
	}

}