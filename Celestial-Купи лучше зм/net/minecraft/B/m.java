/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.B;

import java.util.Iterator;
import net.minecraft.B.W;
import net.minecraft.B.a;
import net.minecraft.B.n;
import net.minecraft.ar.a2;
import net.minecraft.at.g;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.client.B.d;
import net.minecraft.i.j;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class m
implements a {
    private final /* synthetic */ int a;
    private final /* synthetic */ n c;
    private final /* synthetic */ a2<net.minecraft.w.d> b;
    private final /* synthetic */ int d;

    @Override
    public void c(j j2) {
    }

    @Override
    public boolean b(int n2, net.minecraft.w.d d10) {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public net.minecraft.w.d b(int n2, int n3) {
        net.minecraft.w.d d10;
        block5: {
            int n4;
            block7: {
                int n5;
                block6: {
                    block4: {
                        n5 = n.b();
                        n4 = n2;
                        if (n5 == 0) break block4;
                        if (n4 < 0) break block5;
                        n4 = n2;
                    }
                    if (n5 == 0) break block6;
                    if (n4 >= this.d) break block5;
                    n4 = n3;
                }
                if (n5 == 0) break block7;
                if (n4 < 0) break block5;
                n4 = n3;
            }
            if (n4 <= this.a) {
                d10 = this.a(n2 + n3 * this.d);
                return d10;
            }
        }
        d10 = net.minecraft.w.d.m;
        return d10;
    }

    @Override
    public net.minecraft.w.d b(int n2) {
        return W.a(this.b, n2);
    }

    @Override
    public int c() {
        return 64;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public boolean f() {
        boolean bl2;
        block3: {
            Iterator iterator = this.b.iterator();
            int n2 = n.c();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl3;
                    block4: {
                        net.minecraft.w.d d10 = (net.minecraft.w.d)iterator.next();
                        bl2 = d10.G();
                        if (n2 != 0) break block3;
                        if (n2 != 0) break block4;
                        if (bl2) break block5;
                        bl3 = false;
                    }
                    return bl3;
                }
                if (n2 == 0) continue;
            }
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public void b() {
    }

    @Override
    public void d() {
        this.b.clear();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int b() {
        return this.a;
    }

    @Override
    public String g() {
        return "container.crafting";
    }

    @Override
    public k d() {
        return this.g() ? new g(this.g()) : new h(this.g(), new Object[0]);
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void d(j j2) {
    }

    @Override
    public net.minecraft.w.d a(int n2) {
        return n2 >= this.e() ? net.minecraft.w.d.m : this.b.get(n2);
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public void a(int n2, net.minecraft.w.d d10) {
        this.b.set(n2, d10);
        this.c.a(this);
    }

    public void a(d d10) {
        Iterator iterator = this.b.iterator();
        int n2 = n.b();
        while (iterator.hasNext()) {
            net.minecraft.w.d d11 = (net.minecraft.w.d)iterator.next();
            d10.b(d11);
            if (n2 != 0) continue;
        }
    }

    @Override
    public int e() {
        return this.b.size();
    }

    @Override
    public int a() {
        return 0;
    }

    public int d() {
        return this.d;
    }

    @Override
    public net.minecraft.w.d a(int n2, int n3) {
        net.minecraft.w.d d10 = W.a(this.b, n2, n3);
        int n4 = n.b();
        net.minecraft.w.d d11 = d10;
        if (n4 != 0) {
            if (!d11.G()) {
                this.c.a(this);
            }
            d11 = d10;
        }
        return d11;
    }

    @Override
    public boolean a(j j2) {
        return true;
    }

    public m(n n2, int n3, int n4) {
        this.b = a2.a(n3 * n4, net.minecraft.w.d.m);
        this.c = n2;
        this.d = n3;
        this.a = n4;
    }
}

