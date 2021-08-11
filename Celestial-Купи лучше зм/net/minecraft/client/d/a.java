/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.d;

import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.d.f;

public class a {
    private /* synthetic */ net.minecraft.ae.a<?> a;
    private final /* synthetic */ List<net.minecraft.ae.a<?>> b;
    private /* synthetic */ String c;

    public f a() {
        return new f(this.a, this.c, this.b, null);
    }

    public a a(String string) {
        this.c = string;
        return this;
    }

    public a() {
        this.b = Lists.newArrayList();
    }

    public a a(net.minecraft.ae.a<?> ... arra) {
        Collections.addAll(this.b, arra);
        return this;
    }

    public a a(net.minecraft.ae.a<?> a10) {
        this.a = a10;
        return this;
    }
}

