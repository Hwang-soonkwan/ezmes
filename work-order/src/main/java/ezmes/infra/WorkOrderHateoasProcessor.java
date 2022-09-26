package ezmes.infra;
import ezmes.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class WorkOrderHateoasProcessor implements RepresentationModelProcessor<EntityModel<WorkOrder>>  {

    @Override
    public EntityModel<WorkOrder> process(EntityModel<WorkOrder> model) {

        
        return model;
    }
    
}
