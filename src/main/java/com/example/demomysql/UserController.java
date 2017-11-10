package com.example.demomysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value = "list")
    public Object list() {
        return jdbcTemplate.queryForList("select * from user");
    }

}
