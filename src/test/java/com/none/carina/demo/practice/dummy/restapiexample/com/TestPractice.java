package com.none.carina.demo.practice.dummy.restapiexample.com;

import com.none.carina.demo.api.practice.dummy.restapiexample.com.DeleteMethod;
import com.none.carina.demo.api.practice.dummy.restapiexample.com.GetMethod;
import com.none.carina.demo.api.practice.dummy.restapiexample.com.PostMethod;
import com.none.carina.demo.api.practice.dummy.restapiexample.com.PutMethod;
import com.zebrunner.carina.api.apitools.validation.JsonCompareKeywords;
import com.zebrunner.carina.core.IAbstractTest;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.testng.annotations.Test;

public class TestPractice implements IAbstractTest {

    @Test
    public void postTest() {
        PostMethod api = new PostMethod();
        api.callAPIExpectSuccess();
        api.validateResponse(JSONCompareMode.STRICT_ORDER, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    public void getTest() {
        GetMethod api = new GetMethod();
        api.callAPIExpectSuccess();
        api.validateResponse(JSONCompareMode.STRICT_ORDER, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    public void putTest() {
        PutMethod api = new PutMethod();
        api.callAPIExpectSuccess();
        api.validateResponse(JSONCompareMode.STRICT_ORDER, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }

    @Test
    public void deleteTest() {
        DeleteMethod api = new DeleteMethod();
        api.callAPIExpectSuccess();
        api.validateResponse(JSONCompareMode.STRICT_ORDER, JsonCompareKeywords.ARRAY_CONTAINS.getKey());
    }
}
