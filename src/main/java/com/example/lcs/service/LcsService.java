package com.example.lcs.service;

import com.example.lcs.model.SubString;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class LcsService {

    public List<String> findLcs(List<SubString> setOfStrings){
        int length = setOfStrings.size();
        List<String> resultList = new ArrayList<>();
        String res = "";
        String subStr = "";
        //SubString subString = setOfStrings.get(0);
        String referenceStr = setOfStrings.get(0).getValue();

        for (int i = 0; i < referenceStr.length(); i++) {
            for (int j = i + 1; j <= referenceStr.length(); j++) {

                String stem = referenceStr.substring(i, j);
                int k = 1;
                for (k = 1; k < length; k++)

                    if (!setOfStrings.get(k).getValue().contains(stem)) {
                        break;
                    }

                if (k == length && res.length() < stem.length()) {
                    res = stem;
                }
            }
        }

        resultList.add(res);
        Collections.sort(resultList);
        return resultList;
    }

}
