package com.howOldAreYou;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"classpath:featureFiles"}, tags = "@Age",
        plugin = {"pretty", "html:target/html/index.html"})
public class TestRunner {
}
