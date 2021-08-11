/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
package net.minecraft.client.m;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import net.minecraft.W.K;
import net.minecraft.client.D.h;
import net.minecraft.client.Q;
import net.minecraft.client.a.W;
import net.minecraft.client.b.L;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.aL;
import net.minecraft.client.e.y;
import net.minecraft.client.m.b;
import net.minecraft.l.f;
import net.minecraft.u.E;
import net.minecraft.w.k;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
abstract class d
extends aL {
    protected /* synthetic */ int y;
    protected /* synthetic */ int z;
    protected /* synthetic */ List<f> B;
    protected /* synthetic */ Comparator<f> C;
    protected /* synthetic */ int A;
    final /* synthetic */ b x;

    protected void a(net.minecraft.l.d d10, int n2, int n3, boolean n4) {
        block7: {
            String string;
            String string2;
            block6: {
                net.minecraft.l.d d11;
                block5: {
                    string2 = K.c();
                    d11 = d10;
                    if (string2 == null) break block5;
                    if (d11 == null) break block6;
                    d11 = d10;
                }
                string = d11.a(net.minecraft.client.m.b.p(this.x).a(d10));
                a5 a52 = net.minecraft.client.m.b.l(this.x);
                int n5 = n2 - net.minecraft.client.m.b.b(this.x).e(string);
                int n6 = n4;
                if (string2 != null) {
                    n6 = n6 != 0 ? 0xFFFFFF : 0x909090;
                }
                this.x.a(a52, string, n5, n3 + 5, n6);
                if (string2 != null) break block7;
            }
            string = "-";
            a5 a53 = net.minecraft.client.m.b.q(this.x);
            int n7 = n2 - net.minecraft.client.m.b.f(this.x).e("-");
            int n8 = n4;
            if (string2 != null) {
                n8 = n8 != 0 ? 0xFFFFFF : 0x909090;
            }
            this.x.a(a53, "-", n7, n3 + 5, n8);
        }
    }

    @Override
    protected final int d() {
        return this.B.size();
    }

    protected abstract String b(int var1);

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected int h() {
        return this.k / 2 + 140;
    }

    protected d(b b10, Q q2) {
        this.x = b10;
        super(q2, L.h, L.w, 32, L.w - 64, 20);
        this.z = -1;
        this.y = -1;
        this.a(false);
        this.a(true, 20);
    }

    @Override
    public int j() {
        return 375;
    }

    protected void a(f f10, int n2, int n3) {
        block3: {
            int n4;
            String string;
            block4: {
                f f11;
                String string2;
                block2: {
                    string2 = K.c();
                    f11 = f10;
                    if (string2 == null) break block2;
                    if (f11 == null) break block3;
                    f11 = f10;
                }
                k k2 = f11.a();
                net.minecraft.w.d d10 = new net.minecraft.w.d(k2);
                String string3 = d10.i();
                string = ("" + h.a(string3 + ".name", new Object[0])).trim();
                n4 = string.isEmpty();
                if (string2 == null) break block4;
                if (n4 != 0) break block3;
                n4 = n2 + 12;
            }
            int n5 = n4;
            int n6 = n3 - 12;
            int n7 = net.minecraft.client.m.b.i(this.x).e(string);
            this.x.a(n5 - 3, n6 - 3, (double)(n5 + n7 + 3), (double)(n6 + 8 + 3), -1073741824, -1073741824);
            net.minecraft.client.m.b.h(this.x).c(string, n5, n6, -1);
        }
    }

    @Override
    protected void c() {
        this.x.n();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    protected void e(int n2) {
        block4: {
            block5: {
                d d10;
                block6: {
                    int n3;
                    int n4;
                    String string;
                    block2: {
                        block3: {
                            string = K.c();
                            n4 = n2;
                            n3 = this.y;
                            if (string == null) break block2;
                            if (n4 == n3) break block3;
                            this.y = n2;
                            this.A = -1;
                            if (string != null) break block4;
                        }
                        d10 = this;
                        if (string == null) break block5;
                        n4 = d10.A;
                        n3 = -1;
                    }
                    if (n4 != n3) break block6;
                    this.A = 1;
                    if (string != null) break block4;
                }
                this.y = -1;
                d10 = this;
            }
            d10.A = 0;
        }
        Collections.sort(this.B, this.C);
    }

    @Override
    protected void b(int n2, int n3) {
        block15: {
            d d10;
            block14: {
                int n4;
                block13: {
                    String string;
                    block6: {
                        int n5;
                        block11: {
                            block12: {
                                block9: {
                                    block10: {
                                        block7: {
                                            block8: {
                                                block4: {
                                                    block5: {
                                                        this.z = -1;
                                                        string = K.c();
                                                        n4 = n2;
                                                        n5 = 79;
                                                        if (string == null) break block4;
                                                        if (n4 < n5) break block5;
                                                        n4 = n2;
                                                        n5 = 115;
                                                        if (string == null) break block4;
                                                        if (n4 >= n5) break block5;
                                                        this.z = 0;
                                                        if (string != null) break block6;
                                                    }
                                                    n4 = n2;
                                                    n5 = 129;
                                                }
                                                if (string == null) break block7;
                                                if (n4 < n5) break block8;
                                                n4 = n2;
                                                n5 = 165;
                                                if (string == null) break block7;
                                                if (n4 >= n5) break block8;
                                                this.z = 1;
                                                if (string != null) break block6;
                                            }
                                            n4 = n2;
                                            n5 = 179;
                                        }
                                        if (string == null) break block9;
                                        if (n4 < n5) break block10;
                                        n4 = n2;
                                        n5 = 215;
                                        if (string == null) break block9;
                                        if (n4 >= n5) break block10;
                                        this.z = 2;
                                        if (string != null) break block6;
                                    }
                                    n4 = n2;
                                    n5 = 229;
                                }
                                if (string == null) break block11;
                                if (n4 < n5) break block12;
                                n4 = n2;
                                n5 = 265;
                                if (string == null) break block11;
                                if (n4 >= n5) break block12;
                                this.z = 3;
                                if (string != null) break block6;
                            }
                            n4 = n2;
                            if (string == null) break block13;
                            n5 = 279;
                        }
                        if (n4 < n5) break block6;
                        n4 = n2;
                        if (string == null) break block13;
                        if (n4 < 315) {
                            this.z = 4;
                        }
                    }
                    d10 = this;
                    if (string == null) break block14;
                    n4 = d10.z;
                }
                if (n4 < 0) break block15;
                this.e(this.z);
                d10 = this;
            }
            d10.u.p().c(net.minecraft.client.e.y.a(E.bN, 1.0f));
        }
    }

    protected final f a(int n2) {
        return this.B.get(n2);
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    @Override
    protected void d(int n2, int n3) {
        block7: {
            int n4;
            Object object;
            block26: {
                String string;
                block16: {
                    block25: {
                        block24: {
                            int n5;
                            int n6;
                            block23: {
                                int n7;
                                block21: {
                                    block22: {
                                        block19: {
                                            block20: {
                                                block17: {
                                                    block18: {
                                                        block14: {
                                                            block15: {
                                                                block9: {
                                                                    block10: {
                                                                        int n8;
                                                                        block13: {
                                                                            block12: {
                                                                                int n9;
                                                                                int n10;
                                                                                block11: {
                                                                                    int n11;
                                                                                    block8: {
                                                                                        int n12;
                                                                                        block6: {
                                                                                            string = K.c();
                                                                                            int n12 = n3;
                                                                                            n12 = this.s;
                                                                                            if (string == null) break block6;
                                                                                            if (n11 < n12) break block7;
                                                                                            n11 = n3;
                                                                                            if (string == null) break block8;
                                                                                            n12 = this.o;
                                                                                        }
                                                                                        if (n11 > n12) break block7;
                                                                                        n11 = this.c(n2, n3);
                                                                                    }
                                                                                    n8 = n11;
                                                                                    n7 = (this.k - this.j()) / 2;
                                                                                    n6 = n8;
                                                                                    if (string == null) break block9;
                                                                                    if (n6 < 0) break block10;
                                                                                    int n9 = n2;
                                                                                    n9 = n7 + 40;
                                                                                    if (string == null) break block11;
                                                                                    if (n10 < n9) break block12;
                                                                                    int n9 = n2;
                                                                                    n9 = n7 + 40 + 20;
                                                                                }
                                                                                if (n10 <= n9) break block13;
                                                                            }
                                                                            return;
                                                                        }
                                                                        object = this.a(n8);
                                                                        this.a((f)object, n2, n3);
                                                                        if (string != null) break block7;
                                                                    }
                                                                    n6 = n2;
                                                                }
                                                                n5 = n7 + 115 - 18;
                                                                if (string == null) break block14;
                                                                if (n6 < n5) break block15;
                                                                int n5 = n2;
                                                                n5 = n7 + 115;
                                                                if (string == null) break block14;
                                                                if (n6 > n5) break block15;
                                                                object = this.b(0);
                                                                if (string != null) break block16;
                                                            }
                                                            int n5 = n2;
                                                            n5 = n7 + 165 - 18;
                                                        }
                                                        if (string == null) break block17;
                                                        if (n6 < n5) break block18;
                                                        int n5 = n2;
                                                        n5 = n7 + 165;
                                                        if (string == null) break block17;
                                                        if (n6 > n5) break block18;
                                                        object = this.b(1);
                                                        if (string != null) break block16;
                                                    }
                                                    int n5 = n2;
                                                    n5 = n7 + 215 - 18;
                                                }
                                                if (string == null) break block19;
                                                if (n6 < n5) break block20;
                                                int n5 = n2;
                                                n5 = n7 + 215;
                                                if (string == null) break block19;
                                                if (n6 > n5) break block20;
                                                object = this.b(2);
                                                if (string != null) break block16;
                                            }
                                            int n5 = n2;
                                            n5 = n7 + 265 - 18;
                                        }
                                        if (string == null) break block21;
                                        if (n6 < n5) break block22;
                                        int n5 = n2;
                                        n5 = n7 + 265;
                                        if (string == null) break block21;
                                        if (n6 > n5) break block22;
                                        object = this.b(3);
                                        if (string != null) break block16;
                                    }
                                    int n5 = n2;
                                    n5 = n7 + 315 - 18;
                                }
                                if (string == null) break block23;
                                if (n6 < n5) break block24;
                                int n5 = n2;
                                n5 = n7 + 315;
                            }
                            if (n6 <= n5) break block25;
                        }
                        return;
                    }
                    object = this.b(4);
                }
                object = ("" + h.a((String)object, new Object[0])).trim();
                n4 = ((String)object).isEmpty();
                if (string == null) break block26;
                if (n4 != 0) break block7;
                n4 = n2 + 12;
            }
            int n13 = n4;
            int n14 = n3 - 12;
            int n15 = net.minecraft.client.m.b.k(this.x).e((String)object);
            this.x.a(n13 - 3, n14 - 3, (double)(n13 + n15 + 3), (double)(n14 + 8 + 3), -1073741824, -1073741824);
            net.minecraft.client.m.b.d(this.x).c((String)object, n13, n14, -1);
        }
    }

    @Override
    protected void a(int n2, int n3, W w2) {
        block38: {
            d d10;
            int n4;
            int n5;
            block47: {
                int n6;
                int n7;
                block46: {
                    String string;
                    block41: {
                        block44: {
                            block45: {
                                block42: {
                                    block43: {
                                        block39: {
                                            block40: {
                                                int n8;
                                                block37: {
                                                    block36: {
                                                        d d11;
                                                        block34: {
                                                            block35: {
                                                                block33: {
                                                                    d d12;
                                                                    block31: {
                                                                        block32: {
                                                                            block30: {
                                                                                d d13;
                                                                                block28: {
                                                                                    block29: {
                                                                                        block27: {
                                                                                            d d14;
                                                                                            block25: {
                                                                                                block26: {
                                                                                                    block24: {
                                                                                                        d d15;
                                                                                                        block22: {
                                                                                                            block23: {
                                                                                                                int n9;
                                                                                                                block21: {
                                                                                                                    string = K.c();
                                                                                                                    n9 = Mouse.isButtonDown((int)0);
                                                                                                                    if (string == null) break block21;
                                                                                                                    if (n9 == 0) {
                                                                                                                        this.z = -1;
                                                                                                                    }
                                                                                                                    d15 = this;
                                                                                                                    if (string == null) break block22;
                                                                                                                    n9 = d15.z;
                                                                                                                }
                                                                                                                if (n9 != 0) break block23;
                                                                                                                net.minecraft.client.m.b.a(this.x, n2 + 115 - 18, n3 + 1, 0, 0);
                                                                                                                if (string != null) break block24;
                                                                                                            }
                                                                                                            d15 = this;
                                                                                                        }
                                                                                                        net.minecraft.client.m.b.a(d15.x, n2 + 115 - 18, n3 + 1, 0, 18);
                                                                                                    }
                                                                                                    d14 = this;
                                                                                                    if (string == null) break block25;
                                                                                                    if (d14.z != 1) break block26;
                                                                                                    net.minecraft.client.m.b.a(this.x, n2 + 165 - 18, n3 + 1, 0, 0);
                                                                                                    if (string != null) break block27;
                                                                                                }
                                                                                                d14 = this;
                                                                                            }
                                                                                            net.minecraft.client.m.b.a(d14.x, n2 + 165 - 18, n3 + 1, 0, 18);
                                                                                        }
                                                                                        d13 = this;
                                                                                        if (string == null) break block28;
                                                                                        if (d13.z != 2) break block29;
                                                                                        net.minecraft.client.m.b.a(this.x, n2 + 215 - 18, n3 + 1, 0, 0);
                                                                                        if (string != null) break block30;
                                                                                    }
                                                                                    d13 = this;
                                                                                }
                                                                                net.minecraft.client.m.b.a(d13.x, n2 + 215 - 18, n3 + 1, 0, 18);
                                                                            }
                                                                            d12 = this;
                                                                            if (string == null) break block31;
                                                                            if (d12.z != 3) break block32;
                                                                            net.minecraft.client.m.b.a(this.x, n2 + 265 - 18, n3 + 1, 0, 0);
                                                                            if (string != null) break block33;
                                                                        }
                                                                        d12 = this;
                                                                    }
                                                                    net.minecraft.client.m.b.a(d12.x, n2 + 265 - 18, n3 + 1, 0, 18);
                                                                }
                                                                d11 = this;
                                                                if (string == null) break block34;
                                                                if (d11.z != 4) break block35;
                                                                net.minecraft.client.m.b.a(this.x, n2 + 315 - 18, n3 + 1, 0, 0);
                                                                if (string != null) break block36;
                                                            }
                                                            d11 = this;
                                                        }
                                                        net.minecraft.client.m.b.a(d11.x, n2 + 315 - 18, n3 + 1, 0, 18);
                                                    }
                                                    n8 = this.y;
                                                    if (string == null) break block37;
                                                    if (n8 == -1) break block38;
                                                    n8 = 79;
                                                }
                                                n5 = n8;
                                                n4 = 18;
                                                n7 = this.y;
                                                n6 = 1;
                                                if (string == null) break block39;
                                                if (n7 != n6) break block40;
                                                n5 = 129;
                                                if (string != null) break block41;
                                            }
                                            n7 = this.y;
                                            n6 = 2;
                                        }
                                        if (string == null) break block42;
                                        if (n7 != n6) break block43;
                                        n5 = 179;
                                        if (string != null) break block41;
                                    }
                                    n7 = this.y;
                                    n6 = 3;
                                }
                                if (string == null) break block44;
                                if (n7 != n6) break block45;
                                n5 = 229;
                                if (string != null) break block41;
                            }
                            n7 = this.y;
                            n6 = 4;
                        }
                        if (string == null) break block46;
                        if (n7 == n6) {
                            n5 = 279;
                        }
                    }
                    d10 = this;
                    if (string == null) break block47;
                    n7 = d10.A;
                    n6 = 1;
                }
                if (n7 == n6) {
                    n4 = 36;
                }
                d10 = this;
            }
            net.minecraft.client.m.b.a(d10.x, n2 + n5, n3 + 1, n4, 0);
        }
    }
}

