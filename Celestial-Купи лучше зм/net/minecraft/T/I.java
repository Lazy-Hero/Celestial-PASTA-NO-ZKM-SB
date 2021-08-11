/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.T;

import net.minecraft.T.S;
import net.minecraft.T.a0;
import net.minecraft.T.a_;
import net.minecraft.U.B;
import net.minecraft.U.M;
import net.minecraft.U.x;
import net.minecraft.ah.e;
import net.minecraft.ak.h;
import net.minecraft.ar.G;

class I
extends h {
    private final /* synthetic */ a0 d;
    private final /* synthetic */ boolean c;
    private /* synthetic */ int e;

    @Override
    public void b() {
        block10: {
            I i2;
            block14: {
                block13: {
                    int n2;
                    int[] arrn;
                    B b10;
                    block11: {
                        block12: {
                            block8: {
                                block9: {
                                    b10 = this.d.J();
                                    int[] arrn2 = S.f();
                                    this.d.l().f();
                                    this.d.I().a(b10, 90.0f, 90.0f);
                                    arrn = arrn2;
                                    n2 = this.d.c((x)b10);
                                    if (arrn == null) break block8;
                                    if (n2 != 0) break block9;
                                    this.d.d((B)null);
                                    if (arrn != null) break block10;
                                }
                                n2 = ++this.e;
                            }
                            if (arrn == null) break block11;
                            if (n2 != 0) break block12;
                            a0.a(this.d, this.d.J().W());
                            this.d.aG.a((x)this.d, (byte)21);
                            if (arrn != null) break block13;
                        }
                        i2 = this;
                        if (arrn == null) break block14;
                        n2 = i2.e;
                    }
                    if (n2 >= this.d.a()) {
                        float f10 = 1.0f;
                        I i3 = this;
                        if (arrn != null) {
                            if (i3.d.aG.g() == net.minecraft.ah.e.HARD) {
                                f10 += 2.0f;
                            }
                            i3 = this;
                        }
                        boolean bl2 = i3.c;
                        if (arrn != null) {
                            if (bl2) {
                                f10 += 2.0f;
                            }
                            b10.a(G.a((x)this.d, (x)this.d), f10);
                            bl2 = b10.a(G.a(this.d), (float)this.d.a(M.g).d());
                        }
                        this.d.d((B)null);
                    }
                }
                i2 = this;
            }
            super.b();
        }
    }

    @Override
    public void a() {
        this.e = -10;
        this.d.l().f();
        this.d.I().a(this.d.J(), 90.0f, 90.0f);
        this.d.aA = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        B b10 = this.d.J();
        int[] arrn = S.f();
        B b11 = b10;
        if (arrn != null) {
            if (b11 == null) return false;
            b11 = b10;
        }
        boolean bl2 = b11.aL();
        if (arrn == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void g() {
        a0.a(this.d, 0);
        this.d.d((B)null);
        this.d.cB.c();
    }

    public I(a0 a02) {
        this.d = a02;
        this.c = a02 instanceof a_;
        this.a(3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        int[] arrn = S.f();
        int n2 = super.e();
        if (arrn != null) {
            if (n2 == 0) return 0 != 0;
            n2 = this.c;
        }
        if (arrn == null) return n2 != 0;
        if (n2 != 0) return 1 != 0;
        double d10 = this.d.s(this.d.J()) - 9.0;
        n2 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
        if (arrn == null) return n2 != 0;
        if (n2 <= 0) return 0 != 0;
        return 1 != 0;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

