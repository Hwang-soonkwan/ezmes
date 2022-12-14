package ezmes.domain;

import ezmes.domain.*;
import ezmes.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class EquipmentChanged extends AbstractEvent {

    private Long id;

    public EquipmentChanged(Equipment aggregate){
        super(aggregate);
    }
    public EquipmentChanged(){
        super();
    }
}
