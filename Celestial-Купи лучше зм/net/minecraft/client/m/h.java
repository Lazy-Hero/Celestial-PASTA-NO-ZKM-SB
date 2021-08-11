/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.m;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.U.q;
import net.minecraft.W.K;
import net.minecraft.client.Q;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.aL;
import net.minecraft.client.m.b;
import net.minecraft.k.m;

class h
extends aL {
    private final /* synthetic */ List<q> x;
    final /* synthetic */ b y;

    @Override
    protected int d() {
        return this.x.size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    public h(b b10, Q q2) {
        this.y = b10;
        super(q2, L.h, L.w, 32, L.w - 64, net.minecraft.client.m.b.n((b)b10).p * 4);
        String string = K.c();
        this.x = Lists.newArrayList();
        this.a(false);
        Iterator<q> iterator = net.minecraft.U.h.g.values().iterator();
        String string2 = string;
        while (iterator.hasNext()) {
            block3: {
                int n2;
                q q3;
                block4: {
                    q3 = iterator.next();
                    n2 = net.minecraft.client.m.b.p(b10).a(q3.c);
                    if (string2 == null) break block3;
                    if (n2 > 0) break block4;
                    n2 = net.minecraft.client.m.b.p(b10).a(q3.b);
                    if (string2 == null || n2 <= 0) break block3;
                }
                n2 = this.x.add(q3) ? 1 : 0;
            }
            if (string2 != null) continue;
        }
    }

    @Override
    protected int a() {
        return this.d() * net.minecraft.client.m.b.e((b)this.y).p * 4;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7, float f10) {
        q q2 = this.x.get(n2);
        String string = net.minecraft.client.D.h.a("entity." + net.minecraft.U.h.a(q2.e) + ".name", new Object[0]);
        String string2 = K.c();
        int n8 = net.minecraft.client.m.b.p(this.y).a(q2.c);
        int n9 = net.minecraft.client.m.b.p(this.y).a(q2.b);
        String string3 = net.minecraft.client.D.h.a("stat.entityKills", n8, string);
        String string4 = net.minecraft.client.D.h.a("stat.entityKilledBy", string, n9);
        int n10 = n8;
        if (string2 != null) {
            if (n10 == 0) {
                string3 = net.minecraft.client.D.h.a("stat.entityKills.none", string);
            }
            n10 = n9;
        }
        if (n10 == 0) {
            string4 = net.minecraft.client.D.h.a("stat.entityKilledBy.none", string);
        }
        this.y.a(net.minecraft.client.m.b.m(this.y), string, n3 + 2 - 10, n4 + 1, 0xFFFFFF);
        a5 a52 = net.minecraft.client.m.b.r(this.y);
        int n11 = n8;
        if (string2 != null) {
            n11 = n11 == 0 ? 0x606060 : 0x909090;
        }
        this.y.a(a52, string3, n3 + 2, n4 + 1 + net.minecraft.client.m.b.o((b)this.y).p, n11);
        a5 a53 = net.minecraft.client.m.b.j(this.y);
        int n12 = n9;
        if (string2 != null) {
            n12 = n12 == 0 ? 0x606060 : 0x909090;
        }
        this.y.a(a53, string4, n3 + 2, n4 + 1 + net.minecraft.client.m.b.a((b)this.y).p * 2, n12);
        if (string2 == null) {
            net.minecraft.k.m.b(!net.minecraft.k.m.c());
        }
    }

    @Override
    protected void c() {
        this.y.n();
    }
}

