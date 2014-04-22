package com.xxy.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped
public class HelloBeanForSessionScoped implements Serializable {

    public int commitTimes =0;
    private String name;

    public String doSomething(){
        commitTimes++;
        return "welcomeForSessionScoped";
    }

    public int getCommitTimes() {
        return commitTimes;
    }

    public void setCommitTimes(int commitTimes) {
        this.commitTimes = commitTimes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}