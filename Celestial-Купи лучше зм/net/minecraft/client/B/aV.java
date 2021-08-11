/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.util.glu.Project
 */
package net.minecraft.client.b;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.B.s;
import net.minecraft.ah.f;
import net.minecraft.ah.z;
import net.minecraft.ax.u;
import net.minecraft.client.I.g;
import net.minecraft.client.a.a0;
import net.minecraft.client.a.v;
import net.minecraft.client.b.a5;
import net.minecraft.client.b.l;
import net.minecraft.client.b.q;
import net.minecraft.client.w.y;
import net.minecraft.i.j;
import net.minecraft.k.h;
import net.minecraft.k.m;
import net.minecraft.w.d;
import org.lwjgl.util.glu.Project;

public class aV
extends g {
    public /* synthetic */ float ae;
    private /* synthetic */ d ak;
    public /* synthetic */ float ao;
    private final /* synthetic */ f ag;
    public /* synthetic */ int ab;
    public /* synthetic */ float ad;
    private final /* synthetic */ Random ah;
    private static final /* synthetic */ net.minecraft.ar.v ai;
    private final /* synthetic */ s ac;
    private final /* synthetic */ net.minecraft.i.h an;
    private static final /* synthetic */ y aa;
    public /* synthetic */ float aj;
    public /* synthetic */ float am;
    public /* synthetic */ float af;
    private static final /* synthetic */ net.minecraft.ar.v al;

    @Override
    protected void b(int n2, int n3) {
        this.v.b(this.ag.d().f(), 12.0f, 5.0f, 0x404040);
        this.v.b(this.an.d().f(), 8.0f, this.F - 96 + 2, 0x404040);
    }

    public aV(net.minecraft.i.h h2, z z2, f f10) {
        super(new s(h2, z2));
        this.ah = new Random();
        this.ak = net.minecraft.w.d.m;
        this.an = h2;
        this.ac = (s)this.X;
        this.ag = f10;
    }

    @Override
    protected void a(float f10, int n2, int n3) {
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        String[] arrstring = q.b();
        this.m.aN().b(al);
        int n4 = (h - this.M) / 2;
        int n5 = (w - this.F) / 2;
        String[] arrstring2 = arrstring;
        this.a(n4, n5, 0, 0, this.M, this.F);
        net.minecraft.client.a.v.M();
        net.minecraft.client.a.v.q(5889);
        net.minecraft.client.a.v.M();
        net.minecraft.client.a.v.l();
        l l2 = new l(this.m);
        net.minecraft.client.a.v.d((l2.e() - 320) / 2 * net.minecraft.client.b.l.c(), (l2.a() - 240) / 2 * net.minecraft.client.b.l.c(), 320 * net.minecraft.client.b.l.c(), 240 * net.minecraft.client.b.l.c());
        net.minecraft.client.a.v.b(-0.34f, 0.23f, 0.0f);
        Project.gluPerspective((float)90.0f, (float)1.3333334f, (float)9.0f, (float)80.0f);
        float f11 = 1.0f;
        net.minecraft.client.a.v.q(5888);
        net.minecraft.client.a.v.l();
        a0.c();
        net.minecraft.client.a.v.b(0.0f, 3.3f, -16.0f);
        net.minecraft.client.a.v.d(1.0f, 1.0f, 1.0f);
        float f12 = 5.0f;
        net.minecraft.client.a.v.d(5.0f, 5.0f, 5.0f);
        net.minecraft.client.a.v.a(180.0f, 0.0f, 0.0f, 1.0f);
        this.m.aN().b(ai);
        net.minecraft.client.a.v.a(20.0f, 1.0f, 0.0f, 0.0f);
        float f13 = this.am + (this.ao - this.am) * f10;
        net.minecraft.client.a.v.b((1.0f - f13) * 0.2f, (1.0f - f13) * 0.1f, (1.0f - f13) * 0.25f);
        net.minecraft.client.a.v.a(-(1.0f - f13) * 90.0f - 90.0f, 0.0f, 1.0f, 0.0f);
        net.minecraft.client.a.v.a(180.0f, 1.0f, 0.0f, 0.0f);
        float f14 = this.ad + (this.aj - this.ad) * f10 + 0.25f;
        float f15 = this.ad + (this.aj - this.ad) * f10 + 0.75f;
        f14 = (f14 - (float)net.minecraft.k.h.c((double)f14)) * 1.6f - 0.3f;
        f15 = (f15 - (float)net.minecraft.k.h.c((double)f15)) * 1.6f - 0.3f;
        float f16 = f14 - 0.0f;
        float f17 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
        if (arrstring2 != null) {
            float f18;
            if (f17 < 0) {
                f14 = 0.0f;
            }
            f17 = (f18 = f15 - 0.0f) == 0.0f ? 0 : (f18 < 0.0f ? -1 : 1);
        }
        if (arrstring2 != null) {
            float f19;
            if (f17 < 0) {
                f15 = 0.0f;
            }
            f17 = (f19 = f14 - 1.0f) == 0.0f ? 0 : (f19 > 0.0f ? 1 : -1);
        }
        if (arrstring2 != null) {
            float f20;
            if (f17 > 0) {
                f14 = 1.0f;
            }
            f17 = (f20 = f15 - 1.0f) == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
        }
        if (arrstring2 != null) {
            if (f17 > 0) {
                f15 = 1.0f;
            }
            net.minecraft.client.a.v.q();
            aa.b(null, 0.0f, f14, f15, f13, 0.0f, 0.0625f);
            net.minecraft.client.a.v.u();
            a0.a();
            net.minecraft.client.a.v.q(5889);
            net.minecraft.client.a.v.d(0, 0, this.m.P, this.m.aT);
            net.minecraft.client.a.v.B();
            net.minecraft.client.a.v.q(5888);
            net.minecraft.client.a.v.B();
            a0.a();
            net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.ar.a0.a().a(this.ac.n);
            f17 = this.ac.a();
        }
        float f21 = f17;
        for (int i2 = 0; i2 < 3; ++i2) {
            int n6;
            a5 a52;
            String string;
            int n7;
            block22: {
                String string2;
                int n8;
                int n9;
                block28: {
                    block24: {
                        float f22;
                        block27: {
                            int n10;
                            block26: {
                                int n11;
                                block25: {
                                    float f23;
                                    block23: {
                                        float f24;
                                        block21: {
                                            int n12;
                                            int n13;
                                            block19: {
                                                block20: {
                                                    block17: {
                                                        block18: {
                                                            int n14;
                                                            block16: {
                                                                block15: {
                                                                    n9 = n4 + 60;
                                                                    n7 = n9 + 20;
                                                                    c = 0.0f;
                                                                    this.m.aN().b(al);
                                                                    n14 = this.ac.p[i2];
                                                                    net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
                                                                    if (arrstring2 == null) break block15;
                                                                    if (n14 != 0) break block16;
                                                                    this.a(n9, n5 + 14 + 19 * i2, 0, 185, 108, 19);
                                                                }
                                                                if (arrstring2 != null) continue;
                                                                net.minecraft.k.m.b(!net.minecraft.k.m.c());
                                                            }
                                                            string = "" + n14;
                                                            n8 = 86 - this.v.e(string);
                                                            string2 = net.minecraft.ar.a0.a().a(this.v, n8);
                                                            a52 = this.m.ah;
                                                            n6 = 6839882;
                                                            f24 = f21;
                                                            if (arrstring2 == null) break block17;
                                                            if (f24 < i2 + 1) break block18;
                                                            n13 = this.m.s.b4;
                                                            n12 = n14;
                                                            if (arrstring2 == null) break block19;
                                                            if (n13 >= n12) break block20;
                                                        }
                                                        f24 = (float)this.m.s.cw.g;
                                                    }
                                                    if (arrstring2 == null) break block21;
                                                    if (f24 != false) break block20;
                                                    this.a(n9, n5 + 14 + 19 * i2, 0, 185, 108, 19);
                                                    this.a(n9 + 1, n5 + 15 + 19 * i2, 16 * i2, 239, 16, 16);
                                                    a52.a(string2, n7, n5 + 16 + 19 * i2, n8, (n6 & 0xFEFEFE) >> 1);
                                                    n6 = 4226832;
                                                    if (arrstring2 != null) break block22;
                                                }
                                                n13 = n2;
                                                n12 = n4 + 60;
                                            }
                                            f24 = n13 - n12;
                                        }
                                        f23 = f24;
                                        n11 = n3 - (n5 + 14 + 19 * i2);
                                        f22 = f23;
                                        if (arrstring2 == null) break block23;
                                        if (f22 < 0) break block24;
                                        f22 = n11;
                                    }
                                    if (arrstring2 == null) break block25;
                                    if (f22 < 0) break block24;
                                    f22 = f23;
                                }
                                n10 = 108;
                                if (arrstring2 == null) break block26;
                                if (f22 >= n10) break block24;
                                f22 = n11;
                                if (arrstring2 == null) break block27;
                                n10 = 19;
                            }
                            if (f22 >= n10) break block24;
                            this.a(n9, n5 + 14 + 19 * i2, 0, 204, 108, 19);
                            f22 = 0xFFFF80;
                        }
                        n6 = (int)f22;
                        if (arrstring2 != null) break block28;
                    }
                    this.a(n9, n5 + 14 + 19 * i2, 0, 166, 108, 19);
                }
                this.a(n9 + 1, n5 + 15 + 19 * i2, 16 * i2, 223, 16, 16);
                a52.a(string2, n7, n5 + 16 + 19 * i2, n8, n6);
                n6 = 8453920;
            }
            a52 = this.m.a6;
            a52.c(string, n7 + 86 - a52.e(string), n5 + 16 + 19 * i2 + 7, n6);
            if (arrstring2 != null) continue;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * WARNING - void declaration
     */
    public void a() {
        block12: {
            block11: {
                int n2;
                String[] arrstring;
                block10: {
                    void var3_4;
                    d d10 = this.X.a(0).d();
                    arrstring = q.b();
                    boolean bl2 = net.minecraft.w.d.a(d10, this.ak);
                    if (arrstring != null) {
                        if (!bl2) {
                            this.ak = d10;
                            do {
                                this.ae += (float)(this.ah.nextInt(4) - this.ah.nextInt(4));
                            } while (!(this.aj > this.ae + 1.0f) && !(this.aj < this.ae - 1.0f));
                        }
                        ++this.ab;
                        this.ad = this.aj;
                        this.am = this.ao;
                        bl2 = false;
                    }
                    boolean n4 = bl2;
                    for (int f10 = 0; f10 < 3; ++f10) {
                        n2 = this.ac.p[f10];
                        if (arrstring != null) {
                            boolean bl3;
                            if (arrstring != null) {
                                if (n2 == 0) continue;
                                bl3 = true;
                            }
                            var3_4 = bl3;
                            if (arrstring != null) continue;
                        }
                        break block10;
                    }
                    n2 = var3_4;
                }
                if (n2 == false) break block11;
                this.ao += 0.2f;
                if (arrstring != null) break block12;
            }
            this.ao -= 0.2f;
        }
        this.ao = net.minecraft.k.h.c(this.ao, 0.0f, 1.0f);
        float f10 = (this.ae - this.aj) * 0.4f;
        float f11 = 0.2f;
        f10 = net.minecraft.k.h.c(f10, -0.2f, 0.2f);
        this.af += (f10 - this.af) * 0.9f;
        this.aj += this.af;
    }

    @Override
    public void a(int n2, int n3, float f10) {
        f10 = this.m.aC();
        this.n();
        super.a(n2, n3, f10);
        this.c(n2, n3);
        boolean bl2 = this.m.s.cw.g;
        int n4 = this.ac.a();
        String[] arrstring = q.b();
        int n5 = 0;
        while (n5 < 3) {
            block5: {
                block6: {
                    block8: {
                        ArrayList arrayList;
                        block9: {
                            String string;
                            block16: {
                                int n6;
                                block15: {
                                    block14: {
                                        block13: {
                                            block12: {
                                                int n7;
                                                int n8;
                                                block10: {
                                                    block11: {
                                                        int n9;
                                                        int n10;
                                                        u u2;
                                                        int n11;
                                                        block7: {
                                                            n11 = this.ac.p[n5];
                                                            u2 = u.c(this.ac.q[n5]);
                                                            n10 = this.ac.k[n5];
                                                            n6 = n5 + 1;
                                                            if (arrstring == null) break block5;
                                                            if (!this.a(60, 14 + 19 * n5, 108, 17, n2, n3)) break block6;
                                                            n9 = n11;
                                                            if (arrstring == null) break block7;
                                                            if (n9 <= 0) break block6;
                                                            n9 = n10;
                                                        }
                                                        if (n9 < 0 || u2 == null) break block6;
                                                        arrayList = Lists.newArrayList();
                                                        arrayList.add("" + (Object)((Object)net.minecraft.at.l.WHITE) + (Object)((Object)net.minecraft.at.l.ITALIC) + net.minecraft.client.D.h.a("container.enchant.clue", u2.d(n10)));
                                                        if (arrstring == null) break block8;
                                                        if (bl2) break block9;
                                                        arrayList.add("");
                                                        n8 = this.m.s.b4;
                                                        n7 = n11;
                                                        if (arrstring == null) break block10;
                                                        if (n8 >= n7) break block11;
                                                        arrayList.add((Object)((Object)net.minecraft.at.l.RED) + net.minecraft.client.D.h.a("container.enchant.level.requirement", this.ac.p[n5]));
                                                        if (arrstring != null) break block9;
                                                    }
                                                    n8 = n6;
                                                    n7 = 1;
                                                }
                                                if (n8 != n7) break block12;
                                                string = net.minecraft.client.D.h.a("container.enchant.lapis.one", new Object[0]);
                                                if (arrstring != null) break block13;
                                            }
                                            string = net.minecraft.client.D.h.a("container.enchant.lapis.many", n6);
                                        }
                                        net.minecraft.at.l l2 = n4 >= n6 ? net.minecraft.at.l.GRAY : net.minecraft.at.l.RED;
                                        arrayList.add((Object)((Object)l2) + "" + string);
                                        if (arrstring == null) break block14;
                                        if (n6 != 1) break block15;
                                        string = net.minecraft.client.D.h.a("container.enchant.level.one", new Object[0]);
                                    }
                                    if (arrstring != null) break block16;
                                }
                                string = net.minecraft.client.D.h.a("container.enchant.level.many", n6);
                            }
                            arrayList.add((Object)((Object)net.minecraft.at.l.GRAY) + "" + string);
                        }
                        this.a(arrayList, n2, n3);
                    }
                    if (arrstring != null) break;
                }
                ++n5;
            }
            if (arrstring != null) continue;
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) throws IOException {
        String[] arrstring = q.b();
        super.a(n2, n3, n4);
        int n5 = (h - this.M) / 2;
        int n6 = (w - this.F) / 2;
        String[] arrstring2 = arrstring;
        int n7 = 0;
        while (n7 < 3) {
            block3: {
                block4: {
                    aV aV2;
                    block8: {
                        int n8;
                        block7: {
                            int n9;
                            block6: {
                                int n10;
                                block5: {
                                    int n11 = n2 - (n5 + 60);
                                    n10 = n3 - (n6 + 14 + 19 * n7);
                                    if (arrstring2 == null) break block3;
                                    if (n11 < 0) break block4;
                                    n8 = n10;
                                    if (arrstring2 == null) break block5;
                                    if (n8 < 0) break block4;
                                    n8 = n11;
                                }
                                n9 = 108;
                                if (arrstring2 == null) break block6;
                                if (n8 >= n9) break block4;
                                n8 = n10;
                                if (arrstring2 == null) break block7;
                                n9 = 19;
                            }
                            if (n8 >= n9) break block4;
                            aV2 = this;
                            if (arrstring2 == null) break block8;
                            n8 = aV2.ac.a((j)this.m.s, n7) ? 1 : 0;
                        }
                        if (n8 == 0) break block4;
                        aV2 = this;
                    }
                    aV2.m.aW.a(this.ac.b, n7);
                }
                ++n7;
            }
            if (arrstring2 != null) continue;
        }
    }

    @Override
    public void e() {
        super.e();
        this.a();
    }

    static {
        al = new net.minecraft.ar.v("textures/gui/container/enchanting_table.png");
        ai = new net.minecraft.ar.v("textures/entity/enchanting_table_book.png");
        aa = new y();
    }
}

