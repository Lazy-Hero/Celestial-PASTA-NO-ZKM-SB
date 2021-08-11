/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import java.nio.ByteBuffer;
import java.util.List;
import net.minecraft.client.a.I;
import net.minecraft.client.a.ai;
import net.minecraft.client.a.as;
import net.minecraft.client.a.v;
import net.minecraft.client.y.d;
import net.minecraft.client.y.e;
import net.minecraft.client.y.g;

public class Q {
    public void a(I i2) {
        block21: {
            I i3;
            block22: {
                block23: {
                    int n2;
                    Object object;
                    int n3;
                    int n4;
                    List<g> list;
                    ByteBuffer byteBuffer;
                    int n5;
                    e e10;
                    String string;
                    block30: {
                        int n6;
                        block31: {
                            block32: {
                                block28: {
                                    block29: {
                                        block20: {
                                            string = I.j();
                                            i3 = i2;
                                            if (string != null) break block22;
                                            if (i3.a() <= 0) break block23;
                                            e10 = i2.g();
                                            n5 = e10.c();
                                            byteBuffer = i2.b();
                                            list = e10.f();
                                            int n7 = cq.bE.b();
                                            n4 = cq.cS.b();
                                            n3 = 0;
                                            while (n3 < list.size()) {
                                                block27: {
                                                    block26: {
                                                        int n8;
                                                        g g10;
                                                        block24: {
                                                            block25: {
                                                                g10 = list.get(n3);
                                                                object = g10.g();
                                                                n6 = n7;
                                                                if (string != null) break block20;
                                                                if (string != null) break block24;
                                                                if (n6 == 0) break block25;
                                                                cq.b(object, cq.bE, e10, n3, n5, byteBuffer);
                                                                if (string == null) break block26;
                                                            }
                                                            n8 = g10.a().b();
                                                        }
                                                        void var12_13 = n8;
                                                        n2 = g10.f();
                                                        byteBuffer.position(e10.c(n3));
                                                        if (string != null) break block27;
                                                        switch (ai.a[((Enum)object).ordinal()]) {
                                                            case 1: {
                                                                v.c(g10.b(), (int)var12_13, n5, byteBuffer);
                                                                v.r(32884);
                                                                if (string == null) break;
                                                            }
                                                            case 2: {
                                                                as.f(as.U + n2);
                                                                v.b(g10.b(), (int)var12_13, n5, byteBuffer);
                                                                v.r(32888);
                                                                as.f(as.U);
                                                                if (string == null) break;
                                                            }
                                                            case 3: {
                                                                v.a(g10.b(), (int)var12_13, n5, byteBuffer);
                                                                v.r(32886);
                                                                if (string == null) break;
                                                            }
                                                            case 4: {
                                                                v.a((int)var12_13, n5, byteBuffer);
                                                                v.r(32885);
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    ++n3;
                                                }
                                                if (string == null) continue;
                                            }
                                            n6 = i2.c();
                                        }
                                        if (string != null) break block28;
                                        if (n6 == 0) break block29;
                                        i2.i();
                                        if (string == null) break block30;
                                    }
                                    n6 = fU.ag();
                                }
                                if (string != null) break block31;
                                if (n6 == 0) break block32;
                                fX.a(i2.t(), 0, i2.a(), i2);
                                if (string == null) break block30;
                            }
                            n6 = i2.t();
                        }
                        v.b(n6, 0, i2.a());
                    }
                    n3 = 0;
                    int n9 = list.size();
                    while (n3 < n9) {
                        block36: {
                            block35: {
                                int n10;
                                d d10;
                                block33: {
                                    block34: {
                                        object = list.get(n3);
                                        d10 = ((g)object).g();
                                        if (string != null) break block21;
                                        n10 = n4;
                                        if (string != null) break block33;
                                        if (n10 == 0) break block34;
                                        cq.b((Object)d10, cq.cS, e10, n3, n5, byteBuffer);
                                        if (string == null) break block35;
                                    }
                                    n10 = ((g)object).f();
                                }
                                n2 = n10;
                                if (string != null) break block36;
                                switch (d10) {
                                    case POSITION: {
                                        v.a(32884);
                                        if (string == null) break;
                                    }
                                    case UV: {
                                        as.f(as.U + n2);
                                        v.a(32888);
                                        as.f(as.U);
                                        if (string == null) break;
                                    }
                                    case COLOR: {
                                        v.a(32886);
                                        v.p();
                                        if (string == null) break;
                                    }
                                    case NORMAL: {
                                        v.a(32885);
                                        break;
                                    }
                                }
                            }
                            ++n3;
                        }
                        if (string == null) continue;
                    }
                }
                i3 = i2;
            }
            i3.k();
        }
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

