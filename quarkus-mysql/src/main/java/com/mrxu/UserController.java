package com.mrxu;

import com.mrxu.entity.User;
import com.mrxu.repository.UserRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author jlxu@telenav.cn
 * @date 2021/6/24 15:03
 */
@Path("user")
public class UserController {
    @Inject
    private UserRepository repository;

    @GET
    @Path("/add")
    @Produces(MediaType.APPLICATION_JSON)
    public String addUser(){
        repository.createUser();
        return "ok";
    }
}
