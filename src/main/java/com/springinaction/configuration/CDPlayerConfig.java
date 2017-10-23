package com.springinaction.configuration;

import com.springinaction.soundsystem.CDPlayer;
import com.springinaction.soundsystem.CompactDisc;
import com.springinaction.soundsystem.SgtPeppers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by drpsy on 23-Oct-17 (22:06).
 */
@Configuration
public class CDPlayerConfig {

  @Bean
  public CompactDisc sgtPeppers() {
    return new SgtPeppers();
  }

  @Bean //  The ID of the bean will be cdPlayer, the same as the method's name.
  public CDPlayer cdPlayer(CompactDisc compactDisc) { // Spring autowires a CompactDisc into the configuration method.
    // By default, all beans in Spring are singletons, so Spring will intercept any calls to 'sgtPeppers' and ensure
    // that the bean produced by that method is returned rather than allowing it to be invoked again.
    return new CDPlayer(compactDisc);
  }
}
