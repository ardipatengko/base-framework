package id.project.baseframework.util.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Ardi.Patengko
 */
@Service
public class CustomRestTemplateImpl implements CustomRestTemplate {

    private static final Logger LOGGER = LoggerFactory.getLogger(CustomRestTemplateImpl.class);

//    @Value("${rest.default.timeout}")
    private Integer timeout = 5000;

    @Override
    public RestTemplate createRestTemplate() {
        return new RestTemplate(getClientHttpRequestFactory());
    }

    private ClientHttpRequestFactory getClientHttpRequestFactory() {
        LOGGER.info("Timeout Set to {}", timeout);
        SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        clientHttpRequestFactory.setConnectTimeout(timeout);
        clientHttpRequestFactory.setReadTimeout(timeout);
        return clientHttpRequestFactory;
    }
}
