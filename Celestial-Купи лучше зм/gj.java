/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public abstract class gj
implements Cloneable,
Serializable {
    public /* synthetic */ int a;
    public /* synthetic */ int b;
    static final /* synthetic */ long serialVersionUID = -3555701650170169638L;

    public final void f(gj gj2) {
        this.a = Math.abs(gj2.a);
        this.b = Math.abs(gj2.b);
    }

    public gj() {
        this.a = 0;
        this.b = 0;
    }

    public final void b(int n2, int n3) {
        block13: {
            block14: {
                gj gj2;
                int n4;
                int n5;
                block11: {
                    int n6;
                    block12: {
                        block10: {
                            block9: {
                                block7: {
                                    block8: {
                                        n6 = ae.f();
                                        n5 = this.a;
                                        n4 = n3;
                                        if (n6 == 0) break block7;
                                        if (n5 <= n4) break block8;
                                        this.a = n3;
                                        if (n6 != 0) break block9;
                                    }
                                    n5 = this.a;
                                    n4 = n2;
                                }
                                if (n6 == 0) break block10;
                                if (n5 < n4) {
                                    this.a = n2;
                                }
                            }
                            n5 = this.b;
                            n4 = n3;
                        }
                        if (n6 == 0) break block11;
                        if (n5 <= n4) break block12;
                        this.b = n3;
                        if (n6 != 0) break block13;
                    }
                    gj2 = this;
                    if (n6 == 0) break block14;
                    n5 = gj2.b;
                    n4 = n2;
                }
                if (n5 >= n4) break block13;
                gj2 = this;
            }
            gj2.b = n2;
        }
    }

    public final void a(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public final int d() {
        return this.b;
    }

    public final void a(int n2, int n3, gj gj2) {
        block11: {
            block12: {
                gj gj3;
                block13: {
                    int n4;
                    int n5;
                    int n6;
                    block9: {
                        block10: {
                            block6: {
                                block7: {
                                    gj gj4;
                                    block8: {
                                        int n7;
                                        int n8;
                                        block4: {
                                            block5: {
                                                n6 = ae.f();
                                                n8 = gj2.a;
                                                n7 = n3;
                                                if (n6 == 0) break block4;
                                                if (n8 <= n7) break block5;
                                                this.a = n3;
                                                if (n6 != 0) break block6;
                                            }
                                            gj4 = gj2;
                                            if (n6 == 0) break block7;
                                            n8 = gj4.a;
                                            n7 = n2;
                                        }
                                        if (n8 >= n7) break block8;
                                        this.a = n2;
                                        if (n6 != 0) break block6;
                                    }
                                    gj4 = this;
                                }
                                gj4.a = gj2.a;
                            }
                            n5 = gj2.b;
                            n4 = n3;
                            if (n6 == 0) break block9;
                            if (n5 <= n4) break block10;
                            this.b = n3;
                            if (n6 != 0) break block11;
                        }
                        gj3 = gj2;
                        if (n6 == 0) break block12;
                        n5 = gj3.b;
                        n4 = n2;
                    }
                    if (n5 >= n4) break block13;
                    this.b = n2;
                    if (n6 != 0) break block11;
                }
                gj3 = this;
            }
            gj3.b = gj2.b;
        }
    }

    public final void c(gj gj2) {
        gj2.a = this.a;
        gj2.b = this.b;
    }

    public final void b(int[] arrn) {
        this.a = arrn[0];
        this.b = arrn[1];
    }

    public final void b(gj gj2) {
        this.a -= gj2.a;
        this.b -= gj2.b;
    }

    public final void d(int n2) {
        this.a *= n2;
        this.b *= n2;
    }

    public final void a(int n2, gj gj2) {
        this.a = n2 * this.a + gj2.a;
        this.b = n2 * this.b + gj2.b;
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    public final void c(int n2) {
        block6: {
            block5: {
                gj gj2;
                int n3;
                int n4;
                block4: {
                    int n5 = ae.f();
                    n4 = this.a;
                    n3 = n2;
                    if (n5 == 0) break block4;
                    if (n4 < n3) {
                        this.a = n2;
                    }
                    gj2 = this;
                    if (n5 == 0) break block5;
                    n4 = gj2.b;
                    n3 = n2;
                }
                if (n4 >= n3) break block6;
                gj2 = this;
            }
            gj2.b = n2;
        }
    }

    public final void b() {
        this.a = Math.abs(this.a);
        this.b = Math.abs(this.b);
    }

    public final void c(int n2, gj gj2) {
        block9: {
            block7: {
                gj gj3;
                block8: {
                    int n3;
                    block6: {
                        block4: {
                            gj gj4;
                            block5: {
                                n3 = ae.g();
                                gj4 = gj2;
                                if (n3 != 0) break block4;
                                if (gj4.a >= n2) break block5;
                                this.a = n2;
                                if (n3 == 0) break block6;
                            }
                            gj4 = this;
                        }
                        gj4.a = gj2.a;
                    }
                    gj3 = gj2;
                    if (n3 != 0) break block7;
                    if (gj3.b >= n2) break block8;
                    this.b = n2;
                    if (n3 == 0) break block9;
                }
                gj3 = this;
            }
            gj3.b = gj2.b;
        }
    }

    public int hashCode() {
        long l2 = 1L;
        l2 = 31L * l2 + (long)this.a;
        l2 = 31L * l2 + (long)this.b;
        return (int)(l2 ^ l2 >> 32);
    }

    public final void c() {
        this.a = -this.a;
        this.b = -this.b;
    }

    public final void a(int[] arrn) {
        arrn[0] = this.a;
        arrn[1] = this.b;
    }

    public final void b(int n2, gj gj2) {
        this.a = n2 * gj2.a;
        this.b = n2 * gj2.b;
    }

    public gj(int[] arrn) {
        this.a = arrn[0];
        this.b = arrn[1];
    }

    public String toString() {
        return "(" + this.a + ", " + this.b + ")";
    }

    public final void a(gj gj2, gj gj3) {
        this.a = gj2.a - gj3.a;
        this.b = gj2.b - gj3.b;
    }

    public gj(int n2, int n3) {
        this.a = n2;
        this.b = n3;
    }

    public final void d(int n2, gj gj2) {
        block9: {
            block7: {
                gj gj3;
                block8: {
                    int n3;
                    block6: {
                        block4: {
                            gj gj4;
                            block5: {
                                n3 = ae.f();
                                gj4 = gj2;
                                if (n3 == 0) break block4;
                                if (gj4.a <= n2) break block5;
                                this.a = n2;
                                if (n3 != 0) break block6;
                            }
                            gj4 = this;
                        }
                        gj4.a = gj2.a;
                    }
                    gj3 = gj2;
                    if (n3 == 0) break block7;
                    if (gj3.b <= n2) break block8;
                    this.b = n2;
                    if (n3 != 0) break block9;
                }
                gj3 = this;
            }
            gj3.b = gj2.b;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int n2;
        int n3;
        block6: {
            int n4 = ae.f();
            gj gj2 = (gj)object;
            n3 = this.a;
            n2 = gj2.a;
            if (n4 == 0) break block6;
            if (n3 != n2) return 0 != 0;
            n3 = this.b;
            if (n4 == 0) return n3 != 0;
            n2 = gj2.b;
        }
        try {
            if (n3 != n2) return 0 != 0;
            return 1 != 0;
        }
        catch (NullPointerException nullPointerException) {
            return false;
        }
        catch (ClassCastException classCastException) {
            return false;
        }
    }

    public final int a() {
        return this.a;
    }

    public final void a(int n2, gj gj2, gj gj3) {
        this.a = n2 * gj2.a + gj3.a;
        this.b = n2 * gj2.b + gj3.b;
    }

    public final void a(gj gj2) {
        this.a = gj2.a;
        this.b = gj2.b;
    }

    public final void d(gj gj2) {
        this.a += gj2.a;
        this.b += gj2.b;
    }

    public final void a(int n2) {
        this.a = n2;
    }

    public final void e(gj gj2) {
        this.a = -gj2.a;
        this.b = -gj2.b;
    }

    public final void b(gj gj2, gj gj3) {
        this.a = gj2.a + gj3.a;
        this.b = gj2.b + gj3.b;
    }

    public final void b(int n2) {
        block6: {
            block5: {
                gj gj2;
                int n3;
                int n4;
                block4: {
                    int n5 = ae.g();
                    n4 = this.a;
                    n3 = n2;
                    if (n5 != 0) break block4;
                    if (n4 > n3) {
                        this.a = n2;
                    }
                    gj2 = this;
                    if (n5 != 0) break block5;
                    n4 = gj2.b;
                    n3 = n2;
                }
                if (n4 <= n3) break block6;
                gj2 = this;
            }
            gj2.b = n2;
        }
    }

    public final void e(int n2) {
        this.b = n2;
    }

    public gj(gj gj2) {
        this.a = gj2.a;
        this.b = gj2.b;
    }
}

