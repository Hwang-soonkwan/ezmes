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
public class 작지변경요청화면ViewHandler {


    @Autowired
    private 작지변경요청화면Repository 작지변경요청화면Repository;




}

