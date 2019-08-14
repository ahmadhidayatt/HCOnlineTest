package com.example.isengiseng.iseng.request;


import javax.validation.constraints.NotEmpty;

public class RoleRequest {
    @NotEmpty
    private String id;
    @NotEmpty
    private String role_index;
    @NotEmpty
    private String role_val;
    @NotEmpty
    private String user;
}
