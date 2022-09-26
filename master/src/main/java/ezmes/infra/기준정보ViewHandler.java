package ezmes.infra;

import ezmes.domain.*;
import ezmes.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class 기준정보ViewHandler {


    @Autowired
    private 기준정보Repository 기준정보Repository;




}

