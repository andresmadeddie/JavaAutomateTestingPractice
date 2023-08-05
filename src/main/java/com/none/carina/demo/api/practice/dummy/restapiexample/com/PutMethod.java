package com.none.carina.demo.api.practice.dummy.restapiexample.com;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.annotation.SuccessfulHttpStatus;
import com.zebrunner.carina.api.http.HttpMethodType;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import com.zebrunner.carina.utils.config.Configuration;

@Endpoint(url = "${base_url}/update/23", methodType = HttpMethodType.PUT)
@RequestTemplatePath(path = "api/practice/put/rq.json")
@ResponseTemplatePath(path ="api/practice/put/rs.json")
@SuccessfulHttpStatus(status = HttpResponseStatusType.OK_200)
public class PutMethod extends AbstractApiMethodV2 {

    public PutMethod() {
        replaceUrlPlaceholder("base_url", Configuration.getRequired("api_url"));
    }
}