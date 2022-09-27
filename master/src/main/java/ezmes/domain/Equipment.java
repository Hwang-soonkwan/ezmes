package ezmes.domain;

import ezmes.MasterApplication;
import ezmes.domain.EquipmentChanged;
import ezmes.domain.EquipmentRegistered;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Equipment_table")
@Data
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @PostPersist
    public void onPostPersist() {
        EquipmentRegistered equipmentRegistered = new EquipmentRegistered(this);
        equipmentRegistered.publishAfterCommit();

        EquipmentChanged equipmentChanged = new EquipmentChanged(this);
        equipmentChanged.publishAfterCommit();
    }

    @PreUpdate
    public void onPreUpdate() {}

    public static EquipmentRepository repository() {
        EquipmentRepository equipmentRepository = MasterApplication.applicationContext.getBean(
            EquipmentRepository.class
        );
        return equipmentRepository;
    }
}
