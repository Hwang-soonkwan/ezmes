package ezmes.domain;

import ezmes.domain.WorkOrderIssued;
import ezmes.domain.WorkOrderChanged;
import ezmes.domain.WorkOrderCanceled;
import ezmes.WorkOrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="WorkOrder_table")
@Data

public class WorkOrder  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    @Embedded
    @AttributeOverride(name="id", column= @Column(name="equipmentIdId", nullable=true))

    private EquipmentId equipmentId;
    
    
    
    @Embedded
    @AttributeOverride(name="id", column= @Column(name="workerIdId", nullable=true))

    private WorkerId workerId;

    @PostPersist
    public void onPostPersist(){


        WorkOrderIssued workOrderIssued = new WorkOrderIssued(this);
        workOrderIssued.publishAfterCommit();



        WorkOrderChanged workOrderChanged = new WorkOrderChanged(this);
        workOrderChanged.publishAfterCommit();



        WorkOrderCanceled workOrderCanceled = new WorkOrderCanceled(this);
        workOrderCanceled.publishAfterCommit();

    }

    public static WorkOrderRepository repository(){
        WorkOrderRepository workOrderRepository = WorkOrderApplication.applicationContext.getBean(WorkOrderRepository.class);
        return workOrderRepository;
    }






}
