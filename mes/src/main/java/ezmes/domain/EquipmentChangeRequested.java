package ezmes.domain;

import ezmes.domain.*;
import ezmes.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class EquipmentChangeRequested extends AbstractEvent {

    private Long id;

    public EquipmentChangeRequested(ProductionManagement aggregate){
        super(aggregate);
    }
    public EquipmentChangeRequested(){
        super();
    }
}
