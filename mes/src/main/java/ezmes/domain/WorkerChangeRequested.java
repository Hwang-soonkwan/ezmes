package ezmes.domain;

import ezmes.domain.*;
import ezmes.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class WorkerChangeRequested extends AbstractEvent {

    private Long id;

    public WorkerChangeRequested(ProductionManagement aggregate){
        super(aggregate);
    }
    public WorkerChangeRequested(){
        super();
    }
}
