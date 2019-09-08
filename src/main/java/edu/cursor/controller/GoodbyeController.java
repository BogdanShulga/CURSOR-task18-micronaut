package edu.cursor.controller;

import edu.cursor.service.GoodbyeService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;

import javax.inject.Inject;
import java.security.Principal;

@Secured("isAuthenticated()")
@Controller
public class GoodbyeController {

    @Inject
    private GoodbyeService goodbyeService;

    @Get("/goodbye")
    public String index(Principal principal) {
        return principal.getName() + goodbyeService.sayGoodbye();
    }
}