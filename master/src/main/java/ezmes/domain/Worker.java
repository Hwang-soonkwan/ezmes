package ezmes.domain;

import ezmes.domain.WorkerRegistered;
import ezmes.domain.WorkerChanged;
import ezmes.domain.WorkerCanceled;
import ezmes.MasterApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Worker_table")
@Data

public class Worker  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;

    @PostPersist
    public void onPostPersist(){


        WorkerRegistered workerRegistered = new WorkerRegistered(this);
        workerRegistered.publishAfterCommit();



        WorkerChanged workerChanged = new WorkerChanged(this);
        workerChanged.publishAfterCommit();



        WorkerCanceled workerCanceled = new WorkerCanceled(this);
        workerCanceled.publishAfterCommit();

    }

    public static WorkerRepository repository(){
        WorkerRepository workerRepository = MasterApplication.applicationContext.getBean(WorkerRepository.class);
        return workerRepository;
    }




    public static void 변경요청(WorkerChangeRequested workerChangeRequested){

        /** Example 1:  new item 
        Worker worker = new Worker();
        repository().save(worker);

        */

        /** Example 2:  finding and process
        
        repository().findById(workerChangeRequested.get???()).ifPresent(worker->{
            
            worker // do something
            repository().save(worker);


         });
        */

        
    }


}
