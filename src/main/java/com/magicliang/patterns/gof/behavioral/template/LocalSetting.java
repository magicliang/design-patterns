package com.magicliang.patterns.gof.behavioral.template;

import java.util.HashMap;
import java.util.Map;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:43
 */
public class LocalSetting {

    private Map<String, String> cache = new HashMap<>();

    protected String lookupCache(String key) {
        return cache.get(key);
    }

    protected void putIntoCache(String key, String value) {
        cache.put(key, value);
    }
}
