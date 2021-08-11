/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.k;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.N.y;
import net.minecraft.ar.aA;
import net.minecraft.ar.aC;
import net.minecraft.client.a.P;
import net.minecraft.client.k.d;
import net.minecraft.client.k.n;
import net.minecraft.client.k.s;

public class m {
    private final /* synthetic */ List<y> d;
    private /* synthetic */ d g;
    private /* synthetic */ P e;
    public static final /* synthetic */ m b;
    private final /* synthetic */ boolean[] c;
    private /* synthetic */ boolean f;
    private final /* synthetic */ boolean[] a;

    public boolean d(aC aC2) {
        int[] arrn = s.r();
        boolean bl2 = this.c[aC2.ordinal()];
        if (arrn != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    public void a(y y2) {
        this.d.add(y2);
    }

    public m() {
        this.c = new boolean[aC.values().length];
        this.a = new boolean[aC.values().length];
        this.f = true;
        this.d = Lists.newArrayList();
        this.g = new d();
    }

    static {
        b = new n();
    }

    public void b(aC aC2) {
        this.a[aC2.ordinal()] = true;
    }

    public List<y> b() {
        return this.d;
    }

    public boolean c(aC aC2) {
        return this.a[aC2.ordinal()];
    }

    public boolean a(aA aA2, aA aA3) {
        return this.g.a(aA2, aA3);
    }

    public P c() {
        return this.e;
    }

    public void a(d d10) {
        this.g = d10;
    }

    public void a(P p2) {
        this.e = p2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected void a(aC aC2) {
        this.f = false;
        this.c[aC2.ordinal()] = true;
    }

    public boolean a() {
        return this.f;
    }
}

