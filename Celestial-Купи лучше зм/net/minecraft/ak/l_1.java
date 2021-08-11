/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ak;

import net.minecraft.T.ae;
import net.minecraft.U.B;
import net.minecraft.U.C;
import net.minecraft.U.O;
import net.minecraft.U.x;
import net.minecraft.ak.h;
import net.minecraft.ar.a3;
import net.minecraft.w.H;
import net.minecraft.w.d;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class l<T extends ae>
extends h {
    private /* synthetic */ int i;
    private /* synthetic */ boolean k;
    private /* synthetic */ int h;
    private /* synthetic */ boolean f;
    private final /* synthetic */ T g;
    private final /* synthetic */ float d;
    private /* synthetic */ int c;
    private /* synthetic */ int j;
    private final /* synthetic */ double e;

    @Override
    public void g() {
        super.g();
        ((O)this.g).a(false);
        this.j = 0;
        this.h = -1;
        ((B)this.g).aJ();
    }

    public void b(int n2) {
        this.c = n2;
    }

    @Override
    public void a() {
        super.a();
        ((O)this.g).a(true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean e() {
        boolean bl2;
        String string;
        block2: {
            block3: {
                string = net.minecraft.ak.h.h();
                bl2 = this.c();
                if (string != null) break block2;
                if (bl2) break block3;
                bl2 = ((C)this.g).l().o();
                if (string != null) break block2;
                if (bl2) return false;
            }
            bl2 = this.a();
        }
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected boolean a() {
        String string = net.minecraft.ak.h.h();
        d d10 = ((B)this.g).av();
        if (string == null) {
            if (d10.G()) return false;
            d10 = ((B)this.g).av();
        }
        if (d10.w() != net.minecraft.u.h.i) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean c() {
        String string = net.minecraft.ak.h.h();
        l l2 = this;
        if (string == null) {
            if (((C)l2.g).J() == null) return false;
            l2 = this;
        }
        boolean bl2 = l2.a();
        if (string != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public void b() {
        block29: {
            l l2;
            block53: {
                int n2;
                block52: {
                    String string;
                    block45: {
                        block46: {
                            block51: {
                                block50: {
                                    int n3;
                                    B b10;
                                    block49: {
                                        int n4;
                                        block47: {
                                            int n5;
                                            block48: {
                                                block44: {
                                                    l l3;
                                                    block39: {
                                                        block40: {
                                                            block43: {
                                                                double d10;
                                                                block41: {
                                                                    double d11;
                                                                    double d12;
                                                                    block42: {
                                                                        int n6;
                                                                        int n7;
                                                                        block35: {
                                                                            block36: {
                                                                                block38: {
                                                                                    l l4;
                                                                                    double d13;
                                                                                    block37: {
                                                                                        block34: {
                                                                                            block32: {
                                                                                                double d14;
                                                                                                block33: {
                                                                                                    double d15;
                                                                                                    block31: {
                                                                                                        block30: {
                                                                                                            b10 = ((C)this.g).J();
                                                                                                            string = net.minecraft.ak.h.h();
                                                                                                            if (b10 == null) break block29;
                                                                                                            d12 = ((x)this.g).a(b10.a, b10.m().b, b10.ax);
                                                                                                            n5 = ((C)this.g).v().a(b10);
                                                                                                            int n8 = this.j;
                                                                                                            if (string == null) {
                                                                                                                n8 = n8 > 0 ? 1 : 0;
                                                                                                            }
                                                                                                            int n9 = n8;
                                                                                                            int n10 = n5;
                                                                                                            if (string == null) {
                                                                                                                if (n10 != n9) {
                                                                                                                    this.j = 0;
                                                                                                                }
                                                                                                                n10 = n5;
                                                                                                            }
                                                                                                            if (n10 == 0) break block30;
                                                                                                            ++this.j;
                                                                                                            if (string == null) break block31;
                                                                                                        }
                                                                                                        --this.j;
                                                                                                    }
                                                                                                    d14 = (d15 = d12 - (double)this.d) == 0.0 ? 0 : (d15 < 0.0 ? -1 : 1);
                                                                                                    if (string != null) break block32;
                                                                                                    if (d14 > 0) break block33;
                                                                                                    d14 = this.j;
                                                                                                    if (string != null) break block32;
                                                                                                    if (d14 < 20) break block33;
                                                                                                    ((C)this.g).l().f();
                                                                                                    ++this.i;
                                                                                                    if (string == null) break block34;
                                                                                                }
                                                                                                d14 = (double)((C)this.g).l().a(b10, this.e);
                                                                                            }
                                                                                            this.i = -1;
                                                                                        }
                                                                                        int n6 = this.i;
                                                                                        n6 = 20;
                                                                                        if (string != null) break block35;
                                                                                        if (n7 < n6) break block36;
                                                                                        double d13 = (double)((B)this.g).f().nextFloat() - 0.3;
                                                                                        d13 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                                                                                        if (string != null) break block37;
                                                                                        if (d13 < 0) {
                                                                                            boolean bl2 = this.f;
                                                                                            if (string == null) {
                                                                                                bl2 = !bl2;
                                                                                            }
                                                                                            this.f = bl2;
                                                                                        }
                                                                                        l4 = this;
                                                                                        if (string != null) break block38;
                                                                                        double d13 = (double)((B)l4.g).f().nextFloat() - 0.3;
                                                                                        d13 = d13 == 0.0 ? 0 : (d13 < 0.0 ? -1 : 1);
                                                                                    }
                                                                                    if (d13 < 0) {
                                                                                        boolean bl3 = this.k;
                                                                                        if (string == null) {
                                                                                            bl3 = !bl3;
                                                                                        }
                                                                                        this.k = bl3;
                                                                                    }
                                                                                    l4 = this;
                                                                                }
                                                                                l4.i = 0;
                                                                            }
                                                                            l3 = this;
                                                                            if (string != null) break block39;
                                                                            int n6 = l3.i;
                                                                            n6 = -1;
                                                                        }
                                                                        if (n7 <= n6) break block40;
                                                                        double d10 = d12 - (double)(this.d * 0.75f);
                                                                        d10 = d10 == 0.0 ? 0 : (d10 > 0.0 ? 1 : -1);
                                                                        if (string != null) break block41;
                                                                        if (d10 <= 0) break block42;
                                                                        this.k = false;
                                                                        if (string == null) break block43;
                                                                    }
                                                                    d10 = (d11 = d12 - (double)(this.d * 0.25f)) == 0.0 ? 0 : (d11 < 0.0 ? -1 : 1);
                                                                }
                                                                if (d10 < 0) {
                                                                    this.k = true;
                                                                }
                                                            }
                                                            ((C)this.g).w().a(this.k ? -0.5f : 0.5f, this.f ? 0.5f : -0.5f);
                                                            ((C)this.g).a((x)b10, 30.0f, 30.0f);
                                                            if (string == null) break block44;
                                                        }
                                                        l3 = this;
                                                    }
                                                    ((C)l3.g).I().a(b10, 30.0f, 30.0f);
                                                }
                                                n2 = ((B)this.g).aq();
                                                if (string != null) break block45;
                                                if (n2 == 0) break block46;
                                                n4 = n5;
                                                if (string != null) break block47;
                                                if (n4 != 0) break block48;
                                                n4 = this.j;
                                                if (string != null) break block47;
                                                if (n4 >= -60) break block48;
                                                ((B)this.g).aJ();
                                                if (string == null) break block29;
                                            }
                                            n4 = n5;
                                        }
                                        if (string != null) break block49;
                                        if (n4 == 0) break block29;
                                        n4 = n3 = ((B)this.g).v();
                                    }
                                    if (string != null) break block50;
                                    if (n3 < 20) break block51;
                                    ((B)this.g).aJ();
                                    ((O)this.g).a(b10, H.a(n3));
                                }
                                this.h = this.c;
                            }
                            if (string == null) break block29;
                        }
                        n2 = this.h = this.h - 1;
                    }
                    if (string != null) break block52;
                    if (n2 > 0) break block29;
                    l2 = this;
                    if (string != null) break block53;
                    n2 = l2.j;
                }
                if (n2 < -60) break block29;
                l2 = this;
            }
            ((B)l2.g).a(a3.MAIN_HAND);
        }
    }

    public l(T t2, double d10, int n2, float f10) {
        this.h = -1;
        this.i = -1;
        this.g = t2;
        this.e = d10;
        this.c = n2;
        this.d = f10 * f10;
        this.a(3);
    }
}

