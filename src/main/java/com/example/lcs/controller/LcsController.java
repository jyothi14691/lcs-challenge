package com.example.lcs.controller;

import com.example.lcs.model.SubstringRequest;
import com.example.lcs.model.SubstringResponse;
import com.example.lcs.service.LcsService;
import com.example.lcs.validator.InputValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/lcs")
public class LcsController {

    private static final Logger logger = LoggerFactory.getLogger(LcsController.class);
    LcsService lcsService;

    @Autowired
    InputValidator inputValidator;

    @Autowired
    public LcsController(LcsService lcsService) {
        this.lcsService = lcsService;
    }


    @PostMapping
    ResponseEntity<SubstringResponse> findLcs(@RequestBody SubstringRequest setOfStrings){
        List<String> subStringResponse = null;
        SubstringResponse response = new SubstringResponse();

        String validateResponse = inputValidator.validate(setOfStrings);
        if(null != validateResponse){
            return new ResponseEntity(validateResponse, HttpStatus.BAD_REQUEST);
        }
        else{
            subStringResponse = lcsService.findLcs(setOfStrings.getSetOfStrings());
            response.setLcs(subStringResponse);
        }
        return new ResponseEntity<SubstringResponse>(response, HttpStatus.OK);
    }



}
