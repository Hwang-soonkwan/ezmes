package ezmes.common;


import ezmes.생산현황관리Application;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { 생산현황관리Application.class })
public class CucumberSpingConfiguration {
    
}
