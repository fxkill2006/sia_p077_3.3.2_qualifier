package desert;

import org.springframework.stereotype.Component;

import desert.qualifier.Cold;
import desert.qualifier.Creamy;

@Component
@Cold
@Creamy
public class IceCream implements Desert{

}
