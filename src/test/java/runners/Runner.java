
package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/cucumber-reports/regression.html"},
        features = "classpath:Features",   // 🔥 burada classpath kullanıyoruz
        glue = "stepDefinitions",
        tags = "@ptt",
        dryRun = false
)
public class Runner {
}
