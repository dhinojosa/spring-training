package com.evolutionnext;

import org.joda.time.DateTime;

import javax.print.attribute.standard.DateTimeAtCompleted;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 11/13/11
 * Time: 9:01 PM
 */
public class TimedAspect {

    public void timed() {
        System.out.println("Created" + new DateTime());
    }
}
