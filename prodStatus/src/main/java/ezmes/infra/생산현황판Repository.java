package ezmes.infra;

import ezmes.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "생산현황판",
    path = "생산현황판"
)
public interface 생산현황판Repository
    extends PagingAndSortingRepository<생산현황판, Long> {
    // keep

}
