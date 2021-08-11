/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package net.minecraft.l;

import com.google.common.collect.Maps;
import java.util.Map;
import net.minecraft.ar.a5;
import net.minecraft.i.j;
import net.minecraft.l.d;

public class g {
    protected final /* synthetic */ Map<d, a5> a;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int a(d d10) {
        a5 a52 = this.a.get(d10);
        int n2 = d.h();
        a5 a53 = a52;
        if (n2 == 0) {
            if (a53 == null) {
                return 0;
            }
            a53 = a52;
        }
        int n3 = a53.b();
        return n3;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public void b(j j2, d d10, int n2) {
        a5 a52 = this.a.get(d10);
        int n3 = d.e();
        a5 a53 = a52;
        if (n3 != 0) {
            if (a53 == null) {
                a52 = new a5();
                this.a.put(d10, a52);
            }
            a53 = a52;
        }
        a53.a(n2);
    }

    public void a(j j2, d d10, int n2) {
        this.b(j2, d10, this.a(d10) + n2);
    }

    public g() {
        this.a = Maps.newConcurrentMap();
    }
}

