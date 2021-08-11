/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.B;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import net.minecraft.client.B.d;
import net.minecraft.client.B.e;
import net.minecraft.client.B.h;
import net.minecraft.client.B.l;
import net.minecraft.client.D.t;
import net.minecraft.client.D.x;
import net.minecraft.client.h.k;

public class m
implements x {
    public static final /* synthetic */ h<net.minecraft.w.d> b;
    private final /* synthetic */ Map<h<?>, e<?>> a;
    public static final /* synthetic */ h<k> c;

    static {
        b = new h();
        c = new h();
    }

    public m() {
        this.a = Maps.newHashMap();
    }

    public <T> void a(h<T> h2, e<T> e10) {
        this.a.put(h2, e10);
    }

    @Override
    public void b(t t2) {
        Iterator<e<?>> iterator = this.a.values().iterator();
        int n2 = d.b();
        while (iterator.hasNext()) {
            e<?> e10 = iterator.next();
            e10.a();
            if (n2 != 0) continue;
        }
    }

    public <T> l<T> a(h<T> h2) {
        return this.a.get(h2);
    }
}

