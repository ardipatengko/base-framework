package id.project.baseframework.util.rest;

import org.springframework.web.client.RestTemplate;

/**
 * @author Ardi.Patengko
 */
public interface CustomRestTemplate {
    RestTemplate createRestTemplate();
}
