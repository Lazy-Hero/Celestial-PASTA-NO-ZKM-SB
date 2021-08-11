/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.U;

import javax.annotation.Nullable;
import net.minecraft.U.D;
import net.minecraft.U.M;
import net.minecraft.U.h;
import net.minecraft.U.x;
import net.minecraft.ah.z;
import net.minecraft.ar.a3;
import net.minecraft.ar.aH;
import net.minecraft.i.j;
import net.minecraft.q.m;
import net.minecraft.q.r;
import net.minecraft.w.aG;
import net.minecraft.w.d;

public abstract class E
extends D {
    private static /* synthetic */ boolean cx;
    private /* synthetic */ float cB;
    protected /* synthetic */ int cz;
    protected /* synthetic */ int cC;
    private /* synthetic */ float cy;
    private static final /* synthetic */ r<Boolean> cA;
    protected /* synthetic */ int cw;

    @Nullable
    public abstract E a(E var1);

    @Override
    public void a(r<?> r2) {
        int[] arrn = net.minecraft.U.M.b();
        if (arrn != null) {
            if (cA.equals(r2)) {
                this.p(this.Q());
            }
            super.a(r2);
        }
    }

    public void b(int n2, boolean n3) {
        block13: {
            E e10;
            block12: {
                int n4;
                block10: {
                    int[] arrn;
                    block11: {
                        int n5;
                        int n6;
                        block8: {
                            int n7;
                            block9: {
                                n7 = n6 = this.z();
                                arrn = net.minecraft.U.M.b();
                                n5 = n6 += n2 * 20;
                                if (arrn == null) break block8;
                                if (n5 <= 0) break block9;
                                n6 = 0;
                                n5 = n7;
                                if (arrn == null) break block8;
                                if (n5 < 0) {
                                    this.b();
                                }
                            }
                            n5 = n6 - n7;
                        }
                        int n8 = n5;
                        this.l(n6);
                        n4 = n3;
                        if (arrn == null) break block10;
                        if (n4 == 0) break block11;
                        this.cw += n8;
                        n4 = this.cC;
                        if (arrn == null) break block10;
                        if (n4 == 0) {
                            this.cC = 40;
                        }
                    }
                    e10 = this;
                    if (arrn == null) break block12;
                    n4 = e10.z();
                }
                if (n4 != 0) break block13;
                e10 = this;
            }
            e10.l(this.cw);
        }
    }

    @Override
    public void E() {
        block13: {
            int n2;
            int n3;
            block15: {
                block16: {
                    int[] arrn;
                    block17: {
                        int n4;
                        block10: {
                            block11: {
                                E e10;
                                block14: {
                                    int n5;
                                    block12: {
                                        int[] arrn2 = net.minecraft.U.M.b();
                                        super.E();
                                        arrn = arrn2;
                                        n4 = this.aG.C;
                                        if (arrn == null) break block10;
                                        if (n4 == 0) break block11;
                                        n5 = this.cC;
                                        if (arrn == null) break block12;
                                        if (n5 <= 0) break block13;
                                        e10 = this;
                                        if (arrn == null) break block14;
                                        n5 = e10.cC % 4;
                                    }
                                    if (n5 == 0) {
                                        this.aG.a(net.minecraft.ar.aH.VILLAGER_HAPPY, this.a + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, this.aF + 0.5 + (double)(this.g.nextFloat() * this.aD), this.ax + (double)(this.g.nextFloat() * this.ad * 2.0f) - (double)this.ad, 0.0, 0.0, 0.0, new int[0]);
                                    }
                                    e10 = this;
                                }
                                --e10.cC;
                                if (arrn != null) break block13;
                            }
                            n4 = this.z();
                        }
                        n3 = n4;
                        n2 = n3++;
                        if (arrn == null) break block15;
                        if (n2 >= 0) break block16;
                        this.l(n3);
                        if (arrn == null) break block17;
                        if (n3 != 0) break block13;
                        this.b();
                    }
                    if (arrn != null) break block13;
                }
                n2 = n3;
            }
            if (n2 > 0) {
                this.l(--n3);
            }
        }
    }

    public E(z z2) {
        super(z2);
        this.cB = -1.0f;
    }

    public void k(int n2) {
        this.b(n2, false);
    }

    @Override
    public boolean b(j j2, a3 a32) {
        block6: {
            boolean bl2;
            block7: {
                block8: {
                    E e10;
                    E e11;
                    int[] arrn;
                    d d10;
                    block11: {
                        E e12;
                        block10: {
                            Class<x> class_;
                            Class<? extends x> class_2;
                            block9: {
                                d10 = j2.c(a32);
                                arrn = net.minecraft.U.M.b();
                                if (d10.w() != net.minecraft.u.h.bn) break block6;
                                bl2 = this.aG.C;
                                if (arrn == null) break block7;
                                if (bl2) break block8;
                                class_ = class_2 = h.a.a(net.minecraft.w.aG.a(d10));
                                if (arrn == null) break block9;
                                if (class_ == null) break block8;
                                e12 = this;
                                if (arrn == null) break block10;
                                class_ = e12.getClass();
                            }
                            if (class_ != class_2) break block8;
                            e12 = this.a(this);
                        }
                        e10 = e11 = e12;
                        if (arrn == null) break block11;
                        if (e10 == null) break block8;
                        e11.l(-24000);
                        e11.c(this.a, this.aF, this.ax, 0.0f, 0.0f);
                        e10 = this;
                    }
                    e10.aG.f(e11);
                    bl2 = d10.c();
                    if (arrn != null) {
                        if (bl2) {
                            e11.a(d10.g());
                        }
                        bl2 = j2.cw.g;
                    }
                    if (arrn == null) break block7;
                    if (!bl2) {
                        d10.b(1);
                    }
                }
                bl2 = true;
            }
            return bl2;
        }
        return false;
    }

    protected final void m(float f10) {
        super.c(this.cB * f10, this.cy * f10);
    }

    @Override
    protected void ab() {
        super.ab();
        this.ap.c(cA, false);
    }

    static {
        cA = net.minecraft.q.m.a(E.class, net.minecraft.q.h.g);
        net.minecraft.U.E.q(true);
    }

    public static boolean y() {
        boolean bl2 = net.minecraft.U.E.f();
        return !bl2;
    }

    public static boolean f() {
        return cx;
    }

    @Override
    public boolean Q() {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = this.z();
        if (arrn != null) {
            bl2 = bl2 < false;
        }
        return bl2;
    }

    public static void q(boolean bl2) {
        cx = bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a(d d10, Class<? extends x> class_) {
        Class<? extends x> class_2;
        int[] arrn = net.minecraft.U.M.b();
        Object object = d10.w();
        if (arrn != null) {
            if (object != net.minecraft.u.h.bn) {
                return false;
            }
            object = h.a.a(net.minecraft.w.aG.a(d10));
        }
        Class<? extends x> class_3 = class_2 = (Class<? extends x>)object;
        if (arrn != null) {
            if (class_3 == null) return false;
            class_3 = class_;
        }
        if (class_3 != class_2) return false;
        return true;
    }

    public void p(boolean bl2) {
        this.m(bl2 ? 0.5f : 1.0f);
    }

    @Override
    public void f(net.minecraft.P.r r2) {
        super.f(r2);
        r2.b("Age", this.z());
        r2.b("ForcedAge", this.cw);
    }

    public void l(int n2) {
        int[] arrn = net.minecraft.U.M.b();
        boolean bl2 = n2;
        if (arrn != null) {
            bl2 = bl2 < false;
        }
        this.ap.b(cA, bl2);
        this.cz = n2;
        this.p(this.Q());
    }

    private static gP e(gP gP2) {
        return gP2;
    }

    protected void b() {
    }

    @Override
    protected final void c(float f10, float f11) {
        block5: {
            float f12;
            E e10;
            block4: {
                int[] arrn = net.minecraft.U.M.b();
                float f13 = this.cB - 0.0f;
                float f14 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                if (arrn != null) {
                    f14 = f14 > 0 ? 1.0f : 0.0f;
                }
                float f15 = f14;
                this.cB = f10;
                e10 = this;
                f12 = f11;
                if (arrn == null) break block4;
                e10.cy = f12;
                if (f15 != false) break block5;
                e10 = this;
                f12 = 1.0f;
            }
            e10.m(f12);
        }
    }

    public int z() {
        int[] arrn = net.minecraft.U.M.b();
        int n2 = this.aG.C;
        if (arrn != null) {
            if (n2 != 0) {
                int n3 = this.ap.b(cA).booleanValue();
                if (arrn != null) {
                    n3 = n3 != 0 ? -1 : 1;
                }
                return n3;
            }
            n2 = this.cz;
        }
        return n2;
    }

    @Override
    public void a(net.minecraft.P.r r2) {
        super.a(r2);
        this.l(r2.m("Age"));
        this.cw = r2.m("ForcedAge");
    }
}

