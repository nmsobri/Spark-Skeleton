package com.sobri.sys.boot;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.AbstractModule;

public class App {

    public void start() {
        Injector injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                super.configure();
                //Custom binding here
            }
        });

        new Router(injector).register();
    }
}