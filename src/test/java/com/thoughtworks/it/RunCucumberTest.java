package com.thoughtworks.it;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "junit:target/cucumber-report/cucumber.xml",
                "json:target/cucumber-report/cucumber.json",
                "html:target/cucumber-reports"
        },

        tags = "not @ignore",

        features = "classpath:features/")
public class RunCucumberTest {

}
