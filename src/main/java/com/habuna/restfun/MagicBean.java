package com.habuna.restfun;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * Created by drpsy on 25-Oct-17 (01:04).
 */
@Component
@Conditional(MagicExistsCondition.class)
public class MagicBean {

}
