/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  javax.annotation.Nullable
 */
package net.minecraft.client.a;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.client.a.I;
import net.minecraft.client.a.q;
import net.minecraft.client.j.c;
import net.minecraft.client.x.Y;
import net.minecraft.client.x.n;
import net.minecraft.client.x.x;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class E {
    private final /* synthetic */ Map<Integer, n> a;
    private final /* synthetic */ Map<k, q> b;
    private final /* synthetic */ Map<Integer, Y> d;
    private final /* synthetic */ x c;

    public void a(k k2, q q2) {
        this.b.put(k2, q2);
    }

    public x a() {
        return this.c;
    }

    public void a(k k2, int n2, n n3) {
        this.a.put(this.c(k2, n2), n3);
        this.d.put(this.c(k2, n2), this.c.a(n3));
    }

    public c a(k k2) {
        return this.b(k2, 0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected int b(d d10) {
        String string = I.j();
        d d11 = d10;
        if (string == null) {
            if (d11.E() > 0) {
                return 0;
            }
            d11 = d10;
        }
        int n2 = d11.d();
        return n2;
    }

    public Y a(d d10) {
        k k2 = d10.w();
        Y y2 = this.a(k2, this.b(d10));
        String string = I.j();
        Y y3 = y2;
        if (string == null) {
            q q2;
            if (y3 == null && (q2 = this.b.get(k2)) != null) {
                y2 = this.c.a(q2.a(d10));
            }
            y3 = y2;
        }
        if (string == null) {
            if (y3 == null) {
                y2 = this.c.c();
            }
            y3 = y2;
        }
        return y3;
    }

    @Nullable
    protected Y a(k k2, int n2) {
        return this.d.get(this.c(k2, n2));
    }

    public E(x x2) {
        this.a = Maps.newHashMap();
        this.d = Maps.newHashMap();
        this.b = Maps.newHashMap();
        this.c = x2;
    }

    public c b(k k2, int n2) {
        return this.a(new d(k2, 1, n2)).f();
    }

    private int c(k k2, int n2) {
        return k.a(k2) << 16 | n2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b() {
        this.d.clear();
        Iterator<Map.Entry<Integer, n>> iterator = this.a.entrySet().iterator();
        String string = I.j();
        while (iterator.hasNext()) {
            Map.Entry<Integer, n> entry = iterator.next();
            this.d.put(entry.getKey(), this.c.a(entry.getValue()));
            if (string == null) continue;
        }
    }
}

