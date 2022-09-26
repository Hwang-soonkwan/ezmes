package ezmes.infra;

import ezmes.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="작지변경요청화면", path="작지변경요청화면")
public interface 작지변경요청화면Repository extends PagingAndSortingRepository<작지변경요청화면, Long> {

    

    
}
