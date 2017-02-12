package read;

import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.junit.jupiter.api.Test;

/**
 * Created by a07 on 17/1/12.
 */
public class Read_xml {
    @Test
    public void test() {
        Configurations config = new Configurations();
        try {
            XMLConfiguration configuration = config.xml("/Users/a07/IdeaProjects/myproject/Commons_Configuration/src/Book.xml");
            String isbn = configuration.getString("JAVA.ISBN");
            System.out.println(isbn);
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }
}
