package ezmes.infra;

import ezmes.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="작지발행화면", path="작지발행화면")
public interface 작지발행화면Repository extends PagingAndSortingRepository<작지발행화면, Long> {

    

    
}
