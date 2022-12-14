package ezmes.domain;

import ezmes.domain.*;
import ezmes.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ProductionStatusCanceled extends AbstractEvent {

    private Long id;

    public ProductionStatusCanceled(ProductionManagement aggregate){
        super(aggregate);
    }
    public ProductionStatusCanceled(){
        super();
    }
}
