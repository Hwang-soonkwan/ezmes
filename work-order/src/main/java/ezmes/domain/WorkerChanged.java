package ezmes.domain;

import ezmes.domain.*;
import ezmes.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class WorkerChanged extends AbstractEvent {

    private Long id;
}


