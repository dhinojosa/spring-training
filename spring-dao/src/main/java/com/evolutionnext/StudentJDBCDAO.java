package com.evolutionnext;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 11/14/11
 * Time: 7:52 PM
 */
public class StudentJDBCDAO {
    private JdbcTemplate jdbcTemplate;

    public StudentJDBCDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void persist() {

    }
}
