package com.example.lcs.model;

import java.io.Serializable;
import java.util.List;

public class SubstringRequest implements Serializable {

    List<SubString> setOfStrings;

    public List<SubString> getSetOfStrings() {
        return setOfStrings;
    }

    public void setSetOfStrings(List<SubString> setOfStrings) {
        this.setOfStrings = setOfStrings;
    }
}
