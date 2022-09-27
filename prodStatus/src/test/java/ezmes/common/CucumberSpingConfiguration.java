package ezmes.common;

import ezmes.ProdStatusApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProdStatusApplication.class })
public class CucumberSpingConfiguration {}
