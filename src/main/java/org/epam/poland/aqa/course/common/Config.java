package org.epam.poland.aqa.course.common;

import java.time.Duration;

public class Config {
    private Config(){}
    public static final String WEB_BROWSER = "Chrome";
    public static final Duration EXPLICIT_WAIT = Duration.ofSeconds(10);
}
