/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.x;

import net.C;
import net.g;
import net.minecraft.ar.aA;
import net.minecraft.client.Q;
import net.minecraft.client.j.c;
import net.minecraft.client.x.N;
import net.minecraft.client.y.b;
import net.minecraft.client.y.e;

public class P
implements C {
    protected /* synthetic */ e b;
    private static /* synthetic */ String[] d;
    protected /* synthetic */ boolean c;
    protected /* synthetic */ aA e;
    protected /* synthetic */ c i;
    private /* synthetic */ aL g;
    protected /* synthetic */ int[] a;
    private /* synthetic */ int[] f;
    protected final /* synthetic */ int h;

    public static void b(String[] arrstring) {
        d = arrstring;
    }

    static {
        if (P.o() != null) {
            P.b(new String[1]);
        }
    }

    @Override
    public void a(g g10) {
        cq.e(cq.ap, g10, this);
    }

    public boolean l() {
        return this.c;
    }

    protected void a() {
        block5: {
            block6: {
                P p2;
                int n2;
                block2: {
                    String[] arrstring;
                    block3: {
                        block4: {
                            arrstring = P.o();
                            n2 = fU.ag();
                            if (arrstring != null) break block2;
                            if (n2 == 0) break block3;
                            P p3 = this;
                            if (arrstring != null) break block4;
                            if (p3.a.length != 28) break block5;
                            p3 = this;
                        }
                        p3.a = P.a(this.a);
                        if (arrstring == null) break block5;
                    }
                    p2 = this;
                    if (arrstring != null) break block6;
                    n2 = p2.a.length;
                }
                if (n2 != 56) break block5;
                p2 = this;
            }
            p2.a = P.b(this.a);
        }
    }

    private static int[] a(int[] arrn, c c10) {
        int[] arrn2;
        block2: {
            int[] arrn3 = (int[])arrn.clone();
            int n2 = c10.s / c10.f();
            int n3 = c10.z / c10.b();
            int n4 = arrn3.length / 4;
            String[] arrstring = P.o();
            for (int i2 = 0; i2 < 4; ++i2) {
                int n5 = i2 * n4;
                float f10 = Float.intBitsToFloat(arrn3[n5 + 4]);
                float f11 = Float.intBitsToFloat(arrn3[n5 + 4 + 1]);
                float f12 = c10.e(f10);
                float f13 = c10.c(f11);
                arrn3[n5 + 4] = Float.floatToRawIntBits(f12);
                arrn2 = arrn3;
                if (arrstring == null) {
                    arrn2[n5 + 4 + 1] = Float.floatToRawIntBits(f13);
                    if (arrstring == null) continue;
                }
                break block2;
            }
            arrn2 = arrn3;
        }
        return arrn2;
    }

    public double j() {
        aL aL2 = this.n();
        return (aL2.c() + aL2.e()) / 2.0f;
    }

    public int[] f() {
        String[] arrstring = P.o();
        int[] arrn = this.f;
        if (arrstring == null) {
            if (arrn == null) {
                this.f = P.a(this.d(), this.p());
            }
            arrn = this.f;
        }
        return arrn;
    }

    public boolean e() {
        aL aL2 = this.n();
        return aL2.a(this.e);
    }

    public String toString() {
        return "vertex: " + this.a.length / 7 + ", tint: " + this.h + ", facing: " + this.e + ", sprite: " + this.i;
    }

    public aA b() {
        String[] arrstring = P.o();
        aA aA2 = this.e;
        if (arrstring == null) {
            if (aA2 == null) {
                this.e = N.a(this.d());
            }
            aA2 = this.e;
        }
        return aA2;
    }

    private static int[] b(int[] arrn) {
        int[] arrn2;
        block2: {
            int n2 = arrn.length / 4;
            int n3 = n2 / 2;
            int[] arrn3 = new int[n3 * 4];
            String[] arrstring = P.o();
            for (int i2 = 0; i2 < 4; ++i2) {
                arrn2 = arrn;
                if (arrstring == null) {
                    System.arraycopy(arrn2, i2 * n2, arrn3, i2 * n3, n3);
                    if (arrstring == null) continue;
                }
                break block2;
            }
            arrn2 = arrn3;
        }
        return arrn2;
    }

    public P(int[] arrn, int n2, aA aA2, c c10, boolean bl2, e e10) {
        this.f = null;
        this.c = cq.ao.b();
        this.b = net.minecraft.client.y.b.f;
        this.a = arrn;
        this.h = n2;
        this.e = aA2;
        this.i = c10;
        this.c = bl2;
        this.b = e10;
        this.a();
    }

    public P(int[] arrn, int n2, aA aA2, c c10) {
        this.f = null;
        this.c = cq.ao.b();
        this.b = net.minecraft.client.y.b.f;
        this.a = arrn;
        this.h = n2;
        this.e = aA2;
        this.i = c10;
        this.a();
    }

    public boolean c() {
        String[] arrstring = P.o();
        boolean bl2 = this.h;
        if (arrstring == null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    private static int[] a(int[] arrn) {
        int[] arrn2;
        block2: {
            int n2 = arrn.length / 4;
            int n3 = n2 * 2;
            String[] arrstring = P.o();
            int[] arrn3 = new int[n3 * 4];
            for (int i2 = 0; i2 < 4; ++i2) {
                arrn2 = arrn;
                if (arrstring == null) {
                    System.arraycopy(arrn2, i2 * n2, arrn3, i2 * n3, n2);
                    if (arrstring == null) continue;
                }
                break block2;
            }
            arrn2 = arrn3;
        }
        return arrn2;
    }

    private static c c(int[] arrn) {
        float f10;
        float f11;
        float f12;
        block2: {
            float f13 = 1.0f;
            f12 = 1.0f;
            float f14 = 0.0f;
            String[] arrstring = P.o();
            f11 = 0.0f;
            int n2 = arrn.length / 4;
            for (int i2 = 0; i2 < 4; ++i2) {
                int n3 = i2 * n2;
                float f15 = Float.intBitsToFloat(arrn[n3 + 4]);
                float f16 = Float.intBitsToFloat(arrn[n3 + 4 + 1]);
                f13 = Math.min(f13, f15);
                f12 = Math.min(f12, f16);
                f14 = Math.max(f14, f15);
                f10 = Math.max(f11, f16);
                if (arrstring == null) {
                    f11 = f10;
                    if (arrstring == null) continue;
                }
                break block2;
            }
            f10 = (f13 + f14) / 2.0f;
        }
        float f17 = f10;
        float f18 = (f12 + f11) / 2.0f;
        c c10 = Q.P().an().a(f17, f18);
        return c10;
    }

    public e k() {
        return this.b;
    }

    public aL n() {
        String[] arrstring = P.o();
        aL aL2 = this.g;
        if (arrstring == null) {
            if (aL2 == null) {
                this.g = new aL(this.d());
            }
            aL2 = this.g;
        }
        return aL2;
    }

    public c p() {
        String[] arrstring = P.o();
        c c10 = this.i;
        if (arrstring == null) {
            if (c10 == null) {
                this.i = P.c(this.d());
            }
            c10 = this.i;
        }
        return c10;
    }

    public boolean i() {
        aL aL2 = this.n();
        return aL2.b(this.e);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public int[] d() {
        this.a();
        return this.a;
    }

    public static String[] o() {
        return d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean h() {
        String[] arrstring = P.o();
        boolean bl2 = this.e();
        if (arrstring == null) {
            if (!bl2) return false;
            bl2 = this.i();
        }
        if (arrstring != null) return bl2;
        if (!bl2) return false;
        return true;
    }

    public int q() {
        return this.h;
    }

    public float m() {
        aL aL2 = this.n();
        return (aL2.b() + aL2.f()) / 2.0f;
    }

    public double g() {
        aL aL2 = this.n();
        return (aL2.a() + aL2.d()) / 2.0f;
    }
}

