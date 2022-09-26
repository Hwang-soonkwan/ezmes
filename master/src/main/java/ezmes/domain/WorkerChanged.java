package ezmes.domain;

import ezmes.domain.*;
import ezmes.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class WorkerChanged extends AbstractEvent {

    private Long id;

    public WorkerChanged(Worker aggregate){
        super(aggregate);
    }
    public WorkerChanged(){
        super();
    }
}
