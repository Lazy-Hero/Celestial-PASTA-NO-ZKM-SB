/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  javax.annotation.Nullable
 */
package net.minecraft.client.h;

import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.az.r;
import net.minecraft.client.Q;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.p;
import net.minecraft.client.a.v;
import net.minecraft.client.b.L;
import net.minecraft.client.b.q;
import net.minecraft.client.h.g;
import net.minecraft.client.h.k;
import net.minecraft.w.d;

public class j {
    private final /* synthetic */ List<g> b;
    private /* synthetic */ net.minecraft.az.k a;
    private /* synthetic */ float c;

    public void a(r r2, int n2, int n3) {
        this.b.add(new g(this, r2, n2, n3));
    }

    public void a(net.minecraft.az.k k2) {
        this.a = k2;
    }

    public void a(Q q2, int n2, int n3, boolean bl2, float f10) {
        block8: {
            int n4;
            String[] arrstring = k.d();
            int n5 = L.q();
            if (arrstring != null) {
                if (n5 == 0) {
                    this.c += f10;
                }
                a0.b();
                v.y();
                n5 = n4 = 0;
            }
            while (n4 < this.b.size()) {
                int n6;
                int n7;
                g g10;
                block11: {
                    int n8;
                    block9: {
                        block10: {
                            g10 = this.b.get(n4);
                            n7 = g10.b() + n2;
                            n6 = g10.a() + n3;
                            if (arrstring == null) break block8;
                            n8 = n4;
                            if (arrstring == null) break block9;
                            if (n8 != 0) break block10;
                            n8 = bl2 ? 1 : 0;
                            if (arrstring == null) break block9;
                            if (n8 == 0) break block10;
                            q.a(n7 - 4, n6 - 4, n7 + 20, n6 + 20, 0x30FF0000);
                            if (arrstring != null) break block11;
                        }
                        n8 = n7;
                    }
                    q.a(n8, n6, n7 + 16, n6 + 16, 0x30FF0000);
                }
                v.y();
                d d10 = g10.c();
                p p2 = q2.Y();
                p2.a(q2.s, d10, n7, n6);
                v.o(516);
                q.a(n7, n6, n7 + 16, n6 + 16, 0x30FFFFFF);
                v.o(515);
                if (arrstring != null) {
                    if (n4 == 0) {
                        p2.a(q2.a6, d10, n7, n6);
                    }
                    v.j();
                    ++n4;
                }
                if (arrstring != null) continue;
            }
            a0.a();
        }
    }

    public void b() {
        this.a = null;
        this.b.clear();
        this.c = 0.0f;
    }

    static float a(j j2) {
        return j2.c;
    }

    @Nullable
    public net.minecraft.az.k c() {
        return this.a;
    }

    public g a(int n2) {
        return this.b.get(n2);
    }

    public int a() {
        return this.b.size();
    }

    public j() {
        this.b = Lists.newArrayList();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

