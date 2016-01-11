package org.amuji.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.AbstractMap.*;

/**
 * Roy Yang
 * 8/3/2015
 */
@RestController
@RequestMapping("meta")
public class AppMetaController {
    @Value("${app.name}")
    private String name;
    @Value("${app.version}")
    private String version;

    @RequestMapping(value = "name", method = RequestMethod.GET)
    public Map<String, Object> appName() {
        return Stream.of(new SimpleEntry<>("name", name))
                .collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue));
    }

    @RequestMapping(value = "version", method = RequestMethod.GET)
    public Map<String, Object> appVersion() {
        return Stream.of(new SimpleEntry<>("version", version))
                .collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue));
    }

}
