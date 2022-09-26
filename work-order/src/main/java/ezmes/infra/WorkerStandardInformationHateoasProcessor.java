package ezmes.infra;
import ezmes.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class WorkerStandardInformationHateoasProcessor implements RepresentationModelProcessor<EntityModel<WorkerStandardInformation>>  {

    @Override
    public EntityModel<WorkerStandardInformation> process(EntityModel<WorkerStandardInformation> model) {

        
        return model;
    }
    
}
