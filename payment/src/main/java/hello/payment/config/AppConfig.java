package hello.payment.config;

import com.siot.IamportRestClient.IamportClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    String apiKey = "내 rest api키";
    String secretKey = "내 시크릿 키";
    @Bean
    public IamportClient iamportClient() {
        return new IamportClient(apiKey,secretKey);
    }
}
