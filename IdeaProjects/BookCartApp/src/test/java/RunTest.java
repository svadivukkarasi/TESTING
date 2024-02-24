import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@CucumberOptions(
        features = {"src/test/features/"},
        dryRun = !true,
        glue = "steps",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true

)
public class RunTest {
}
