package ezmes.domain;

import ezmes.WorkOrderApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="WorkerStandardInformation_table")
@Data

public class WorkerStandardInformation  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;


    public static WorkerStandardInformationRepository repository(){
        WorkerStandardInformationRepository workerStandardInformationRepository = WorkOrderApplication.applicationContext.getBean(WorkerStandardInformationRepository.class);
        return workerStandardInformationRepository;
    }




    public static void 설비변경(EquipmentRegistered equipmentRegistered){

        /** Example 1:  new item 
        WorkerStandardInformation workerStandardInformation = new WorkerStandardInformation();
        repository().save(workerStandardInformation);

        */

        /** Example 2:  finding and process
        
        repository().findById(equipmentRegistered.get???()).ifPresent(workerStandardInformation->{
            
            workerStandardInformation // do something
            repository().save(workerStandardInformation);


         });
        */

        
    }
    public static void 설비변경(EquipmentChanged equipmentChanged){

        /** Example 1:  new item 
        WorkerStandardInformation workerStandardInformation = new WorkerStandardInformation();
        repository().save(workerStandardInformation);

        */

        /** Example 2:  finding and process
        
        repository().findById(equipmentChanged.get???()).ifPresent(workerStandardInformation->{
            
            workerStandardInformation // do something
            repository().save(workerStandardInformation);


         });
        */

        
    }
    public static void 설비변경(FacilityCanceled facilityCanceled){

        /** Example 1:  new item 
        WorkerStandardInformation workerStandardInformation = new WorkerStandardInformation();
        repository().save(workerStandardInformation);

        */

        /** Example 2:  finding and process
        
        repository().findById(facilityCanceled.get???()).ifPresent(workerStandardInformation->{
            
            workerStandardInformation // do something
            repository().save(workerStandardInformation);


         });
        */

        
    }
    public static void 작업자변경(WorkerRegistered workerRegistered){

        /** Example 1:  new item 
        WorkerStandardInformation workerStandardInformation = new WorkerStandardInformation();
        repository().save(workerStandardInformation);

        */

        /** Example 2:  finding and process
        
        repository().findById(workerRegistered.get???()).ifPresent(workerStandardInformation->{
            
            workerStandardInformation // do something
            repository().save(workerStandardInformation);


         });
        */

        
    }
    public static void 작업자변경(WorkerChanged workerChanged){

        /** Example 1:  new item 
        WorkerStandardInformation workerStandardInformation = new WorkerStandardInformation();
        repository().save(workerStandardInformation);

        */

        /** Example 2:  finding and process
        
        repository().findById(workerChanged.get???()).ifPresent(workerStandardInformation->{
            
            workerStandardInformation // do something
            repository().save(workerStandardInformation);


         });
        */

        
    }
    public static void 작업자변경(WorkerCanceled workerCanceled){

        /** Example 1:  new item 
        WorkerStandardInformation workerStandardInformation = new WorkerStandardInformation();
        repository().save(workerStandardInformation);

        */

        /** Example 2:  finding and process
        
        repository().findById(workerCanceled.get???()).ifPresent(workerStandardInformation->{
            
            workerStandardInformation // do something
            repository().save(workerStandardInformation);


         });
        */

        
    }


}
