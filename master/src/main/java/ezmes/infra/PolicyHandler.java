package ezmes.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import ezmes.config.kafka.KafkaProcessor;
import ezmes.domain.*;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    EquipmentRepository equipmentRepository;

    @Autowired
    WorkerRepository workerRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='EquipmentChangeRequested'"
    )
    public void wheneverEquipmentChangeRequested_RequestForChange(
        @Payload EquipmentChangeRequested equipmentChangeRequested
    ) {
        EquipmentChangeRequested event = equipmentChangeRequested;
        System.out.println(
            "\n\n##### listener RequestForChange : " +
            equipmentChangeRequested +
            "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='WorkerChangeRequested'"
    )
    public void wheneverWorkerChangeRequested_RequestForChange(
        @Payload WorkerChangeRequested workerChangeRequested
    ) {
        WorkerChangeRequested event = workerChangeRequested;
        System.out.println(
            "\n\n##### listener RequestForChange : " +
            workerChangeRequested +
            "\n\n"
        );

        // Sample Logic //
        Worker.requestForChange(event);
    }
    // keep

}
