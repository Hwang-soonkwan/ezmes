package ezmes.infra;
import ezmes.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class ProductionManagementHateoasProcessor implements RepresentationModelProcessor<EntityModel<ProductionManagement>>  {

    @Override
    public EntityModel<ProductionManagement> process(EntityModel<ProductionManagement> model) {

        
        return model;
    }
    
}
