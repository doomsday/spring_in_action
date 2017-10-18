package com.springinaction.knights;

import java.io.PrintStream;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by drpsy on 18-Oct-17 (22:59).
 */
@Aspect
public class Minstrel {

  private PrintStream stream;

  public Minstrel(PrintStream stream) { // PrintStream injected through its constructor.
    this.stream = stream;
  }

  @Before("execution(* *.embarkOnQuest(..))")
  public void singBeforeQuest() { // Called before quest.
    stream.println("Fa la la, the knight is so brave!");
  }

  @After("execution(* *.embarkOnQuest(..))")
  public void singAfterQuest() {  // Called after quest.
    stream.println("The hee hee, the brave knight did embark on a quest!");
  }

}
