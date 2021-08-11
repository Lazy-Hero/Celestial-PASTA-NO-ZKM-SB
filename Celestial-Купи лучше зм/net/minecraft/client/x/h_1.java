/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 */
package net.minecraft.client.x;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.minecraft.Z.i;
import net.minecraft.ar.aA;
import net.minecraft.client.j.c;
import net.minecraft.client.x.P;
import net.minecraft.client.x.Q;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.a;
import net.minecraft.client.x.a1;
import net.minecraft.client.x.v;
import net.minecraft.client.x.y;
import net.minecraft.k.n;

public class h {
    private final /* synthetic */ y a;
    private final /* synthetic */ boolean d;
    private /* synthetic */ c f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ a1 b;
    private final /* synthetic */ List<P> e;
    private final /* synthetic */ Map<aA, List<P>> c;

    public h a(P p2) {
        this.e.add(p2);
        return this;
    }

    public h a(aA aA2, P p2) {
        this.c.get(aA2).add(p2);
        return this;
    }

    public h a(c c10) {
        this.f = c10;
        return this;
    }

    public h(v v2, a1 a12) {
        this(v2.d(), v2.c(), v2.j(), a12);
    }

    private h(boolean bl2, boolean bl3, y y2, a1 a12) {
        block2: {
            String[] arrstring = P.o();
            String[] arrstring2 = arrstring;
            this.e = Lists.newArrayList();
            this.c = Maps.newEnumMap(aA.class);
            for (aA aA2 : aA.values()) {
                this.c.put(aA2, Lists.newArrayList());
                if (arrstring2 == null) {
                    if (arrstring2 == null) continue;
                }
                break block2;
            }
            this.b = a12;
            this.d = bl2;
            this.g = bl3;
            this.a = y2;
        }
    }

    private void a(i i2, Y y2, c c10, long l2) {
        Iterator<P> iterator = y2.a(i2, null, l2).iterator();
        String[] arrstring = P.o();
        while (iterator.hasNext()) {
            P p2 = iterator.next();
            this.a(new Q(p2, c10));
            if (arrstring == null) continue;
        }
    }

    public h(i i2, Y y2, c c10, n n2) {
        block2: {
            this(y2.b(), y2.d(), y2.c(), y2.e());
            this.f = y2.f();
            long l2 = net.minecraft.k.h.a(n2);
            aA[] arraA = aA.values();
            int n3 = arraA.length;
            String[] arrstring = P.o();
            for (int i3 = 0; i3 < n3; ++i3) {
                aA aA2 = arraA[i3];
                this.a(i2, y2, c10, aA2, l2);
                if (arrstring == null) {
                    if (arrstring == null) continue;
                }
                break block2;
            }
            this.a(i2, y2, c10, l2);
        }
    }

    public Y a() {
        if (this.f == null) {
            throw new RuntimeException("Missing particle!");
        }
        return new a(this.e, this.c, this.d, this.g, this.f, this.a, this.b);
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }

    private void a(i i2, Y y2, c c10, aA aA2, long l2) {
        Iterator<P> iterator = y2.a(i2, aA2, l2).iterator();
        String[] arrstring = P.o();
        while (iterator.hasNext()) {
            P p2 = iterator.next();
            this.a(aA2, new Q(p2, c10));
            if (arrstring == null) continue;
        }
    }
}

