package com.example.lcs.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class SubstringResponse implements Serializable {

    List<String> lcs;

    public List<String> getLcs() {
        return lcs;
    }

    public void setLcs(List<String> lcs) {
        this.lcs = lcs;
    }

    @Override
    public String toString() {
        return "SubstringResponse{" +
                "lcs=" + lcs +
                '}';
    }
}
