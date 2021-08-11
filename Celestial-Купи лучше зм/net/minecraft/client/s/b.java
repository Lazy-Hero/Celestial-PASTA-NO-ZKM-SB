/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.s;

import net.minecraft.client.a.I;
import net.minecraft.client.a.W;
import net.minecraft.client.a.as;
import net.minecraft.client.a.v;
import net.minecraft.client.j.p;

public class b {
    private static /* synthetic */ int j;
    public /* synthetic */ int c;
    public /* synthetic */ int a;
    public /* synthetic */ int g;
    public /* synthetic */ float[] f;
    public /* synthetic */ int e;
    public /* synthetic */ int i;
    public /* synthetic */ int h;
    public /* synthetic */ int d;
    public /* synthetic */ boolean k;
    public /* synthetic */ int b;

    public b(int n2, int n3, boolean bl2) {
        this.k = bl2;
        this.c = -1;
        this.d = -1;
        this.h = -1;
        this.f = new float[4];
        this.f[0] = 1.0f;
        this.f[1] = 1.0f;
        this.f[2] = 1.0f;
        this.f[3] = 0.0f;
        this.a(n2, n3);
    }

    public static int g() {
        return j;
    }

    public void h() {
        block3: {
            int n2;
            block2: {
                int n3 = net.minecraft.client.s.b.c();
                n2 = as.c();
                if (n3 == 0) break block2;
                if (n2 == 0) break block3;
                n2 = this.d;
            }
            v.t(n2);
        }
    }

    public void b() {
        int n2 = net.minecraft.client.s.b.g();
        this.a(true);
        int n3 = n2;
        v.c(this.f[0], this.f[1], this.f[2], this.f[3]);
        int n4 = 16384;
        int n5 = this.k;
        if (n3 == 0) {
            if (n5 != 0) {
                v.a(1.0);
                n4 |= 0x100;
            }
            n5 = n4;
        }
        v.h(n5);
        this.a();
    }

