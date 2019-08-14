package com.example.isengiseng.iseng.controller;

import com.example.isengiseng.iseng.model.Role;
import com.example.isengiseng.iseng.model.User;
import com.example.isengiseng.iseng.service.RoleService;
import com.example.isengiseng.iseng.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserServices userService;
    @Autowired
    private RoleService roleService;

    //    @RequestMapping(value = "/roles",
//            method = RequestMethod.GET,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Role> getAllRole() {
//        return roleService.getAllRole();
//    }
//    @RequestMapping(value = "/table",
//            method = RequestMethod.GET,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Role> getAlalRole() {
//        return roleService.getAllRole();
//    }
//    @RequestMapping(value = "",
//            method = RequestMethod.GET,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Role> index(@Param("key") String key) {
//        return roleService.getAllRolebyuser(key);
//    }

    //
    @RequestMapping(value = "",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Role> indexs(@Param("keys") String key) {
        return userService.role(key);
    }

    @RequestMapping(value = "/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User get(@PathVariable("id") String id) {
        return userService.get(id);
    }
//
//
//    @RequestMapping(value = "/{id}",
//            method = RequestMethod.DELETE,
//            consumes = MediaType.APPLICATION_JSON_VALUE,
//            produces = MediaType.APPLICATION_JSON_VALUE)
//    public String delete(@PathVariable("id") String id) {
//        return userService.delete(id);
}

