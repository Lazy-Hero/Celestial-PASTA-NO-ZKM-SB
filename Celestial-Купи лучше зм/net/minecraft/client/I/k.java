/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.I;

import java.io.IOException;
import net.minecraft.B.A;
import net.minecraft.B.D;
import net.minecraft.ah.z;
import net.minecraft.client.I.g;
import net.minecraft.client.I.v;
import net.minecraft.client.b.s;
import net.minecraft.client.b.t;
import net.minecraft.client.h.a;
import net.minecraft.client.h.e;
import net.minecraft.i.h;
import net.minecraft.k.n;

public class k
extends g
implements a {
    private /* synthetic */ boolean ac;
    private final /* synthetic */ e ab;
    private static final /* synthetic */ net.minecraft.ar.v ad;
    private /* synthetic */ t aa;

    @Override
    protected void b(int n2, int n3) {
        this.v.b(net.minecraft.client.D.h.a("container.crafting", new Object[0]), 28.0f, 6.0f, 0x404040);
        this.v.b(net.minecraft.client.D.h.a("container.inventory", new Object[0]), 8.0f, this.F - 96 + 2, 0x404040);
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        block3: {
            k k2;
            block4: {
                block5: {
                    boolean bl2;
                    int[] arrn;
                    block2: {
                        arrn = net.minecraft.client.I.v.a();
                        bl2 = this.ab.a(n2, n3, n4);
                        if (arrn != null) break block2;
                        if (bl2) break block3;
                        k2 = this;
                        if (arrn != null) break block4;
                        bl2 = k2.ac;
                    }
                    if (!bl2) break block5;
                    k2 = this;
                    if (arrn != null) break block4;
                    if (k2.ab.d()) break block3;
                }
                k2 = this;
            }
            super.a(n2, n3, n4);
        }
    }

    public k(h h2, z z2) {
        this(h2, z2, net.minecraft.k.n.o);
    }

    @Override
    protected void a(float f10, int n2, int n3) {
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.m.aN().b(ad);
        int n4 = this.H;
        int n5 = (w - this.F) / 2;
        this.a(n4, n5, 0, 0, this.M, this.F);
    }

    @Override
    protected void a(s s2) throws IOException {
        block3: {
            block2: {
                int[] arrn = net.minecraft.client.I.v.a();
                if (arrn != null) break block2;
                if (s2.g != 10) break block3;
                this.ab.a(this.ac, ((A)this.X).l);
                this.ab.g();
                this.H = this.ab.a(this.ac, h, this.M);
            }
            this.aa.c(this.H + 5, w / 2 - 49);
        }
    }

    @Override
    public e d() {
        return this.ab;
    }

    static {
        ad = new net.minecraft.ar.v("textures/gui/container/crafting_table.png");
    }

    @Override
    public void r() {
        int[] arrn = net.minecraft.client.I.v.a();
        super.r();
        int[] arrn2 = arrn;
        int n2 = h;
        if (arrn2 == null) {
            n2 = n2 < 379 ? 1 : 0;
        }
        this.ac = n2;
        this.ab.a(h, w, this.m, this.ac, ((A)this.X).l);
        this.H = this.ab.a(this.ac, h, this.M);
        this.aa = new t(10, this.H + 5, w / 2 - 49, 20, 18, 0, 168, 19, ad);
        this.t.add(this.aa);
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    protected boolean a(int var1_1, int var2_2, int var3_3, int var4_4) {
        block6: {
            var5_5 = net.minecraft.client.I.v.a();
            v0 = var1_1;
            if (var5_5 != null) break block6;
            if (v0 < var3_3) ** GOTO lbl-1000
            v0 = var2_2;
            if (var5_5 != null) break block6;
            if (v0 < var4_4) ** GOTO lbl-1000
            v0 = var1_1;
            if (var5_5 == null) {
                if (v0 < var3_3 + this.M) {
                    v0 = var2_2;
                    if (var5_5 == null) {
                        ** if (v0 < var4_4 + this.F) goto lbl-1000
                    } else {
                        ** GOTO lbl16
                    }
                } else {
                    ** GOTO lbl15
                }
            }
            break block6;
lbl15:
            // 2 sources

            ** GOTO lbl-1000
lbl16:
            // 2 sources

            break block6;
lbl-1000:
            // 4 sources

            {
                v0 = 1;
                ** GOTO lbl20
            }
lbl-1000:
            // 1 sources

            {
                v0 = 0;
            }
        }
        var6_6 = v0;
        v1 = this.ab.a(var1_1, var2_2, this.H, this.B, this.M, this.F);
        if (var5_5 == null) {
            if (v1 == 0) return (boolean)0;
            v1 = var6_6;
        }
        if (var5_5 != null) return (boolean)v1;
        if (v1 == 0) return (boolean)0;
        return (boolean)1;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block5: {
            e e10;
            block2: {
                k k2;
                block4: {
                    block3: {
                        int[] arrn = net.minecraft.client.I.v.a();
                        this.n();
                        int[] arrn2 = arrn;
                        e10 = this.ab;
                        if (arrn2 != null) break block2;
                        if (!e10.d()) break block3;
                        k2 = this;
                        if (arrn2 != null) break block4;
                        if (!k2.ac) break block3;
                        this.a(f10, n2, n3);
                        this.ab.a(n2, n3, f10);
                        if (arrn2 == null) break block5;
                    }
                    this.ab.a(n2, n3, f10);
                    super.a(n2, n3, f10);
                    k2 = this;
                }
                e10 = k2.ab;
            }
            e10.a(this.H, this.B, true, f10);
        }
        this.c(n2, n3);
        this.ab.d(this.H, this.B, n2, n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean a(int n2, int n3, int n4, int n5, int n6, int n7) {
        boolean bl2;
        int[] arrn;
        block2: {
            block3: {
                arrn = net.minecraft.client.I.v.a();
                bl2 = this.ac;
                if (arrn != null) break block2;
                if (!bl2) break block3;
                bl2 = this.ab.d();
                if (arrn != null) break block2;
                if (bl2) return false;
            }
            bl2 = super.a(n2, n3, n4, n5, n6, n7);
        }
        if (arrn != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void c() {
        this.ab.h();
    }

    @Override
    public void h() {
        this.ab.a();
        super.h();
    }

    public k(h h2, z z2, n n2) {
        super(new A(h2, z2, n2));
        this.ab = new e();
    }

    @Override
    public void e() {
        super.e();
        this.ab.b();
    }

    @Override
    public void a(D d10, int n2, int n3, net.minecraft.B.h h2) {
        super.a(d10, n2, n3, h2);
        this.ab.a(d10);
    }

    @Override
    protected void a(char c10, int n2) throws IOException {
        block3: {
            k k2;
            block2: {
                int[] arrn = net.minecraft.client.I.v.a();
                k2 = this;
                if (arrn != null) break block2;
                if (k2.ab.a(c10, n2)) break block3;
                k2 = this;
            }
            super.a(c10, n2);
        }
    }
}

