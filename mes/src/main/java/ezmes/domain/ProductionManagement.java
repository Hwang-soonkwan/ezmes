package ezmes.domain;

import ezmes.domain.ProductionStatusRegistered;
import ezmes.domain.ProductionStatusCanceled;
import ezmes.domain.ProductionStatusChanged;
import ezmes.domain.WorkerChangeRequested;
import ezmes.domain.EquipmentChangeRequested;
import ezmes.MesApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="ProductionManagement_table")
@Data

public class ProductionManagement  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        ProductionStatusRegistered productionStatusRegistered = new ProductionStatusRegistered(this);
        productionStatusRegistered.publishAfterCommit();



        ProductionStatusCanceled productionStatusCanceled = new ProductionStatusCanceled(this);
        productionStatusCanceled.publishAfterCommit();



        ProductionStatusChanged productionStatusChanged = new ProductionStatusChanged(this);
        productionStatusChanged.publishAfterCommit();



        WorkerChangeRequested workerChangeRequested = new WorkerChangeRequested(this);
        workerChangeRequested.publishAfterCommit();



        EquipmentChangeRequested equipmentChangeRequested = new EquipmentChangeRequested(this);
        equipmentChangeRequested.publishAfterCommit();

    }

    public static ProductionManagementRepository repository(){
        ProductionManagementRepository productionManagementRepository = MesApplication.applicationContext.getBean(ProductionManagementRepository.class);
        return productionManagementRepository;
    }




    public static void 작업요청(WorkOrderIssued workOrderIssued){

        /** Example 1:  new item 
        ProductionManagement productionManagement = new ProductionManagement();
        repository().save(productionManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(workOrderIssued.get???()).ifPresent(productionManagement->{
            
            productionManagement // do something
            repository().save(productionManagement);


         });
        */

        
    }
    public static void 작업변경(WorkOrderChanged workOrderChanged){

        /** Example 1:  new item 
        ProductionManagement productionManagement = new ProductionManagement();
        repository().save(productionManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(workOrderChanged.get???()).ifPresent(productionManagement->{
            
            productionManagement // do something
            repository().save(productionManagement);


         });
        */

        
    }
    public static void 작업취소(WorkOrderCanceled workOrderCanceled){

        /** Example 1:  new item 
        ProductionManagement productionManagement = new ProductionManagement();
        repository().save(productionManagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(workOrderCanceled.get???()).ifPresent(productionManagement->{
            
            productionManagement // do something
            repository().save(productionManagement);


         });
        */

        
    }


}
