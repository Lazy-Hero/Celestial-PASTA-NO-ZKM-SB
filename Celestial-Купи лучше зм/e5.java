/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public abstract class e5
implements Cloneable,
Serializable {
    static final /* synthetic */ long serialVersionUID = 8064614250942616720L;
    public /* synthetic */ int c;
    public /* synthetic */ int a;
    public /* synthetic */ int b;
    public /* synthetic */ int d;

    public e5(int n2, int n3, int n4, int n5) {
        this.a = n2;
        this.d = n3;
        this.c = n4;
        this.b = n5;
    }

    public final void a(e5 e52) {
        this.a = Math.abs(e52.a);
        this.d = Math.abs(e52.d);
        this.c = Math.abs(e52.c);
        this.b = Math.abs(e52.b);
    }

    public final void e(int n2) {
        this.d = n2;
    }

    public final void a(int n2, int n3) {
        block29: {
            block30: {
                e5 e52;
                int n4;
                int n5;
                block27: {
                    int n6;
                    block28: {
                        block26: {
                            block25: {
                                block23: {
                                    block24: {
                                        block22: {
                                            block21: {
                                                block19: {
                                                    block20: {
                                                        block18: {
                                                            block17: {
                                                                block15: {
                                                                    block16: {
                                                                        n6 = ae.f();
                                                                        n5 = this.a;
                                                                        n4 = n3;
                                                                        if (n6 == 0) break block15;
                                                                        if (n5 <= n4) break block16;
                                                                        this.a = n3;
                                                                        if (n6 != 0) break block17;
                                                                    }
                                                                    n5 = this.a;
                                                                    n4 = n2;
                                                                }
                                                                if (n6 == 0) break block18;
                                                                if (n5 < n4) {
                                                                    this.a = n2;
                                                                }
                                                            }
                                                            n5 = this.d;
                                                            n4 = n3;
                                                        }
                                                        if (n6 == 0) break block19;
                                                        if (n5 <= n4) break block20;
                                                        this.d = n3;
                                                        if (n6 != 0) break block21;
                                                    }
                                                    n5 = this.d;
                                                    n4 = n2;
                                                }
                                                if (n6 == 0) break block22;
                                                if (n5 < n4) {
                                                    this.d = n2;
                                                }
                                            }
                                            n5 = this.c;
                                            n4 = n3;
                                        }
                                        if (n6 == 0) break block23;
                                        if (n5 <= n4) break block24;
                                        this.c = n3;
                                        if (n6 != 0) break block25;
                                    }
                                    n5 = this.c;
                                    n4 = n2;
                                }
                                if (n6 == 0) break block26;
                                if (n5 < n4) {
                                    this.c = n2;
                                }
                            }
                            n5 = this.b;
                            n4 = n3;
                        }
                        if (n6 == 0) break block27;
                        if (n5 <= n4) break block28;
                        this.b = n3;
                        if (n6 != 0) break block29;
                    }
                    e52 = this;
                    if (n6 == 0) break block30;
                    n5 = e52.b;
                    n4 = n2;
                }
                if (n5 >= n4) break block29;
                e52 = this;
            }
            e52.b = n2;
        }
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }

    public e5(int[] arrn) {
        this.a = arrn[0];
        this.d = arrn[1];
        this.c = arrn[2];
        this.b = arrn[3];
    }

    public final void d(int n2, e5 e52) {
        block19: {
            block17: {
                e5 e53;
                block18: {
                    int n3;
                    block16: {
                        block14: {
                            e5 e54;
                            block15: {
                                block13: {
                                    block11: {
                                        e5 e55;
                                        block12: {
                                            block10: {
                                                block8: {
                                                    e5 e56;
                                                    block9: {
                                                        n3 = ae.f();
                                                        e56 = e52;
                                                        if (n3 == 0) break block8;
                                                        if (e56.a >= n2) break block9;
                                                        this.a = n2;
                                                        if (n3 != 0) break block10;
                                                    }
                                                    e56 = this;
                                                }
                                                e56.a = e52.a;
                                            }
                                            e55 = e52;
                                            if (n3 == 0) break block11;
                                            if (e55.d >= n2) break block12;
                                            this.d = n2;
                                            if (n3 != 0) break block13;
                                        }
                                        e55 = this;
                                    }
                                    e55.d = e52.d;
                                }
                                e54 = e52;
                                if (n3 == 0) break block14;
                                if (e54.c >= n2) break block15;
                                this.c = n2;
                                if (n3 != 0) break block16;
                            }
                            e54 = this;
                        }
                        e54.c = e52.c;
                    }
                    e53 = e52;
                    if (n3 == 0) break block17;
                    if (e53.b >= n2) break block18;
                    this.b = n2;
                    if (n3 != 0) break block19;
                }
                e53 = this;
            }
            e53.b = e52.b;
        }
    }

    public e5() {
        this.a = 0;
        this.d = 0;
        this.c = 0;
        this.b = 0;
    }

    public final int f() {
        return this.b;
    }

    public final void a(int n2) {
        this.a *= n2;
        this.d *= n2;
        this.c *= n2;
        this.b *= n2;
    }

    public final void d(e5 e52) {
        e52.a = this.a;
        e52.d = this.d;
        e52.c = this.c;
        e52.b = this.b;
    }

    public final void f(e5 e52) {
        this.a -= e52.a;
        this.d -= e52.d;
        this.c -= e52.c;
        this.b -= e52.b;
    }

    public final void b(e5 e52, e5 e53) {
        this.a = e52.a - e53.a;
        this.d = e52.d - e53.d;
        this.c = e52.c - e53.c;
        this.b = e52.b - e53.b;
    }

    public final void c(int n2) {
        block10: {
            block9: {
                e5 e52;
                int n3;
                int n4;
                block8: {
                    int n5 = ae.f();
                    n4 = this.a;
                    n3 = n2;
                    if (n5 != 0) {
                        if (n4 < n3) {
                            this.a = n2;
                        }
                        n4 = this.d;
                        n3 = n2;
                    }
                    if (n5 != 0) {
                        if (n4 < n3) {
                            this.d = n2;
                        }
                        n4 = this.c;
                        n3 = n2;
                    }
                    if (n5 == 0) break block8;
                    if (n4 < n3) {
                        this.c = n2;
                    }
                    e52 = this;
                    if (n5 == 0) break block9;
                    n4 = e52.b;
                    n3 = n2;
                }
                if (n4 >= n3) break block10;
                e52 = this;
            }
            e52.b = n2;
        }
    }

    public final void a(int[] arrn) {
        arrn[0] = this.a;
        arrn[1] = this.d;
        arrn[2] = this.c;
        arrn[3] = this.b;
    }

    public int hashCode() {
        long l2 = 1L;
        l2 = 31L * l2 + (long)this.a;
        l2 = 31L * l2 + (long)this.d;
        l2 = 31L * l2 + (long)this.c;
        l2 = 31L * l2 + (long)this.b;
        return (int)(l2 ^ l2 >> 32);
    }

    public final void b(int[] arrn) {
        this.a = arrn[0];
        this.d = arrn[1];
        this.c = arrn[2];
        this.b = arrn[3];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int n2;
        int n3;
        block12: {
            e5 e52;
            int n4;
            block11: {
                block10: {
                    n4 = ae.f();
                    e52 = (e5)object;
                    n3 = this.a;
                    n2 = e52.a;
                    if (n4 == 0) break block10;
                    if (n3 != n2) return 0 != 0;
                    n3 = this.d;
                    n2 = e52.d;
                }
                if (n4 == 0) break block11;
                if (n3 != n2) return 0 != 0;
                n3 = this.c;
                n2 = e52.c;
            }
            if (n4 == 0) break block12;
            if (n3 != n2) return 0 != 0;
            n3 = this.b;
            if (n4 == 0) return n3 != 0;
            n2 = e52.b;
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

    public final int e() {
        return this.a;
    }

    public e5(e5 e52) {
        this.a = e52.a;
        this.d = e52.d;
        this.c = e52.c;
        this.b = e52.b;
    }

    public final void a(int n2, int n3, e5 e52) {
        block25: {
            block26: {
                e5 e53;
                block27: {
                    int n4;
                    int n5;
                    int n6;
                    block23: {
                        block24: {
                            block20: {
                                block21: {
                                    e5 e54;
                                    block22: {
                                        int n7;
                                        int n8;
                                        block18: {
                                            block19: {
                                                block15: {
                                                    block16: {
                                                        e5 e55;
                                                        block17: {
                                                            int n9;
                                                            int n10;
                                                            block13: {
                                                                block14: {
                                                                    block10: {
                                                                        block11: {
                                                                            e5 e56;
                                                                            block12: {
                                                                                int n11;
                                                                                int n12;
                                                                                block8: {
                                                                                    block9: {
                                                                                        n6 = ae.f();
                                                                                        n12 = e52.a;
                                                                                        n11 = n3;
                                                                                        if (n6 == 0) break block8;
                                                                                        if (n12 <= n11) break block9;
                                                                                        this.a = n3;
                                                                                        if (n6 != 0) break block10;
                                                                                    }
                                                                                    e56 = e52;
                                                                                    if (n6 == 0) break block11;
                                                                                    n12 = e56.a;
                                                                                    n11 = n2;
                                                                                }
                                                                                if (n12 >= n11) break block12;
                                                                                this.a = n2;
                                                                                if (n6 != 0) break block10;
                                                                            }
                                                                            e56 = this;
                                                                        }
                                                                        e56.a = e52.a;
                                                                    }
                                                                    n10 = e52.d;
                                                                    n9 = n3;
                                                                    if (n6 == 0) break block13;
                                                                    if (n10 <= n9) break block14;
                                                                    this.d = n3;
                                                                    if (n6 != 0) break block15;
                                                                }
                                                                e55 = e52;
                                                                if (n6 == 0) break block16;
                                                                n10 = e55.d;
                                                                n9 = n2;
                                                            }
                                                            if (n10 >= n9) break block17;
                                                            this.d = n2;
                                                            if (n6 != 0) break block15;
                                                        }
                                                        e55 = this;
                                                    }
                                                    e55.d = e52.d;
                                                }
                                                n8 = e52.c;
                                                n7 = n3;
                                                if (n6 == 0) break block18;
                                                if (n8 <= n7) break block19;
                                                this.c = n3;
                                                if (n6 != 0) break block20;
                                            }
                                            e54 = e52;
                                            if (n6 == 0) break block21;
                                            n8 = e54.c;
                                            n7 = n2;
                                        }
                                        if (n8 >= n7) break block22;
                                        this.c = n2;
                                        if (n6 != 0) break block20;
                                    }
                                    e54 = this;
                                }
                                e54.c = e52.c;
                            }
                            n5 = e52.b;
                            n4 = n3;
                            if (n6 == 0) break block23;
                            if (n5 <= n4) break block24;
                            this.b = n3;
                            if (n6 != 0) break block25;
                        }
                        e53 = e52;
                        if (n6 == 0) break block26;
                        n5 = e53.b;
                        n4 = n2;
                    }
                    if (n5 >= n4) break block27;
                    this.b = n2;
                    if (n6 != 0) break block25;
                }
                e53 = this;
            }
            e53.b = e52.b;
        }
    }

    public final void a() {
        this.a = -this.a;
        this.d = -this.d;
        this.c = -this.c;
        this.b = -this.b;
    }

    public final void b(int n2) {
        this.c = n2;
    }

    public final void f(int n2) {
        this.b = n2;
    }

    public final void e(e5 e52) {
        this.a += e52.a;
        this.d += e52.d;
        this.c += e52.c;
        this.b += e52.b;
    }

    public final void a(e5 e52, e5 e53) {
        this.a = e52.a + e53.a;
        this.d = e52.d + e53.d;
        this.c = e52.c + e53.c;
        this.b = e52.b + e53.b;
    }

    public final void a(int n2, int n3, int n4, int n5) {
        this.a = n2;
        this.d = n3;
        this.c = n4;
        this.b = n5;
    }

    public final void c(int n2, e5 e52) {
        this.a = n2 * this.a + e52.a;
        this.d = n2 * this.d + e52.d;
        this.c = n2 * this.c + e52.c;
        this.b = n2 * this.b + e52.b;
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    public final void b(e5 e52) {
        this.a = -e52.a;
        this.d = -e52.d;
        this.c = -e52.c;
        this.b = -e52.b;
    }

    public final void d(int n2) {
        block10: {
            block9: {
                e5 e52;
                int n3;
                int n4;
                block8: {
                    int n5 = ae.f();
                    n4 = this.a;
                    n3 = n2;
                    if (n5 != 0) {
                        if (n4 > n3) {
                            this.a = n2;
                        }
                        n4 = this.d;
                        n3 = n2;
                    }
                    if (n5 != 0) {
                        if (n4 > n3) {
                            this.d = n2;
                        }
                        n4 = this.c;
                        n3 = n2;
                    }
                    if (n5 == 0) break block8;
                    if (n4 > n3) {
                        this.c = n2;
                    }
                    e52 = this;
                    if (n5 == 0) break block9;
                    n4 = e52.b;
                    n3 = n2;
                }
                if (n4 <= n3) break block10;
                e52 = this;
            }
            e52.b = n2;
        }
    }

    public final void b(int n2, e5 e52) {
        block19: {
            block17: {
                e5 e53;
                block18: {
                    int n3;
                    block16: {
                        block14: {
                            e5 e54;
                            block15: {
                                block13: {
                                    block11: {
                                        e5 e55;
                                        block12: {
                                            block10: {
                                                block8: {
                                                    e5 e56;
                                                    block9: {
                                                        n3 = ae.f();
                                                        e56 = e52;
                                                        if (n3 == 0) break block8;
                                                        if (e56.a <= n2) break block9;
                                                        this.a = n2;
                                                        if (n3 != 0) break block10;
                                                    }
                                                    e56 = this;
                                                }
                                                e56.a = e52.a;
                                            }
                                            e55 = e52;
                                            if (n3 == 0) break block11;
                                            if (e55.d <= n2) break block12;
                                            this.d = n2;
                                            if (n3 != 0) break block13;
                                        }
                                        e55 = this;
                                    }
                                    e55.d = e52.d;
                                }
                                e54 = e52;
                                if (n3 == 0) break block14;
                                if (e54.c <= n2) break block15;
                                this.c = n2;
                                if (n3 != 0) break block16;
                            }
                            e54 = this;
                        }
                        e54.c = e52.c;
                    }
                    e53 = e52;
                    if (n3 == 0) break block17;
                    if (e53.b <= n2) break block18;
                    this.b = n2;
                    if (n3 != 0) break block19;
                }
                e53 = this;
            }
            e53.b = e52.c;
        }
    }

    public final void c(e5 e52) {
        this.a = e52.a;
        this.d = e52.d;
        this.c = e52.c;
        this.b = e52.b;
    }

    public final int b() {
        return this.d;
    }

    public final void a(int n2, e5 e52, e5 e53) {
        this.a = n2 * e52.a + e53.a;
        this.d = n2 * e52.d + e53.d;
        this.c = n2 * e52.c + e53.c;
        this.b = n2 * e52.b + e53.b;
    }

    public String toString() {
        return "(" + this.a + ", " + this.d + ", " + this.c + ", " + this.b + ")";
    }

    public final int c() {
        return this.c;
    }

    public final void g(int n2) {
        this.a = n2;
    }

    public final void a(int n2, e5 e52) {
        this.a = n2 * e52.a;
        this.d = n2 * e52.d;
        this.c = n2 * e52.c;
        this.b = n2 * e52.b;
    }

    public final void d() {
        this.a = Math.abs(this.a);
        this.d = Math.abs(this.d);
        this.c = Math.abs(this.c);
        this.b = Math.abs(this.b);
    }
}

