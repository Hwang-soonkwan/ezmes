package ezmes.domain;

import ezmes.domain.*;
import ezmes.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class EquipmentRegistered extends AbstractEvent {

    private Long id;

    public EquipmentRegistered(Equipment aggregate){
        super(aggregate);
    }
    public EquipmentRegistered(){
        super();
    }
}
