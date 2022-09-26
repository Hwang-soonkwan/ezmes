package ezmes.domain;

import ezmes.domain.*;
import ezmes.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class WorkerRegistered extends AbstractEvent {

    private Long id;

    public WorkerRegistered(Worker aggregate){
        super(aggregate);
    }
    public WorkerRegistered(){
        super();
    }
}
