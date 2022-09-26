package ezmes.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="작지변경요청화면_table")
@Data
public class 작지변경요청화면 {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}