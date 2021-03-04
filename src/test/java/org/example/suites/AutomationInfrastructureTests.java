package org.example.suites;


import org.example.infrastructure.data.FileUserDataMapperTests;
import org.example.infrastructure.data.StringUtilsTests;
import org.example.infrastructure.data.UrlBuilderTests;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        FileUserDataMapperTests.class,
        StringUtilsTests.class,
        UrlBuilderTests.class
})
public class AutomationInfrastructureTests {

}
