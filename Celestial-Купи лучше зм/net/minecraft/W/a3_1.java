/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
package net.minecraft.w;

import com.google.common.collect.Multimap;
import java.util.Set;
import net.minecraft.B.X;
import net.minecraft.U.B;
import net.minecraft.U.M;
import net.minecraft.W.K;
import net.minecraft.Z.i;
import net.minecraft.ad.a;
import net.minecraft.ah.z;
import net.minecraft.j.f;
import net.minecraft.k.n;
import net.minecraft.w.a8;
import net.minecraft.w.bl;
import net.minecraft.w.d;
import net.minecraft.w.k;

public class a3
extends k {
    private final /* synthetic */ Set<K> s;
    protected /* synthetic */ float v;
    protected /* synthetic */ float w;
    protected /* synthetic */ float u;
    protected /* synthetic */ a8 t;

    @Override
    public boolean a(d d10, B b10, B b11) {
        d10.a(2, b11);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public float a(d d10, i i2) {
        int n2 = bl.g();
        a3 a32 = this;
        if (n2 != 0) {
            if (!a32.s.contains(i2.b())) return 1.0f;
            a32 = this;
        }
        float f10 = a32.v;
        return f10;
    }

    @Override
    public int o() {
        return this.t.e();
    }

    public String b() {
        return this.t.toString();
    }

    protected a3(a8 a82, Set<K> set) {
        this(0.0f, 0.0f, a82, set);
    }

    protected a3(float f10, float f11, a8 a82, Set<K> set) {
        this.v = 4.0f;
        this.t = a82;
        this.s = set;
        this.f = 1;
        this.d(a82.c());
        this.v = a82.f();
        this.u = f10 + a82.a();
        this.w = f11;
        this.a(net.minecraft.ad.a.d);
    }

    public float a() {
        return this.u;
    }

    @Override
    public boolean a(d d10, z z2, i i2, n n2, B b10) {
        boolean bl2;
        block4: {
            block5: {
                int n3 = bl.g();
                bl2 = z2.C;
                if (n3 == 0) break block4;
                if (bl2) break block5;
                double d11 = (double)i2.b(z2, n2) - 0.0;
                bl2 = d11 == 0.0 ? 0 : (d11 > 0.0 ? 1 : -1);
                if (n3 == 0) break block4;
                if (bl2) {
                    d10.a(1, b10);
                }
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public boolean d() {
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(d d10, d d11) {
        int n2 = bl.c();
        a3 a32 = this;
        if (n2 == 0) {
            if (a32.t.d() == d11.w()) return true;
            a32 = this;
        }
        boolean bl2 = super.a(d10, d11);
        if (n2 != 0) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public Multimap<String, f> a(X x2) {
        Multimap<String, f> multimap;
        block3: {
            block2: {
                multimap = super.a(x2);
                int n2 = bl.g();
                if (n2 == 0) break block2;
                if (x2 != X.MAINHAND) break block3;
                multimap.put((Object)M.g.c(), (Object)new f(h, "Tool modifier", this.u, 0));
            }
            multimap.put((Object)M.j.c(), (Object)new f(b, "Tool modifier", this.w, 0));
        }
        return multimap;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

