package com.chitturi.chala.aspectjgradle.moduletwo;

import com.chitturi.chala.aspectjgradle.modulebase.BaseClass;

import java.util.UUID;

public class ModuleTwoClass implements BaseClass {
    @Override
    public String gradelBaseMethod(String stringArgument) {
        return UUID.randomUUID().toString();
    }
}
