package ezmes.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "생산현황판_table")
@Data
public class 생산현황판 {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
