package ezmes.domain;

import ezmes.domain.*;
import ezmes.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FacilityCanceled extends AbstractEvent {

    private Long id;

    public FacilityCanceled(Equipment aggregate){
        super(aggregate);
    }
    public FacilityCanceled(){
        super();
    }
}
