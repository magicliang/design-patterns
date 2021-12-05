package com.magicliang.patterns.gof.behavioral.memento;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * project name: design-patterns
 * <p>
 * description: 管理员
 *
 * @author magicliang
 * <p>
 * date: 2019-09-30 19:19
 */
public class CareTaker {

    /**
     * 备忘存储 map
     */
    private Map<Originator, List<Memento<String>>> map = Maps.newHashMap();

    /**
     * 保存状态。
     * CareTaker 可以在这个方法里实现额外的操作。
     *
     * @param originator 创始人
     */
    public void saveState(Originator originator) {
        Memento<String> memento = originator.saveToMemento();
        List<Memento<String>> mementos = map.computeIfAbsent(originator, k -> Lists.newArrayList());
        mementos.add(memento);
    }

    /**
     * 恢复状态
     * CareTaker 可以在这个方法里实现额外的操作。
     *
     * @param originator 创始人
     */
    public void restoreState(Originator originator) {
        List<Memento<String>> mementos = map.get(originator);

        if (null == mementos) {
            mementos = Lists.newArrayList();
            map.put(originator, mementos);
            return;
        }

        if (mementos.size() == 0) {
            return;
        }

        Memento<String> memento = mementos.remove(0);
        originator.restoreFromMemento(memento);
    }

}
