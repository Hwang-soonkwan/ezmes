package ezmes.domain;

import ezmes.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="workerStandardInformations", path="workerStandardInformations")
public interface WorkerStandardInformationRepository extends PagingAndSortingRepository<WorkerStandardInformation, Long>{

}
