package ezmes.domain;

import ezmes.domain.EquipmentRegistered;
import ezmes.domain.EquipmentChanged;
import ezmes.MasterApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Equipment_table")
@Data

public class Equipment  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    
    private String name;

    @PostPersist
    public void onPostPersist(){

        EquipmentRegistered equipmentRegistered = new EquipmentRegistered(this);
        equipmentRegistered.publishAfterCommit();

        EquipmentChanged equipmentChanged = new EquipmentChanged(this);
        equipmentChanged.publishAfterCommit();

    }

    @PreUpdate
    public void onPreUpdate(){
    }

    public static EquipmentRepository repository(){
        EquipmentRepository equipmentRepository = MasterApplication.applicationContext.getBean(EquipmentRepository.class);
        return equipmentRepository;
    }



    public void 설비취소(){
        FacilityCanceled facilityCanceled = new FacilityCanceled(this);
        facilityCanceled.publishAfterCommit();

    }

    public static void 변경요청(EquipmentChangeRequested equipmentChangeRequested){

        /** Example 1:  new item 
        Equipment equipment = new Equipment();
        repository().save(equipment);

        */

        /** Example 2:  finding and process
        
        repository().findById(equipmentChangeRequested.get???()).ifPresent(equipment->{
            
            equipment // do something
            repository().save(equipment);


         });
        */

        
    }


}
