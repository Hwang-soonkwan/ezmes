package ezmes.domain;

import ezmes.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="productionManagements", path="productionManagements")
public interface ProductionManagementRepository extends PagingAndSortingRepository<ProductionManagement, Long>{

}
