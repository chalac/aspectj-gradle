package com.chitturi.chala.aspectjgradle.moduleexecute;

import com.chitturi.chala.aspectjgradle.modulebase.BaseClass;
import com.chitturi.chala.aspectjgradle.moduleone.ModuleOneClass;
import com.chitturi.chala.aspectjgradle.moduletwo.ModuleTwoClass;

public class Main {
    public static void main(String[] args) {
        BaseClass baseClass1 = new ModuleOneClass();
        System.out.println(baseClass1.gradelBaseMethod("From BaseClass One"));
        BaseClass baseClass2 = new ModuleTwoClass();
        System.out.println(baseClass2.gradelBaseMethod("From BaseClass Two"));
    }
}