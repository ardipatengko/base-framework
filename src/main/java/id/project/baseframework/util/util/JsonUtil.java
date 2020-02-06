package id.project.baseframework.util.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ardi.Patengko
 */
public class JsonUtil {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtil.class);

    static ObjectMapper objectMapper;

    public static <T> String getString(T request) {
        String xmlString = "";
        try {
            if(objectMapper == null) {
                objectMapper = new ObjectMapper();
            }
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            return objectMapper.writeValueAsString(request);
        } catch (JsonProcessingException e) {
            LOGGER.error("ERROR failed to get json string", e);
        }
        return xmlString;
    }
}
