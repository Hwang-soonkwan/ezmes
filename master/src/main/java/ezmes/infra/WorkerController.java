package ezmes.infra;

import ezmes.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/workers")
@Transactional
public class WorkerController {

    @Autowired
    WorkerRepository workerRepository;

    @RequestMapping(
        value = "workers/{id}/cancel",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public Worker facilityCancellation(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /worker/facilityCancellation  called #####");
        Optional<Worker> optionalWorker = workerRepository.findById(id);

        optionalWorker.orElseThrow(() -> new Exception("No Entity Found"));
        Worker worker = optionalWorker.get();
        worker.facilityCancellation();

        workerRepository.save(worker);
        return worker;
    }
    // keep
}
