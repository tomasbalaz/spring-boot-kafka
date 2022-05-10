package sk.balaz.springbootkafka;

import java.time.LocalDateTime;

public record Message(String message,
                      LocalDateTime createdAt) {
}
