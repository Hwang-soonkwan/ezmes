package ezmes.infra;

import ezmes.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="기준정보", path="기준정보")
public interface 기준정보Repository extends PagingAndSortingRepository<기준정보, Long> {

    

    
}
