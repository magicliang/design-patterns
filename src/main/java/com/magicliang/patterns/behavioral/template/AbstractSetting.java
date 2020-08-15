package com.magicliang.patterns.behavioral.template;

/**
 * project name: design-patterns
 * <p>
 * description:
 *
 * @author magicliang
 * <p>
 * date: 2020-08-15 14:42
 */
public abstract class AbstractSetting {

    public final String getSetting(String key) {
        String value = lookupCache(key);
        if (value == null) {
            value = readFromDatabase(key);
            putIntoCache(key, value);
        }
        return value;
    }

    protected abstract String lookupCache(String key);

    protected abstract void putIntoCache(String key, String value);

    private String readFromDatabase(String key) {
        // TODO: 从数据库读取
        return "";
    }
}
