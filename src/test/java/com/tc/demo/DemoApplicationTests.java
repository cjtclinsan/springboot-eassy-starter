package com.tc.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    JdbcTemplate db1JdbcTemplate;

    @Test
    public void selectDataSource(){
        String sql = "insert into t_member(name, addr, age) values ('mic2', '浙江', 30)";
        db1JdbcTemplate.execute(sql);
    }

}
