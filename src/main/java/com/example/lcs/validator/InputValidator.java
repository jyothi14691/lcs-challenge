package com.example.lcs.validator;

import com.example.lcs.model.SubString;
import com.example.lcs.model.SubstringRequest;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class InputValidator {


    public String validate(SubstringRequest setOfStrings) {

        // Check the constraint for null or empty (1 and 2)
        if(CollectionUtils.isEmpty(setOfStrings.getSetOfStrings())){
            return "setOfStrings should not be empty";
        }

        Set<SubString> uniqueStrings = new HashSet<>(setOfStrings.getSetOfStrings());
        if(setOfStrings.getSetOfStrings().size() != uniqueStrings.size()){
            return "setOfString should not contain duplicate values";
        }

        return null;

    }
}
