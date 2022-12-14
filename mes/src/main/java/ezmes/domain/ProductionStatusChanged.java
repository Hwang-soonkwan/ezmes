package ezmes.domain;

import ezmes.domain.*;
import ezmes.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ProductionStatusChanged extends AbstractEvent {

    private Long id;

    public ProductionStatusChanged(ProductionManagement aggregate){
        super(aggregate);
    }
    public ProductionStatusChanged(){
        super();
    }
}
