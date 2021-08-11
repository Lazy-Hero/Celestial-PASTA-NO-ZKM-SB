/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.Z;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.W.K;
import net.minecraft.Z.c;
import net.o;

public class a {
    private final /* synthetic */ List<net.minecraft.ae.a<?>> b;
    private final /* synthetic */ K c;
    private final /* synthetic */ List<o<?>> a;

    public a a(o<?> ... arro) {
        a a10;
        block2: {
            o<?>[] arro2 = arro;
            int n2 = arro2.length;
            String string = net.minecraft.Z.c.c();
            for (int i2 = 0; i2 < n2; ++i2) {
                o<?> o2 = arro2[i2];
                a10 = this;
                if (string != null) {
                    a10.a.add(o2);
                    if (string != null) continue;
                }
                break block2;
            }
            a10 = this;
        }
        return a10;
    }

    public c a() {
        net.minecraft.ae.a[] arra = new net.minecraft.ae.a[this.b.size()];
        arra = this.b.toArray(arra);
        String string = net.minecraft.Z.c.c();
        int n2 = this.a.size();
        if (string != null) {
            if (n2 == 0) {
                return new c(this.c, arra);
            }
            n2 = this.a.size();
        }
        o[] arro = new o[n2];
        arro = this.a.toArray(arro);
        return (c)cq.a(cq.cK, this.c, arra, arro);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public a(K k2) {
        this.b = Lists.newArrayList();
        this.a = Lists.newArrayList();
        this.c = k2;
    }

    public a a(net.minecraft.ae.a<?> ... arra) {
        a a10;
        block2: {
            net.minecraft.ae.a<?>[] arra2 = arra;
            int n2 = arra2.length;
            String string = net.minecraft.Z.c.c();
            for (int i2 = 0; i2 < n2; ++i2) {
                net.minecraft.ae.a<?> a11 = arra2[i2];
                a10 = this;
                if (string != null) {
                    a10.b.add(a11);
                    if (string != null) continue;
                }
                break block2;
            }
            a10 = this;
        }
        return a10;
    }
}