    public void f() {
        block11: {
            int n2;
            int n3;
            int n4;
            int n5;
            block10: {
                n5 = as.j(as.f);
                n4 = net.minecraft.client.s.b.g();
                n3 = n5;
                n2 = as.W;
                if (n4 != 0) break block10;
                if (n3 == n2) break block11;
                n3 = n5;
                n2 = as.z;
            }
            if (n4 == 0) {
                if (n3 == n2) {
                    throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
                }
                n3 = n5;
                n2 = as.aa;
            }
            if (n4 == 0) {
                if (n3 == n2) {
                    throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
                }
                n3 = n5;
                n2 = as.Y;
            }
            if (n4 == 0) {
                if (n3 == n2) {
                    throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
                }
                n3 = n5;
                n2 = as.H;
            }
            if (n3 == n2) {
                throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
            }
            throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + n5);
        }
    }

    public void b(int n2, int n3) {
        this.a(n2, n3, true);
    }

    public static int c() {
        int n2 = net.minecraft.client.s.b.g();
        if (n2 == 0) {
            return 43;
        }
        return 0;
    }

    public void a() {
        block3: {
            int n2;
            block2: {
                int n3 = net.minecraft.client.s.b.g();
                n2 = as.c();
                if (n3 != 0) break block2;
                if (n2 == 0) break block3;
                n2 = as.f;
            }
            as.b(n2, 0);
        }
    }

    public void a(int n2, int n3) {
        block7: {
            int n4;
            int n5;
            block5: {
                block6: {
                    n5 = net.minecraft.client.s.b.c();
                    n4 = as.c();
                    if (n5 == 0) break block5;
                    if (n4 != 0) break block6;
                    this.e = n2;
                    this.a = n3;
                    if (n5 != 0) break block7;
                }
                v.t();
                n4 = this.c;
            }
            if (n5 != 0) {
                if (n4 >= 0) {
                    this.e();
                }
                this.c(n2, n3);
                this.f();
                n4 = as.f;
            }
            as.b(n4, 0);
        }
    }

    static {
        if (net.minecraft.client.s.b.g() != 0) {
            net.minecraft.client.s.b.b(96);
        }
    }

    public void a(int n2, int n3, boolean bl2) {
        block6: {
            int n4;
            int n5;
            block5: {
                n5 = net.minecraft.client.s.b.g();
                n4 = as.c();
                if (n5 != 0) break block5;
                if (n4 == 0) break block6;
                v.a(true, true, true, false);
                v.n();
                v.a(false);
                v.q(5889);
                v.l();
                v.a(0.0, n2, n3, 0.0, 1000.0, 3000.0);
                v.q(5888);
                v.l();
                v.b(0.0f, 0.0f, -2000.0f);
                v.d(0, 0, n2, n3);
                v.x();
                v.y();
                v.v();
                n4 = bl2 ? 1 : 0;
            }
            if (n5 == 0) {
                if (n4 != 0) {
                    v.f();
                    v.r();
                }
                v.b(1.0f, 1.0f, 1.0f, 1.0f);
                this.h();
                n4 = n2;
            }
            float f10 = n4;
            float f11 = n3;
            float f12 = (float)this.e / (float)this.g;
            float f13 = (float)this.a / (float)this.b;
            W w2 = W.c();
            I i2 = w2.b();
            i2.a(7, net.minecraft.client.y.b.t);
            i2.c(0.0, (double)f11, 0.0).a(0.0, 0.0).b(255, 255, 255, 255).d();
            i2.c((double)f10, (double)f11, 0.0).a(f12, 0.0).b(255, 255, 255, 255).d();
            i2.c((double)f10, 0.0, 0.0).a(f12, f13).b(255, 255, 255, 255).d();
            i2.c(0.0, 0.0, 0.0).a(0.0, f13).b(255, 255, 255, 255).d();
            w2.a();
            this.d();
            v.a(true);
            v.a(true, true, true, true);
        }
    }

    public void c(int n2, int n3) {
        block7: {
            b b10;
            block9: {
                boolean bl2;
                block8: {
                    int n4;
                    block5: {
                        block6: {
                            this.e = n2;
                            this.a = n3;
                            this.g = n2;
                            n4 = net.minecraft.client.s.b.g();
                            this.b = n3;
                            bl2 = as.c();
                            if (n4 != 0) break block5;
                            if (bl2) break block6;
                            this.b();
                            if (n4 == 0) break block7;
                        }
                        this.c = as.i();
                        this.d = p.a();
                        bl2 = this.k;
                    }
                    if (n4 != 0) break block8;
                    if (bl2) {
                        this.h = as.g();
                    }
                    this.c(9728);
                    v.t(this.d);
                    v.a(3553, 0, 32856, this.g, this.b, 0, 6408, 5121, null);
                    as.b(as.f, this.c);
                    as.a(as.f, as.D, 3553, this.d, 0);
                    b10 = this;
                    if (n4 != 0) break block9;
                    bl2 = b10.k;
                }
                if (bl2) {
                    as.e(as.Q, this.h);
                    as.b(as.Q, 33190, this.g, this.b);
                    as.a(as.f, as.r, as.Q, this.h);
                }
                this.b();
                b10 = this;
            }
            b10.d();
        }
    }

    public void c(int n2) {
        block3: {
            int n3;
            block2: {
                int n4 = net.minecraft.client.s.b.g();
                n3 = as.c();
                if (n4 != 0) break block2;
                if (n3 == 0) break block3;
                this.i = n2;
                v.t(this.d);
                v.c(3553, 10241, n2);
                v.c(3553, 10240, n2);
                v.c(3553, 10242, 10496);
                v.c(3553, 10243, 10496);
                n3 = 0;
            }
            v.t(n3);
        }
    }

    public void a(boolean bl2) {
        block3: {
            int n2;
            block4: {
                int n3;
                block2: {
                    n3 = net.minecraft.client.s.b.g();
                    n2 = as.c();
                    if (n3 != 0) break block2;
                    if (n2 == 0) break block3;
                    as.b(as.f, this.c);
                    n2 = bl2;
                }
                if (n3 != 0) break block4;
                if (n2 == 0) break block3;
                n2 = 0;
            }
            v.d(n2, 0, this.e, this.a);
        }
    }

    public void e() {
        block8: {
            int n2;
            int n3;
            block9: {
                int n4;
                block7: {
                    n4 = net.minecraft.client.s.b.c();
                    n3 = as.c();
                    if (n4 == 0) break block7;
                    if (n3 == 0) break block8;
                    this.d();
                    this.a();
                    n3 = this.h;
                }
                n2 = -1;
                if (n4 != 0) {
                    if (n3 > n2) {
                        as.k(this.h);
                        this.h = -1;
                    }
                    n3 = this.d;
                    n2 = -1;
                }
                if (n4 != 0) {
                    if (n3 > n2) {
                        p.c(this.d);
                        this.d = -1;
                    }
                    n3 = this.c;
                    n2 = -1;
                }
                if (n4 == 0) break block9;
                if (n3 <= n2) break block8;
                n3 = as.f;
                n2 = 0;
            }
            as.b(n3, n2);
            as.b(this.c);
            this.c = -1;
        }
    }

    public static void b(int n2) {
        j = n2;
    }

    public void d() {
        block3: {
            int n2;
            block2: {
                int n3 = net.minecraft.client.s.b.c();
                n2 = as.c();
                if (n3 == 0) break block2;
                if (n2 == 0) break block3;
                n2 = 0;
            }
            v.t(n2);
        }
    }

    public void a(float f10, float f11, float f12, float f13) {
        this.f[0] = f10;
        this.f[1] = f11;
        this.f[2] = f12;
        this.f[3] = f13;
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
    }
}

