import org.assertj.core.api.SoftAssertions;
import org.junit.Before;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Reporter {

    public static SoftAssertions soft;

    public Reporter() {
        soft = new SoftAssertions();
    }

    public static void assertTest(Object actual, Object expected)
    {
        soft.assertThat(actual).isEqualTo(expected);
    }

    public static void assertThat(Object actual, Object expected)
    {
        soft.assertThat(actual).isEqualTo(expected);
    }

    public static Object fetchValue(String key) throws IOException, FileNotFoundException {
        FileInputStream file = new FileInputStream("src\\test\\resources\\ConfigFile\\apiconfig");
        //FileInputStream file = new FileInputStream("C:\\Users\\chetan.mali\\IdeaProjects\\Paytm_Test\\src\\test\\resources\\ConfigFile\\apiConfig");
        Properties property = new Properties();
        property.load(file);
        return property.get(key);

    }

}
