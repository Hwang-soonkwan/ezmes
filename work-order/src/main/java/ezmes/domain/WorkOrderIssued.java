package ezmes.domain;

import ezmes.domain.*;
import ezmes.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class WorkOrderIssued extends AbstractEvent {

    private Long id;

    public WorkOrderIssued(WorkOrder aggregate){
        super(aggregate);
    }
    public WorkOrderIssued(){
        super();
    }
}
