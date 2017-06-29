package desert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import desert.qualifier.Cold;
import desert.qualifier.Fruity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DesertConfig.class)
//@ContextConfiguration("classpath:desert/desert.xml")
public class DesertTest {
	@Autowired
	//@Qualifier("cookie")//not good as it is the bean's default id, and it is coupled to bean's class name
	
	//can't have multiple @Qualifiers on same item since @Qualifier is not @Repeatable
	//solutions, use custom qualifier annotations: @Code and @Crispy
	//@Qualifier("cold")
	//@Qualifier("cripsy")
	@Cold
	@Fruity
	Desert desert;
	
	//when only one subclasses has @Primary, it will work
	//when only 2 or more subclasses has @Primary, it will not work
	@Test
	public void eatDeDsert(){
		System.out.println("bean's class: "+desert.getClass().getName());
	}
}
