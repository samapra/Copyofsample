package com.c0deattack.cucumberjvmtutorial;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
//@Cucumber.Options(format={"pretty", "html:target/cucumber"})

//--TO RUN ALL THE FEATURES IN A FOLDER
//@Cucumber.Options(features="com/c0deattack/cucumberjvmtutorial")

//--TO RUN SPECIFIC FEATURE FILES
@Cucumber.Options(features={"com/c0deattack/cucumberjvmtutorial/deposit.feature","com/c0deattack/cucumberjvmtutorial/createaccount.feature"})
//@Cucumber.Options(features={"com/c0deattack/cucumberjvmtutorial/createaccount.feature"})

public class RunTests {
	
}