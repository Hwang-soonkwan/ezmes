package ezmes.common;


import ezmes.MesApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { MesApplication.class })
public class CucumberSpingConfiguration {
    
}
