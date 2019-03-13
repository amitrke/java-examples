package com.subnext.java8;

import com.subnext.java8.Utils.PassingCode;
import com.subnext.java8.entity.Apple;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PassingCodeTest{

    private List<Apple> inventory;

    @Before
    public void setup(){
        this.inventory = new ArrayList<>();
        this.inventory.add(new Apple("Red", 100));
        this.inventory.add(new Apple("Green", 160));
        this.inventory.add(new Apple("Red", 160));
        this.inventory.add(new Apple("Green", 100));
        this.inventory.add(new Apple("Green", 160));
    }

    @Test
    public void testFilter(){
        List<Apple> greenApples = PassingCode.filterApples(this.inventory, PassingCode::isGreenApple);
        Assert.assertEquals(3, greenApples.size());
    }
}
