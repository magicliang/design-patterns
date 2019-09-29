package com.magicliang.patterns.behavioral.mediator;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * project name: design-patterns
 * <p>
 * description: 具体协调者
 *
 * @author magicliang
 * <p>
 * date: 2019-09-29 14:56
 */
public class ConcreteMediator implements Mediator {

    /**
     * 成员列表
     * 因为有双向依赖的环状引用，所以 toString 会导致栈溢出，要有一层专门破环
     */
    private List<Member> members = Lists.newArrayList();

    /**
     * 像特定的成员发送消息
     *
     * @param id  成员 id
     * @param msg 消息
     */
    @Override
    public void operation(String id, String msg) {
        members.forEach((member) -> {
            if (StringUtils.equals(id, member.getId())) {
                member.receiveMsg(msg);
            }
        });
    }

    /**
     * 注册特定的成员
     *
     * @param member 成员
     */
    @Override
    public void register(Member member) {
        members.add(member);
        member.setMediator(this);
    }
}
