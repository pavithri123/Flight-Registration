package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.HomePg;
import tests.RegPg;
import util.Base;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	HomePg.class,RegPg.class
})

public class Test {

}

