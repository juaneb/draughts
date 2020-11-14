package juaneb.models;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	TurnTest.class, 
	StateTest.class, 
	GameBuilderTest.class,
	GameBuilderTestLF.class,
})

public class AllmodelTest {
    
}
