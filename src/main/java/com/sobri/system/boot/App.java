package com.sobri.system.boot;

import static spark.Spark.*;

public class App {

    public void start() {
        get("/hello", (request, response) -> "Hello World!");
    }
}
