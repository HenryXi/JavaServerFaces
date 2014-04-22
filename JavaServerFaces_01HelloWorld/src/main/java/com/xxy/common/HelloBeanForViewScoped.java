package com.xxy.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean
@ViewScoped
public class HelloBeanForViewScoped implements Serializable {

    public int commitTimes =0;
    private String name;

    public String toAnotherView(){
        commitTimes++;
        return "welcomeForViewScoped";
    }

    public void stayInThisView(){
        commitTimes++;
    }

    public String toThisView(){
        commitTimes++;
        return "helloForViewScoped";
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