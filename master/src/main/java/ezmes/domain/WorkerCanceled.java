package ezmes.domain;

import ezmes.domain.*;
import ezmes.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class WorkerCanceled extends AbstractEvent {

    private Long id;

    public WorkerCanceled(Worker aggregate){
        super(aggregate);
    }
    public WorkerCanceled(){
        super();
    }
}
