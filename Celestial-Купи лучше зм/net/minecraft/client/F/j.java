/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.F;

import java.util.Calendar;
import net.minecraft.N.O;
import net.minecraft.W.az;
import net.minecraft.W.cd;
import net.minecraft.ar.v;
import net.minecraft.client.F.f;
import net.minecraft.client.w.A;
import net.minecraft.client.w.z;

public class j
extends f<O> {
    private static final /* synthetic */ v g;
    private static final /* synthetic */ v n;
    private static final /* synthetic */ v a;
    private /* synthetic */ boolean m;
    private static final /* synthetic */ v j;
    private final /* synthetic */ z h;
    private final /* synthetic */ z i;
    private static final /* synthetic */ v l;
    private static final /* synthetic */ v k;

    public j() {
        block0: {
            this.i = new z();
            this.h = new A();
            Calendar calendar = Calendar.getInstance();
            if (calendar.get(2) + 1 != 12 || calendar.get(5) < 24 || calendar.get(5) > 26) break block0;
            this.m = true;
        }
    }

    @Override
    public void a(O o2, double d10, double d11, double d12, float f10, int n2, float f11) {
        block42: {
            float f12;
            block66: {
                String[] arrstring;
                block65: {
                    float f13;
                    Object object;
                    block64: {
                        float f14;
                        O o3;
                        block63: {
                            block61: {
                                block62: {
                                    O o4;
                                    block60: {
                                        int n3;
                                        block58: {
                                            int n4;
                                            block59: {
                                                int n5;
                                                block57: {
                                                    int n6;
                                                    block48: {
                                                        block56: {
                                                            block55: {
                                                                j j2;
                                                                block54: {
                                                                    int n7;
                                                                    block52: {
                                                                        block53: {
                                                                            block45: {
                                                                                block51: {
                                                                                    block50: {
                                                                                        j j3;
                                                                                        block49: {
                                                                                            int n8;
                                                                                            block46: {
                                                                                                block47: {
                                                                                                    O o5;
                                                                                                    block44: {
                                                                                                        block43: {
                                                                                                            block41: {
                                                                                                                block40: {
                                                                                                                    int n9;
                                                                                                                    block35: {
                                                                                                                        block36: {
                                                                                                                            block37: {
                                                                                                                                block38: {
                                                                                                                                    int n10;
                                                                                                                                    block39: {
                                                                                                                                        String[] arrstring2 = net.minecraft.client.F.f.b();
                                                                                                                                        net.minecraft.client.a.v.t();
                                                                                                                                        arrstring = arrstring2;
                                                                                                                                        net.minecraft.client.a.v.o(515);
                                                                                                                                        net.minecraft.client.a.v.a(true);
                                                                                                                                        n9 = o2.h();
                                                                                                                                        if (arrstring == null) break block35;
                                                                                                                                        if (n9 == 0) break block36;
                                                                                                                                        object = o2.l();
                                                                                                                                        n6 = o2.m();
                                                                                                                                        if (arrstring == null) break block37;
                                                                                                                                        if (!(object instanceof az)) break block38;
                                                                                                                                        n10 = n6;
                                                                                                                                        if (arrstring == null) break block39;
                                                                                                                                        if (n10 != 0) break block38;
                                                                                                                                        ((az)object).b(o2.d(), o2.j(), o2.d().d(o2.j()));
                                                                                                                                        n10 = o2.m();
                                                                                                                                    }
                                                                                                                                    n6 = n10;
                                                                                                                                }
                                                                                                                                o2.e();
                                                                                                                            }
                                                                                                                            if (arrstring != null) break block40;
                                                                                                                        }
                                                                                                                        n9 = 0;
                                                                                                                    }
                                                                                                                    n6 = n9;
                                                                                                                }
                                                                                                                o5 = o2.p;
                                                                                                                if (arrstring == null) break block41;
                                                                                                                if (o5 != null) break block42;
                                                                                                                o5 = o2.u;
                                                                                                            }
                                                                                                            if (arrstring == null) break block43;
                                                                                                            if (o5 != null) break block42;
                                                                                                            o5 = o2.s;
                                                                                                        }
                                                                                                        if (arrstring == null) break block44;
                                                                                                        if (o5 != null) break block45;
                                                                                                        o5 = o2.v;
                                                                                                    }
                                                                                                    if (o5 != null) break block45;
                                                                                                    object = this.i;
                                                                                                    n8 = n2;
                                                                                                    if (arrstring == null) break block46;
                                                                                                    if (n8 < 0) break block47;
                                                                                                    this.b(c[n2]);
                                                                                                    net.minecraft.client.a.v.q(5890);
                                                                                                    net.minecraft.client.a.v.M();
                                                                                                    net.minecraft.client.a.v.d(4.0f, 4.0f, 1.0f);
                                                                                                    net.minecraft.client.a.v.b(0.0625f, 0.0625f, 0.0625f);
                                                                                                    net.minecraft.client.a.v.q(5888);
                                                                                                    if (arrstring != null) break block48;
                                                                                                }
                                                                                                j3 = this;
                                                                                                if (arrstring == null) break block49;
                                                                                                n8 = j3.m ? 1 : 0;
                                                                                            }
                                                                                            if (n8 == 0) break block50;
                                                                                            j3 = this;
                                                                                        }
                                                                                        j3.b(g);
                                                                                        if (arrstring != null) break block48;
                                                                                    }
                                                                                    if (o2.a() != cd.TRAP) break block51;
                                                                                    this.b(n);
                                                                                    if (arrstring != null) break block48;
                                                                                }
                                                                                this.b(l);
                                                                                if (arrstring != null) break block48;
                                                                            }
                                                                            object = this.h;
                                                                            n7 = n2;
                                                                            if (arrstring == null) break block52;
                                                                            if (n7 < 0) break block53;
                                                                            this.b(c[n2]);
                                                                            net.minecraft.client.a.v.q(5890);
                                                                            net.minecraft.client.a.v.M();
                                                                            net.minecraft.client.a.v.d(8.0f, 4.0f, 1.0f);
                                                                            net.minecraft.client.a.v.b(0.0625f, 0.0625f, 0.0625f);
                                                                            net.minecraft.client.a.v.q(5888);
                                                                            if (arrstring != null) break block48;
                                                                        }
                                                                        j2 = this;
                                                                        if (arrstring == null) break block54;
                                                                        n7 = j2.m ? 1 : 0;
                                                                    }
                                                                    if (n7 == 0) break block55;
                                                                    j2 = this;
                                                                }
                                                                j2.b(k);
                                                                if (arrstring != null) break block48;
                                                            }
                                                            if (o2.a() != cd.TRAP) break block56;
                                                            this.b(j);
                                                            if (arrstring != null) break block48;
                                                        }
                                                        this.b(a);
                                                    }
                                                    net.minecraft.client.a.v.M();
                                                    net.minecraft.client.a.v.q();
                                                    int n11 = n2;
                                                    if (arrstring != null) {
                                                        if (n11 < 0) {
                                                            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, f11);
                                                        }
                                                        net.minecraft.client.a.v.b((float)d10, (float)d11 + 1.0f, (float)d12 + 1.0f);
                                                        net.minecraft.client.a.v.d(1.0f, -1.0f, -1.0f);
                                                        net.minecraft.client.a.v.b(0.5f, 0.5f, 0.5f);
                                                        n11 = 0;
                                                    }
                                                    n4 = n11;
                                                    n3 = n6;
                                                    n5 = 2;
                                                    if (arrstring != null) {
                                                        if (n3 == n5) {
                                                            n4 = 180;
                                                        }
                                                        n3 = n6;
                                                        n5 = 3;
                                                    }
                                                    if (arrstring != null) {
                                                        if (n3 == n5) {
                                                            n4 = 0;
                                                        }
                                                        n3 = n6;
                                                        n5 = 4;
                                                    }
                                                    if (arrstring != null) {
                                                        if (n3 == n5) {
                                                            n4 = 90;
                                                        }
                                                        n3 = n6;
                                                        n5 = 5;
                                                    }
                                                    if (arrstring != null) {
                                                        if (n3 == n5) {
                                                            n4 = -90;
                                                        }
                                                        n3 = n6;
                                                        n5 = 2;
                                                    }
                                                    if (arrstring == null) break block57;
                                                    if (n3 == n5 && o2.s != null) {
                                                        net.minecraft.client.a.v.b(1.0f, 0.0f, 0.0f);
                                                    }
                                                    n3 = n6;
                                                    if (arrstring == null) break block58;
                                                    n5 = 5;
                                                }
                                                if (n3 != n5) break block59;
                                                o4 = o2.v;
                                                if (arrstring == null) break block60;
                                                if (o4 != null) {
                                                    net.minecraft.client.a.v.b(0.0f, 0.0f, -1.0f);
                                                }
                                            }
                                            n3 = n4;
                                        }
                                        net.minecraft.client.a.v.a((float)n3, 0.0f, 1.0f, 0.0f);
                                        net.minecraft.client.a.v.b(-0.5f, -0.5f, -0.5f);
                                        o4 = o2;
                                    }
                                    f13 = o4.m + (o2.o - o2.m) * f10;
                                    o3 = o2.p;
                                    if (arrstring == null) break block61;
                                    if (o3 == null) break block62;
                                    o3 = o2.p;
                                    if (arrstring == null) break block61;
                                    f14 = o3.m + (o2.p.o - o2.p.m) * f10;
                                    if (f14 > f13) {
                                        f13 = f14;
                                    }
                                }
                                o3 = o2.u;
                            }
                            if (arrstring == null) break block63;
                            if (o3 == null) break block64;
                            o3 = o2.u;
                        }
                        f14 = o3.m + (o2.u.o - o2.u.m) * f10;
                        f12 = f14 == f13 ? 0 : (f14 > f13 ? 1 : -1);
                        if (arrstring == null) break block65;
                        if (f12 > 0) {
                            f13 = f14;
                        }
                    }
                    f13 = 1.0f - f13;
                    f13 = 1.0f - f13 * f13 * f13;
                    object.i.y = -(f13 * 1.5707964f);
                    ((z)object).a();
                    net.minecraft.client.a.v.u();
                    net.minecraft.client.a.v.B();
                    net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                    f12 = n2;
                }
                if (arrstring == null) break block66;
                if (f12 < 0) break block42;
                net.minecraft.client.a.v.q(5890);
                net.minecraft.client.a.v.B();
                f12 = 5888;
            }
            net.minecraft.client.a.v.q((int)f12);
        }
    }

    static {
        j = new v("textures/entity/chest/trapped_double.png");
        k = new v("textures/entity/chest/christmas_double.png");
        a = new v("textures/entity/chest/normal_double.png");
        n = new v("textures/entity/chest/trapped.png");
        g = new v("textures/entity/chest/christmas.png");
        l = new v("textures/entity/chest/normal.png");
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

