package org.amuji.web;

import org.amuji.repo.RedisRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Roy Yang
 * 8/3/2015
 */
@RestController
@RequestMapping("employees")
public class PersonController {

    @Autowired
    private RedisRepo repo;

    @RequestMapping(value = "{signum}", method = RequestMethod.GET)
    public Map<String, String> getEmp(@PathVariable String signum) {
        return repo.get(signum);
    }

    @RequestMapping(value = "auto_create", method = RequestMethod.POST)
    public Map<String, String> newEmp() {
        Map<String, String> data = new HashMap<>();
        data.put("eid", "EJLOPRW");
        data.put("name", "Roy Yang R");
        data.put("email", "ej@eric.com");
        data.put("manager", "Jason");
        data.put("dept", "EGX/PQ/PD");
        data.put("birth", "01/01/1970");
        repo.create("ejloprw", data);
        return data;
    }

}
