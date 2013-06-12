package org.demo.actions;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import javax.inject.Inject;

@Results({
        @Result(name = Action.SUCCESS, location = "${redirectName}", type = "redirectAction")
})
public class Index extends ActionSupport {

    @Inject
    private MyService myService;

    private String redirectName;

    public String execute() {
        redirectName = myService.doLogic();
        return SUCCESS;
    }

    public String getRedirectName() {
        return redirectName;
    }

}
