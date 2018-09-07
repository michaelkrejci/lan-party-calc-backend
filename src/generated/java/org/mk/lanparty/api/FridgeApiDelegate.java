package org.mk.lanparty.api;

import org.mk.lanparty.model.InventoryItem;
import org.mk.lanparty.model.Order;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Optional;

/**
 * A delegate to be called by the {@link FridgeApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-07T12:00:30.348+02:00")

public interface FridgeApiDelegate {

    Logger log = LoggerFactory.getLogger(FridgeApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    /**
     * @see FridgeApi#deleteOrder
     */
    default ResponseEntity<Void> deleteOrder(Long orderId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default FridgeApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see FridgeApi#getInventory
     */
    default ResponseEntity<List<InventoryItem>> getInventory() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"quantity\" : 0,  \"drink\" : {    \"name\" : \"Wieselburger\",    \"id\" : 0,    \"tags\" : [ {      \"name\" : \"name\",      \"id\" : 6    }, {      \"name\" : \"name\",      \"id\" : 6    } ]  }}, {  \"quantity\" : 0,  \"drink\" : {    \"name\" : \"Wieselburger\",    \"id\" : 0,    \"tags\" : [ {      \"name\" : \"name\",      \"id\" : 6    }, {      \"name\" : \"name\",      \"id\" : 6    } ]  }} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default FridgeApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see FridgeApi#getOrderById
     */
    default ResponseEntity<Order> getOrderById(Long orderId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/xml")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("<Order>  <id>123456789</id>  <quantity>123</quantity>  <shipDate>2000-01-23T04:56:07.000Z</shipDate></Order>", Order.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/xml", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"quantity\" : 6,  \"id\" : 0,  \"shipDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"drink\" : {    \"name\" : \"Wieselburger\",    \"id\" : 0,    \"tags\" : [ {      \"name\" : \"name\",      \"id\" : 6    }, {      \"name\" : \"name\",      \"id\" : 6    } ]  }}", Order.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default FridgeApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    /**
     * @see FridgeApi#placeOrder
     */
    default ResponseEntity<Order> placeOrder(Order body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/xml")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("<Order>  <id>123456789</id>  <quantity>123</quantity>  <shipDate>2000-01-23T04:56:07.000Z</shipDate></Order>", Order.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/xml", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"quantity\" : 6,  \"id\" : 0,  \"shipDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"drink\" : {    \"name\" : \"Wieselburger\",    \"id\" : 0,    \"tags\" : [ {      \"name\" : \"name\",      \"id\" : 6    }, {      \"name\" : \"name\",      \"id\" : 6    } ]  }}", Order.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default FridgeApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
