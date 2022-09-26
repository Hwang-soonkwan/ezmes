package ezmes.infra;
import ezmes.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class EquipmentHateoasProcessor implements RepresentationModelProcessor<EntityModel<Equipment>>  {

    @Override
    public EntityModel<Equipment> process(EntityModel<Equipment> model) {
        model.add(Link.of(model.getRequiredLink("self").getHref() + "/cancel").withRel("cancel"));

        
        return model;
    }
    
}
