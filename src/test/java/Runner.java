import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src\\test\\resources\\"},
        format = {"pretty", "html:target/Destination"} ,
//plugin = {"org.jetbrains.plugins.cucumber.java.run.CucumberJvmSMFormatter"},
        tags={"@API"},
        monochrome = true
//        glue={"java","resources"}


)
public class Runner {
}