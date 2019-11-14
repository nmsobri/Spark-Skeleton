package com.sobri.app.controller;

import com.google.inject.Inject;
import com.sobri.app.model.service.IndexService;
import spark.Route;
import spark.Request;
import spark.Response;
import com.sobri.sys.lib.AppController;

public class IndexController extends AppController {
    private IndexService indexService;

    @Inject
    public IndexController(IndexService indexService) {
        this.indexService = indexService;
    }

    public Object Index(Request req, Response res) throws Exception {
        return this.indexService.Index();
    }
}