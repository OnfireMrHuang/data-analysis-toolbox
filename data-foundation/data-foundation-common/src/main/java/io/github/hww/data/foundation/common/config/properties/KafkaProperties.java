package io.github.hww.data.foundation.common.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "kafka")
public class KafkaProperties {
    private String host;
    private String port;
    private String user;
    private String password;
}
