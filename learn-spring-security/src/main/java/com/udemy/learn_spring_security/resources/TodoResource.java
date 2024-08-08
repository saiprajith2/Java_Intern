package com.udemy.learn_spring_security.resources;

import jakarta.annotation.security.RolesAllowed;
import org.slf4j.LoggerFactory;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.slf4j.Logger;

@RestController
public class TodoResource {

    private Logger logger= LoggerFactory.getLogger(getClass());

    public static final List<Todo> TODO_LIST = List.of(new Todo("prajith", "Learn AWS"),
            new Todo("prajith", "Get AWS Certified"));

    @GetMapping("/todos")
    public List<Todo> retrieveAllTodos() {
        return TODO_LIST;
    }

    @GetMapping("/users/{username}/todos")
    @PreAuthorize("hasRole('USER') and #username==authentication.name")
    @PostAuthorize("returnObject.username=='prajith'")
    @RolesAllowed({"ADMIN", "USER"})
    @Secured({"ROLE_ADMIN","ROLE_USER"})
    public Todo retrieveTodosForSpecificUser(@PathVariable String username) {
        return TODO_LIST.get(0);
    }

    @PostMapping("/users/{username}/todos")
    public void createTodoForSpecificUser(@PathVariable String username, @RequestBody Todo todo) {
        logger.info("Create {} for {}",todo,username);
    }


}
record Todo(String username, String description) {}
