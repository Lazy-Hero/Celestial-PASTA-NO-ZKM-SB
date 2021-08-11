/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.e;

import net.minecraft.e.f;
import net.minecraft.e.i;

public class g {
    private /* synthetic */ f[] a;
    private /* synthetic */ int b;

    private void b(int n2) {
        block12: {
            f f10 = this.a[n2];
            float f11 = f10.h;
            int n3 = i.n();
            do {
                float f12;
                f f13;
                float f14;
                f f15;
                int n4;
                int n5;
                block14: {
                    block13: {
                        n5 = 1 + (n2 << 1);
                        n4 = n5 + 1;
                        if (n5 >= this.b) {
                            if (n3 != 0) {
                                if (n3 != 0) break;
                            }
                            break block12;
                        }
                        f15 = this.a[n5];
                        f14 = f15.h;
                        if (n4 < this.b) break block13;
                        f13 = null;
                        f12 = Float.POSITIVE_INFINITY;
                        if (n3 != 0) break block14;
                    }
                    f13 = this.a[n4];
                    f12 = f13.h;
                }
                float f16 = f14 == f12 ? 0 : (f14 < f12 ? -1 : 1);
                if (n3 != 0) {
                    if (f16 < 0) {
                        float f17 = f14 == f11 ? 0 : (f14 > f11 ? 1 : -1);
                        if (n3 != 0) {
                            if (f17 >= 0 && n3 != 0) break;
                            this.a[n2] = f15;
                            f15.l = n2;
                            f17 = n5;
                        }
                        n2 = (int)f17;
                        if (n3 != 0) continue;
                    }
                    f16 = f12 == f11 ? 0 : (f12 > f11 ? 1 : -1);
                }
                if (n3 != 0) {
                    if (f16 >= 0 && n3 != 0) break;
                    this.a[n2] = f13;
                    f13.l = n2;
                    f16 = n4;
                }
                n2 = (int)f16;
            } while (n3 != 0);
            this.a[n2] = f10;
            f10.l = n2;
        }
    }

    public f a() {
        f f10 = this.a[0];
        int n2 = i.n();
        this.a[0] = this.a[--this.b];
        this.a[this.b] = null;
        if (n2 != 0) {
            if (this.b > 0) {
                this.b(0);
            }
            f10.l = -1;
        }
        return f10;
    }

    public void a(f f10, float f11) {
        block2: {
            block1: {
                int n2;
                block0: {
                    float f12 = f10.h;
                    n2 = i.n();
                    f10.h = f11;
                    if (n2 == 0) break block0;
                    if (!(f11 < f12)) break block1;
                    this.a(f10.l);
                }
                if (n2 != 0) break block2;
            }
            this.b(f10.l);
        }
    }

    public f a(f f10) {
        g g10;
        block6: {
            int n2;
            block5: {
                int n3 = i.g();
                n2 = f10.l;
                if (n3 != 0) break block5;
                if (n2 >= 0) {
                    throw new IllegalStateException("OW KNOWS!");
                }
                g10 = this;
                if (n3 != 0) break block6;
                n2 = g10.b;
            }
            if (n2 == this.a.length) {
                f[] arrf = new f[this.b << 1];
                System.arraycopy(this.a, 0, arrf, 0, this.b);
                this.a = arrf;
            }
            this.a[this.b] = f10;
            f10.l = this.b;
            g10 = this;
        }
        g10.a(this.b++);
        return f10;
    }

    public void b() {
        this.b = 0;
    }

    public boolean c() {
        int n2 = i.n();
        boolean bl2 = this.b;
        if (n2 != 0) {
            bl2 = !bl2;
        }
        return bl2;
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    public g() {
        this.a = new f[128];
    }

    private void a(int n2) {
        block3: {
            f f10 = this.a[n2];
            int n3 = i.n();
            float f11 = f10.h;
            while (n2 > 0) {
                int n4 = n2 - 1 >> 1;
                f f12 = this.a[n4];
                if (n3 != 0) {
                    float f13 = f11 - f12.h;
                    float f14 = f13 == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                    if (n3 != 0) {
                        if (f14 >= 0 && n3 != 0) break;
                        this.a[n2] = f12;
                        f12.l = n2;
                        f14 = n4;
                    }
                    n2 = (int)f14;
                    if (n3 != 0) continue;
                }
                break block3;
            }
            this.a[n2] = f10;
            f10.l = n2;
        }
    }
}

