package desert;

import org.springframework.stereotype.Component;

import desert.qualifier.Cold;
import desert.qualifier.Fruity;

@Component
@Cold
@Fruity
public class Popsicle implements Desert{

}
