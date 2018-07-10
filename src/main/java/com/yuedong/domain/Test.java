package com.yuedong.domain;

public class Test {
    private Integer testid;

    private String testname;

    private String testpassword;

    public Integer getTestid() {
        return testid;
    }

    public void setTestid(Integer testid) {
        this.testid = testid;
    }

    public String getTestname() {
        return testname;
    }

    public void setTestname(String testname) {
        this.testname = testname == null ? null : testname.trim();
    }

    public String getTestpassword() {
        return testpassword;
    }

    public void setTestpassword(String testpassword) {
        this.testpassword = testpassword == null ? null : testpassword.trim();
    }
}