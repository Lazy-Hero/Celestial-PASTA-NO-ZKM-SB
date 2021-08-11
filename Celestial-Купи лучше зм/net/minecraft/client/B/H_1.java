/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.a.G;
import net.minecraft.client.a.o;
import net.minecraft.client.a.v;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.q;

public class H
extends q {
    private final /* synthetic */ int t;
    private final /* synthetic */ List<String> m;
    private /* synthetic */ boolean p;
    private final /* synthetic */ int g;
    public /* synthetic */ boolean n;
    private final /* synthetic */ a5 o;
    protected /* synthetic */ int i;
    public /* synthetic */ int k;
    private final /* synthetic */ int h;
    public /* synthetic */ int l;
    public /* synthetic */ int j;
    private final /* synthetic */ int r;
    protected /* synthetic */ int a;
    private final /* synthetic */ boolean q;
    private final /* synthetic */ int s;

    public H a() {
        this.p = true;
        return this;
    }

    public void a(String string) {
        this.m.add(net.minecraft.client.D.h.a(string, new Object[0]));
    }

    public void a(Q q2, int n2, int n3) {
        block7: {
            int n4;
            String[] arrstring;
            block6: {
                arrstring = net.minecraft.client.b.q.b();
                n4 = this.n;
                if (arrstring == null) break block6;
                if (n4 == 0) break block7;
                v.a();
                v.a(net.minecraft.client.a.o.SRC_ALPHA, G.ONE_MINUS_SRC_ALPHA, net.minecraft.client.a.o.ONE, G.ZERO);
                this.b(q2, n2, n3);
                n4 = this.l + this.i / 2 + this.s / 2;
            }
            int n5 = n4;
            int n6 = n5 - this.m.size() * 10 / 2;
            for (int i2 = 0; i2 < this.m.size(); ++i2) {
                H h2 = this;
                if (arrstring != null) {
                    if (h2.p) {
                        this.b(this.o, this.m.get(i2), this.j + this.a / 2, n6 + i2 * 10, this.t);
                        if (arrstring != null) continue;
                    }
                    h2 = this;
                }
                h2.a(this.o, this.m.get(i2), this.j, n6 + i2 * 10, this.t);
                if (arrstring != null) continue;
            }
        }
    }

    public H(a5 a52, int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a = 200;
        this.i = 20;
        this.n = true;
        this.o = a52;
        this.k = n2;
        this.j = n3;
        this.l = n4;
        this.a = n5;
        this.i = n6;
        this.m = Lists.newArrayList();
        this.p = false;
        this.q = false;
        this.t = n7;
        this.g = -1;
        this.h = -1;
        this.r = -1;
        this.s = 0;
    }

    protected void b(Q q2, int n2, int n3) {
        block3: {
            int n4;
            block2: {
                String[] arrstring = net.minecraft.client.b.q.b();
                n4 = this.q;
                if (arrstring == null) break block2;
                if (n4 == 0) break block3;
                n4 = this.a + this.s * 2;
            }
            int n5 = n4;
            int n6 = this.i + this.s * 2;
            int n7 = this.j - this.s;
            int n8 = this.l - this.s;
            H.a(n7, n8, n7 + n5, n8 + n6, this.g);
            this.a(n7, n7 + n5, n8, this.h);
            this.a(n7, n7 + n5, n8 + n6, this.r);
            this.b(n7, n8, n8 + n6, this.h);
            this.b(n7 + n5, n8, n8 + n6, this.r);
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

