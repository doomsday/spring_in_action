package com.springinaction.knights;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

/**
 * Created by drpsy on 19-Oct-17 (01:00).
 */
public class SpringJdbcBean {

  private final JdbcTemplate jdbcTemplate;

  @Autowired
  public SpringJdbcBean(JdbcTemplate jdbcTemplate) {
    this.jdbcTemplate = jdbcTemplate;
  }

  public Computer getComputerById(short code) {
    return jdbcTemplate.queryForObject("SELECT code, model, speed, ram, hd, price, screen "
        + "FROM laptop WHERE code=?", new RowMapper<Computer>() {
      public Computer mapRow(ResultSet resultSet, int i) throws SQLException {
        Computer computer = new Computer();
        computer.setCode(resultSet.getShort("code"));
        computer.setModel(resultSet.getShort("model"));
        computer.setSpeed(resultSet.getShort("speed"));
        computer.setRam(resultSet.getShort("ram"));
        computer.setHd(resultSet.getShort("hd"));
        computer.setPrice(resultSet.getLong("price"));
        computer.setScreen(resultSet.getShort("screen"));
        return computer;
      }
    }, code);
  }
}
