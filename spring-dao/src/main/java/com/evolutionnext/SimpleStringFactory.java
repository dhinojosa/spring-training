package com.evolutionnext;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 11/15/11
 * Time: 3:20 PM
 */
@Component
public class SimpleStringFactory {

    @Bean
    @Qualifier("someName")
    public String getName() {
        return "foo";
    }
}
