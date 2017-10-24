package com.habuna.restfun;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by drpsy on 25-Oct-17 (01:01).
 */
public class MagicExistsCondition implements Condition {

  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    if (context.getEnvironment() != null) {
      Environment env = context.getEnvironment();
      return !env.containsProperty("magic");  // Shall non contain 'magic'
    }
    return false;
  }
}
