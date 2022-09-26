package ezmes.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="기준정보_table")
@Data
public class 기준정보 {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}