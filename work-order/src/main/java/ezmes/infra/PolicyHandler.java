package ezmes.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import ezmes.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import ezmes.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired WorkOrderRepository workOrderRepository;
    @Autowired WorkerStandardInformationRepository workerStandardInformationRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='EquipmentRegistered'")
    public void wheneverEquipmentRegistered_설비변경(@Payload EquipmentRegistered equipmentRegistered){

        EquipmentRegistered event = equipmentRegistered;
        System.out.println("\n\n##### listener 설비변경 : " + equipmentRegistered + "\n\n");


        

        // Sample Logic //
        WorkerStandardInformation.설비변경(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='EquipmentChanged'")
    public void wheneverEquipmentChanged_설비변경(@Payload EquipmentChanged equipmentChanged){

        EquipmentChanged event = equipmentChanged;
        System.out.println("\n\n##### listener 설비변경 : " + equipmentChanged + "\n\n");


        

        // Sample Logic //
        WorkerStandardInformation.설비변경(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='FacilityCanceled'")
    public void wheneverFacilityCanceled_설비변경(@Payload FacilityCanceled facilityCanceled){

        FacilityCanceled event = facilityCanceled;
        System.out.println("\n\n##### listener 설비변경 : " + facilityCanceled + "\n\n");


        

        // Sample Logic //
        WorkerStandardInformation.설비변경(event);
        

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='WorkerRegistered'")
    public void wheneverWorkerRegistered_작업자변경(@Payload WorkerRegistered workerRegistered){

        WorkerRegistered event = workerRegistered;
        System.out.println("\n\n##### listener 작업자변경 : " + workerRegistered + "\n\n");


        

        // Sample Logic //
        WorkerStandardInformation.작업자변경(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='WorkerChanged'")
    public void wheneverWorkerChanged_작업자변경(@Payload WorkerChanged workerChanged){

        WorkerChanged event = workerChanged;
        System.out.println("\n\n##### listener 작업자변경 : " + workerChanged + "\n\n");


        

        // Sample Logic //
        WorkerStandardInformation.작업자변경(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='WorkerCanceled'")
    public void wheneverWorkerCanceled_작업자변경(@Payload WorkerCanceled workerCanceled){

        WorkerCanceled event = workerCanceled;
        System.out.println("\n\n##### listener 작업자변경 : " + workerCanceled + "\n\n");


        

        // Sample Logic //
        WorkerStandardInformation.작업자변경(event);
        

        

    }

}


