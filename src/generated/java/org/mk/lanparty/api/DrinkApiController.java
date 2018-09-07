package org.mk.lanparty.api;

import org.springframework.stereotype.Controller;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-07T12:00:30.348+02:00")

@Controller
public class DrinkApiController implements DrinkApi {

    private final DrinkApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public DrinkApiController(DrinkApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public DrinkApiDelegate getDelegate() {
        return delegate;
    }
}
