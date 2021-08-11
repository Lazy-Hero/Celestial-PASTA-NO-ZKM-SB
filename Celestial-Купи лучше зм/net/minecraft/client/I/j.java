/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.I;

import java.awt.Color;
import java.io.IOException;
import net.minecraft.B.a;
import net.minecraft.B.h;
import net.minecraft.B.q;
import net.minecraft.client.I.g;
import net.minecraft.client.I.v;
import net.minecraft.client.Q;
import net.minecraft.client.b.l;
import net.minecraft.client.b.s;

public class j
extends g {
    public final /* synthetic */ a ab;
    private /* synthetic */ float ad;
    private final /* synthetic */ int ac;
    private final /* synthetic */ a aa;
    private static final /* synthetic */ net.minecraft.ar.v ae;

    @Override
    protected void b(int n2, int n3) {
        this.a(this.m.a6, this.ab.d().f(), 8, 6, -1);
        this.a(this.m.a6, this.aa.d().f(), 8, this.F - 96 + 2, -1);
    }

    public int b() {
        return this.ac;
    }

    static {
        ae = new net.minecraft.ar.v("textures/gui/container/generic_54.png");
    }

    @Override
    public void r() {
        int n2 = (w - this.F) / 2 + 5;
        this.t.add(new s(1, h / 2 - 5, n2, 40, 10, "Steal"));
        this.t.add(new s(2, h / 2 + 40, n2, 40, 10, "Store"));
        super.r();
    }

    public j(a a10, a a11) {
        super(new q(a10, a11, Q.P().s));
        this.aa = a10;
        this.ab = a11;
        this.l = false;
        int n2 = 222;
        int n3 = 114;
        this.ac = a11.e() / 9;
        this.F = 114 + this.ac * 18;
    }

    @Override
    protected void a(s s2) throws IOException {
        block3: {
            int n2;
            int n3;
            block1: {
                block2: {
                    int[] arrn = net.minecraft.client.I.v.a();
                    super.a(s2);
                    int[] arrn2 = arrn;
                    n3 = s2.g;
                    n2 = 1;
                    if (arrn2 != null) break block1;
                    if (n3 != n2) break block2;
                    new Thread(this::lambda$actionPerformed$0).start();
                    if (arrn2 == null) break block3;
                }
                n3 = s2.g;
                n2 = 2;
            }
            if (n3 == n2) {
                new Thread(this::lambda$actionPerformed$1).start();
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public a a() {
        return this.ab;
    }

    @Override
    protected void a(float f10, int n2, int n3) {
        net.minecraft.client.a.v.b(1.0f, 1.0f, 1.0f, 1.0f);
        this.m.aN().b(ae);
        int n4 = (h - this.M) / 2;
        int n5 = (w - this.F) / 2;
        this.a(n4, n5, 0, 0, this.M, this.ac * 18 + 17);
        this.a(n4, n5 + this.ac * 18 + 17, 0, 126, this.M, 96);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void lambda$actionPerformed$1() {
        var1_1 = net.minecraft.client.I.v.a();
        try {
            var2_2 = this.ac * 9;
            while (true) {
                if (var2_2 >= this.ac * 9 + 44) return;
                var3_4 = this.X.f.get(var2_2);
                if (var1_1 != null) return;
                if (var1_1 != null) continue;
                break;
            }
        }
        catch (Exception var2_3) {
            // empty catch block
            return;
        }
        {
            if (var3_4.d() == null) ** GOTO lbl-1000
        }
        {
            Thread.sleep(5L);
            this.a(var3_4, var3_4.d, 0, net.minecraft.B.h.QUICK_MOVE);
        }
lbl-1000:
        // 2 sources

        {
            ++var2_2;
            if (var1_1 == null) ** continue;
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void lambda$actionPerformed$0() {
        var1_1 = net.minecraft.client.I.v.a();
        try {
            var2_2 = 0;
            while (true) {
                if (var2_2 >= this.ac * 9) return;
                var3_4 = (q)this.m.s.cm;
                if (var1_1 != null) return;
                if (var1_1 != null) continue;
                break;
            }
        }
        catch (Exception var2_3) {
            // empty catch block
            return;
        }
        {
            if (var3_4 == null) ** GOTO lbl-1000
        }
        {
            Thread.sleep(50L);
            this.m.aW.a(var3_4.b, var2_2, 0, net.minecraft.B.h.QUICK_MOVE, this.m.s);
        }
lbl-1000:
        // 2 sources

        {
            ++var2_2;
            if (var1_1 == null) ** continue;
            return;
        }
    }

    @Override
    public void a(int n2, int n3, float f10) {
        block12: {
            j j2;
            block4: {
                block5: {
                    l l2;
                    int[] arrn;
                    block8: {
                        float f11;
                        block11: {
                            j j3;
                            float f12;
                            block9: {
                                block10: {
                                    block6: {
                                        float f13;
                                        int n4;
                                        block7: {
                                            arrn = net.minecraft.client.I.v.a();
                                            j2 = this;
                                            if (arrn != null) break block4;
                                            if (j2.m.s == null) break block5;
                                            j2 = this;
                                            if (arrn != null) break block4;
                                            if (j2.m.e == null) break block5;
                                            l2 = new l(Q.P());
                                            f11 = 160.0f;
                                            n4 = (int)(f11 / 100.0f);
                                            float f14 = this.ad - (f11 - (float)n4);
                                            f12 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                            if (arrn != null) break block6;
                                            if (f12 >= 0) break block7;
                                            this.ad += (float)n4;
                                            if (arrn == null) break block8;
                                        }
                                        f12 = (f13 = this.ad - (f11 - (float)n4)) == 0.0f ? 0 : (f13 > 0.0f ? 1 : -1);
                                    }
                                    if (arrn != null) break block9;
                                    if (f12 <= 0) break block10;
                                    float f15 = this.ad - f11;
                                    f12 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                    if (arrn != null) break block9;
                                    if (f12 == false) break block10;
                                    this.ad = (int)f11;
                                    if (arrn == null) break block8;
                                }
                                j3 = this;
                                if (arrn != null) break block11;
                                float f16 = j3.ad - f11;
                                f12 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                            }
                            if (f12 == false) break block8;
                            j3 = this;
                        }
                        j3.ad = (int)f11;
                    }
                    Color color = new Color(cj.h().getRed(), cj.h().getGreen(), cj.h().getBlue(), (int)this.ad);
                    Color color2 = new Color(0, 0, 0, 0);
                    this.a(0, 0, (double)l2.e(), (double)l2.a(), color.getRGB(), color2.getRGB());
                    if (arrn == null) break block12;
                }
                j2 = this;
            }
            j2.n();
        }
        super.a(n2, n3, f10);
        this.c(n2, n3);
    }
}

