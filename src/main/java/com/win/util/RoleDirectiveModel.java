package com.win.util;

import freemarker.core.Environment;
import freemarker.template.*;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * freemarker指令指令
 * Created by pocan on 2017/6/11.
 */
@Service
public class RoleDirectiveModel implements TemplateDirectiveModel{
    public void execute(Environment env, Map map, TemplateModel[] models, TemplateDirectiveBody body) throws TemplateException, IOException {
        System.out.println("================");
        TemplateScalarModel user = (TemplateScalarModel)map.get("user");
        TemplateScalarModel role = (TemplateScalarModel)map.get("role");

        if("123456".equals(user.getAsString()) && "admin".equals(role.getAsString())) {
            models[0] = TemplateBooleanModel.TRUE;
        }

        List<String> otherRights = new ArrayList<String>();
        otherRights.add("add");
        otherRights.add("delete");
        otherRights.add("update");
        models[1]=new SimpleSequence(otherRights);

        body.render(env.getOut());

    }
}
