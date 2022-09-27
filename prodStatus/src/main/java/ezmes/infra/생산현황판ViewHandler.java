package ezmes.infra;

import ezmes.config.kafka.KafkaProcessor;
import ezmes.domain.*;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class 생산현황판ViewHandler {

    @Autowired
    private 생산현황판Repository 생산현황판Repository;
    // keep

}
