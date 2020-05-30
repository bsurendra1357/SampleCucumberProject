import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
// To override the cucumber options through command line options is
//sudo mvn clean test -Dcucumber.features="src/test/java/features/batTests/Bat01.feature"
//                    -Dcucumber.glue="Steps"
//                    -Dcucumber.plugin="junit:target/cucumber/report.json"
//                    -Dcucumber.tags="@smoke"

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/java/features",
        glue= "Steps",
        plugin = {"pretty", "html:target/cucumber"},
        strict = true )
public class TestRunner {

}
