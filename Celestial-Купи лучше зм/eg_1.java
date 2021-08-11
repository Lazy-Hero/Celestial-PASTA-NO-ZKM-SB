/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;

public abstract class eg
implements Cloneable,
Serializable {
    public /* synthetic */ int c;
    public /* synthetic */ int b;
    static final /* synthetic */ long serialVersionUID = -732740491767276200L;
    public /* synthetic */ int a;

    public eg() {
        this.b = 0;
        this.c = 0;
        this.a = 0;
    }

    public final void f(eg eg2) {
        eg2.b = this.b;
        eg2.c = this.c;
        eg2.a = this.a;
    }

    public final void a(int n2, int n3) {
        block21: {
            block22: {
                eg eg2;
                int n4;
                int n5;
                block19: {
                    int n6;
                    block20: {
                        block18: {
                            block17: {
                                block15: {
                                    block16: {
                                        block14: {
                                            block13: {
                                                block11: {
                                                    block12: {
                                                        n6 = ae.g();
                                                        n5 = this.b;
                                                        n4 = n3;
                                                        if (n6 != 0) break block11;
                                                        if (n5 <= n4) break block12;
                                                        this.b = n3;
                                                        if (n6 == 0) break block13;
                                                    }
                                                    n5 = this.b;
                                                    n4 = n2;
                                                }
                                                if (n6 != 0) break block14;
                                                if (n5 < n4) {
                                                    this.b = n2;
                                                }
                                            }
                                            n5 = this.c;
                                            n4 = n3;
                                        }
                                        if (n6 != 0) break block15;
                                        if (n5 <= n4) break block16;
                                        this.c = n3;
                                        if (n6 == 0) break block17;
                                    }
                                    n5 = this.c;
                                    n4 = n2;
                                }
                                if (n6 != 0) break block18;
                                if (n5 < n4) {
                                    this.c = n2;
                                }
                            }
                            n5 = this.a;
                            n4 = n3;
                        }
                        if (n6 != 0) break block19;
                        if (n5 <= n4) break block20;
                        this.a = n3;
                        if (n6 == 0) break block21;
                    }
                    eg2 = this;
                    if (n6 != 0) break block22;
                    n5 = eg2.a;
                    n4 = n2;
                }
                if (n5 >= n4) break block21;
                eg2 = this;
            }
            eg2.a = n2;
        }
    }

    public final void d(int n2, eg eg2) {
        block14: {
            block12: {
                eg eg3;
                block13: {
                    int n3;
                    block11: {
                        block9: {
                            eg eg4;
                            block10: {
                                block8: {
                                    block6: {
                                        eg eg5;
                                        block7: {
                                            n3 = ae.f();
                                            eg5 = eg2;
                                            if (n3 == 0) break block6;
                                            if (eg5.b <= n2) break block7;
                                            this.b = n2;
                                            if (n3 != 0) break block8;
                                        }
                                        eg5 = this;
                                    }
                                    eg5.b = eg2.b;
                                }
                                eg4 = eg2;
                                if (n3 == 0) break block9;
                                if (eg4.c <= n2) break block10;
                                this.c = n2;
                                if (n3 != 0) break block11;
                            }
                            eg4 = this;
                        }
                        eg4.c = eg2.c;
                    }
                    eg3 = eg2;
                    if (n3 == 0) break block12;
                    if (eg3.a <= n2) break block13;
                    this.a = n2;
                    if (n3 != 0) break block14;
                }
                eg3 = this;
            }
            eg3.a = eg2.a;
        }
    }

    public final void c(int n2, eg eg2) {
        block14: {
            block12: {
                eg eg3;
                block13: {
                    int n3;
                    block11: {
                        block9: {
                            eg eg4;
                            block10: {
                                block8: {
                                    block6: {
                                        eg eg5;
                                        block7: {
                                            n3 = ae.f();
                                            eg5 = eg2;
                                            if (n3 == 0) break block6;
                                            if (eg5.b >= n2) break block7;
                                            this.b = n2;
                                            if (n3 != 0) break block8;
                                        }
                                        eg5 = this;
                                    }
                                    eg5.b = eg2.b;
                                }
                                eg4 = eg2;
                                if (n3 == 0) break block9;
                                if (eg4.c >= n2) break block10;
                                this.c = n2;
                                if (n3 != 0) break block11;
                            }
                            eg4 = this;
                        }
                        eg4.c = eg2.c;
                    }
                    eg3 = eg2;
                    if (n3 == 0) break block12;
                    if (eg3.a >= n2) break block13;
                    this.a = n2;
                    if (n3 != 0) break block14;
                }
                eg3 = this;
            }
            eg3.a = eg2.a;
        }
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
    }

    public final void a(int[] arrn) {
        arrn[0] = this.b;
        arrn[1] = this.c;
        arrn[2] = this.a;
    }

    public final void b(int n2, eg eg2) {
        this.b = n2 * eg2.b;
        this.c = n2 * eg2.c;
        this.a = n2 * eg2.a;
    }

    public String toString() {
        return "(" + this.b + ", " + this.c + ", " + this.a + ")";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        int n2;
        int n3;
        block9: {
            eg eg2;
            int n4;
            block8: {
                n4 = ae.g();
                eg2 = (eg)object;
                n3 = this.b;
                n2 = eg2.b;
                if (n4 != 0) break block8;
                if (n3 != n2) return 0 != 0;
                n3 = this.c;
                n2 = eg2.c;
            }
            if (n4 != 0) break block9;
            if (n3 != n2) return 0 != 0;
            n3 = this.a;
            if (n4 != 0) return n3 != 0;
            n2 = eg2.a;
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

    public final void a(int n2, int n3, eg eg2) {
        block18: {
            block19: {
                eg eg3;
                block20: {
                    int n4;
                    int n5;
                    int n6;
                    block16: {
                        block17: {
                            block13: {
                                block14: {
                                    eg eg4;
                                    block15: {
                                        int n7;
                                        int n8;
                                        block11: {
                                            block12: {
                                                block8: {
                                                    block9: {
                                                        eg eg5;
                                                        block10: {
                                                            int n9;
                                                            int n10;
                                                            block6: {
                                                                block7: {
                                                                    n6 = ae.f();
                                                                    n10 = eg2.b;
                                                                    n9 = n3;
                                                                    if (n6 == 0) break block6;
                                                                    if (n10 <= n9) break block7;
                                                                    this.b = n3;
                                                                    if (n6 != 0) break block8;
                                                                }
                                                                eg5 = eg2;
                                                                if (n6 == 0) break block9;
                                                                n10 = eg5.b;
                                                                n9 = n2;
                                                            }
                                                            if (n10 >= n9) break block10;
                                                            this.b = n2;
                                                            if (n6 != 0) break block8;
                                                        }
                                                        eg5 = this;
                                                    }
                                                    eg5.b = eg2.b;
                                                }
                                                n8 = eg2.c;
                                                n7 = n3;
                                                if (n6 == 0) break block11;
                                                if (n8 <= n7) break block12;
                                                this.c = n3;
                                                if (n6 != 0) break block13;
                                            }
                                            eg4 = eg2;
                                            if (n6 == 0) break block14;
                                            n8 = eg4.c;
                                            n7 = n2;
                                        }
                                        if (n8 >= n7) break block15;
                                        this.c = n2;
                                        if (n6 != 0) break block13;
                                    }
                                    eg4 = this;
                                }
                                eg4.c = eg2.c;
                            }
                            n5 = eg2.a;
                            n4 = n3;
                            if (n6 == 0) break block16;
                            if (n5 <= n4) break block17;
                            this.a = n3;
                            if (n6 != 0) break block18;
                        }
                        eg3 = eg2;
                        if (n6 == 0) break block19;
                        n5 = eg3.a;
                        n4 = n2;
                    }
                    if (n5 >= n4) break block20;
                    this.a = n2;
                    if (n6 != 0) break block18;
                }
                eg3 = this;
            }
            eg3.a = eg2.a;
        }
    }

    public final void b(int[] arrn) {
        this.b = arrn[0];
        this.c = arrn[1];
        this.a = arrn[2];
    }

    public final int e() {
        return this.b;
    }

    public final void a(eg eg2) {
        this.b += eg2.b;
        this.c += eg2.c;
        this.a += eg2.a;
    }

    public final void e(eg eg2) {
        this.b -= eg2.b;
        this.c -= eg2.c;
        this.a -= eg2.a;
    }

    public eg(int n2, int n3, int n4) {
        this.b = n2;
        this.c = n3;
        this.a = n4;
    }

    public final void e(int n2) {
        this.a = n2;
    }

    public final void d(eg eg2) {
        this.b = eg2.b;
        this.c = eg2.c;
        this.a = eg2.a;
    }

    public final void b() {
        this.b = -this.b;
        this.c = -this.c;
        this.a = -this.a;
    }

    public final void c(eg eg2) {
        this.b = -eg2.b;
        this.c = -eg2.c;
        this.a = -eg2.a;
    }

    public final int a() {
        return this.a;
    }

    public final void c() {
        this.b = Math.abs(this.b);
        this.c = Math.abs(this.c);
        this.a = Math.abs(this.a);
    }

    public final void b(int n2) {
        this.c = n2;
    }

    public final void a(int n2, eg eg2, eg eg3) {
        this.b = n2 * eg2.b + eg3.b;
        this.c = n2 * eg2.c + eg3.c;
        this.a = n2 * eg2.a + eg3.a;
    }

    public eg(int[] arrn) {
        this.b = arrn[0];
        this.c = arrn[1];
        this.a = arrn[2];
    }

    public Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new InternalError();
        }
    }

    public final void a(int n2) {
        this.b = n2;
    }

    public final void b(eg eg2, eg eg3) {
        this.b = eg2.b + eg3.b;
        this.c = eg2.c + eg3.c;
        this.a = eg2.a + eg3.a;
    }

    public final void f(int n2) {
        this.b *= n2;
        this.c *= n2;
        this.a *= n2;
    }

    public int hashCode() {
        long l2 = 1L;
        l2 = 31L * l2 + (long)this.b;
        l2 = 31L * l2 + (long)this.c;
        l2 = 31L * l2 + (long)this.a;
        return (int)(l2 ^ l2 >> 32);
    }

    public final void c(int n2) {
        block8: {
            block7: {
                eg eg2;
                int n3;
                int n4;
                block6: {
                    int n5 = ae.g();
                    n4 = this.b;
                    n3 = n2;
                    if (n5 == 0) {
                        if (n4 > n3) {
                            this.b = n2;
                        }
                        n4 = this.c;
                        n3 = n2;
                    }
                    if (n5 != 0) break block6;
                    if (n4 > n3) {
                        this.c = n2;
                    }
                    eg2 = this;
                    if (n5 != 0) break block7;
                    n4 = eg2.a;
                    n3 = n2;
                }
                if (n4 <= n3) break block8;
                eg2 = this;
            }
            eg2.a = n2;
        }
    }

    public final void a(int n2, int n3, int n4) {
        this.b = n2;
        this.c = n3;
        this.a = n4;
    }

    public final void a(int n2, eg eg2) {
        this.b = n2 * this.b + eg2.b;
        this.c = n2 * this.c + eg2.c;
        this.a = n2 * this.a + eg2.a;
    }

    public final int d() {
        return this.c;
    }

    public final void b(eg eg2) {
        this.b = Math.abs(eg2.b);
        this.c = Math.abs(eg2.c);
        this.a = Math.abs(eg2.a);
    }

    public final void d(int n2) {
        block8: {
            block7: {
                eg eg2;
                int n3;
                int n4;
                block6: {
                    int n5 = ae.f();
                    n4 = this.b;
                    n3 = n2;
                    if (n5 != 0) {
                        if (n4 < n3) {
                            this.b = n2;
                        }
                        n4 = this.c;
                        n3 = n2;
                    }
                    if (n5 == 0) break block6;
                    if (n4 < n3) {
                        this.c = n2;
                    }
                    eg2 = this;
                    if (n5 == 0) break block7;
                    n4 = eg2.a;
                    n3 = n2;
                }
                if (n4 >= n3) break block8;
                eg2 = this;
            }
            eg2.a = n2;
        }
    }

    public eg(eg eg2) {
        this.b = eg2.b;
        this.c = eg2.c;
        this.a = eg2.a;
    }

    public final void a(eg eg2, eg eg3) {
        this.b = eg2.b - eg3.b;
        this.c = eg2.c - eg3.c;
        this.a = eg2.a - eg3.a;
    }
}

