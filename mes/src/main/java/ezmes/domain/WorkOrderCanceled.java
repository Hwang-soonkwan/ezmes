package ezmes.domain;

import ezmes.domain.*;
import ezmes.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class WorkOrderCanceled extends AbstractEvent {

    private Long id;
}


