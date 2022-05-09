package sk.balaz.springbootkafka.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "topic",
            groupId = "groupId"
    )
    public void listen(String data) {
        System.out.println("Listener received: " + data);
    }
}
