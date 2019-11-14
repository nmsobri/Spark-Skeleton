package com.sobri.sys.boot;

import static spark.Spark.*;

import com.google.inject.Injector;
import com.sobri.app.controller.IndexController;

public class Router {
    private final Injector injector;

    public Router(Injector injector) {
        this.injector = injector;
    }

    public <T> T instance(Class<T> c) {
        return this.injector.getInstance(c);
    }

    public void register() {
        get("/", this.instance(IndexController.class)::Index);
    }
}