package com.chitturi.chala.aspectjgradle.moduleone;

import com.chitturi.chala.aspectjgradle.modulebase.BaseClass;

import java.util.UUID;

public class ModuleOneClass implements BaseClass {
    @Override
    public String gradelBaseMethod(String stringArgument) {
        return UUID.randomUUID().toString();
    }
}
