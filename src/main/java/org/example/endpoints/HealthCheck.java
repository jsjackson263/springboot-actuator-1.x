package org.example.endpoints;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class HealthCheck implements HealthIndicator {

  @Override
  public Health health() {

    int errorCode = check(); // perform some specific health checks here
    if (errorCode != 0) {
      return Health.down().withDetail("Error Code", errorCode).build();
    }
    return Health.up().build();

  }


  public int check() {
    // logic to check health
    return 0;
  }


}
