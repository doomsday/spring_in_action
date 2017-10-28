package com.springinaction.soundsystem;

/**
 * Created by drpsy on 28-Oct-17 (23:32).
 */
public class Connection {
  private Integer connectionCount;

  public Connection(Integer connectionCount) {
    setConnectionCount(connectionCount);
  }

  public Integer getConnectionCount() {
    return connectionCount;
  }

  public void setConnectionCount(Integer connectionCount) {
    this.connectionCount = connectionCount;
  }
}
