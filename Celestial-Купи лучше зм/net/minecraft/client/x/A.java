/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.x;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.x.R;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.p;

public class A {
    private final /* synthetic */ List<p> a;

    public R a() {
        Collections.sort(this.a);
        return new R(this.a);
    }

    public A a(Y y2, int n2) {
        this.a.add(new p(y2, n2));
        return this;
    }

    public Y b() {
        return this.a.get((int)0).b;
    }

    public A() {
        this.a = Lists.newArrayList();
    }
}

