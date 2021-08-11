/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.a;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.ar.aC;
import net.minecraft.client.a.v;
import net.minecraft.client.k.s;
import net.minecraft.k.n;

public abstract class aK {
    protected /* synthetic */ boolean d;
    protected /* synthetic */ List<s> b;
    private /* synthetic */ double c;
    private /* synthetic */ double e;
    private /* synthetic */ double a;

    public abstract void a(aC var1);

    public void a(double d10, double d11, double d12) {
        this.d = true;
        this.b.clear();
        this.c = d10;
        this.e = d11;
        this.a = d12;
    }

    public void a(s s2) {
        n n2 = s2.g();
        v.b((float)((double)n2.e() - this.c), (float)((double)n2.b() - this.e), (float)((double)n2.a() - this.a));
    }

    public aK() {
        this.b = Lists.newArrayListWithCapacity((int)17424);
    }

    public void a(s s2, aC aC2) {
        this.b.add(s2);
    }
}

