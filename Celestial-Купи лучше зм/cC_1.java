/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import net.minecraft.ag.C;
import net.minecraft.client.Q;
import net.minecraft.client.b.l;
import net.minecraft.client.b.q;

public class cC
extends bE {
    private /* synthetic */ float n;
    private final /* synthetic */ hH l;
    private final /* synthetic */ hH m;
    private final /* synthetic */ hH k;

    @cL
    public void a(fn fn2) {
        block10: {
            float f10;
            l l2;
            block13: {
                block16: {
                    cC cC2;
                    float f11;
                    block14: {
                        String[] arrstring;
                        block15: {
                            block11: {
                                float f12;
                                int n2;
                                block12: {
                                    int n3;
                                    block9: {
                                        block8: {
                                            Q q2;
                                            block7: {
                                                arrstring = C.f();
                                                q2 = c;
                                                if (arrstring != null) break block7;
                                                if (q2.s != null) break block8;
                                                q2 = c;
                                            }
                                            if (q2.e == null) {
                                                return;
                                            }
                                        }
                                        n3 = this.m.l();
                                        if (arrstring != null) break block9;
                                        if (n3 == 0) break block10;
                                        n3 = cC.c.s.bc;
                                    }
                                    if (n3 <= 0) break block10;
                                    l2 = new l(Q.P());
                                    f10 = this.l.r();
                                    n2 = (int)(f10 / 100.0f);
                                    float f13 = this.n - (f10 - (float)n2);
                                    f11 = f13 == 0.0f ? 0 : (f13 < 0.0f ? -1 : 1);
                                    if (arrstring != null) break block11;
                                    if (f11 >= 0) break block12;
                                    this.n += (float)n2;
                                    if (arrstring == null) break block13;
                                }
                                f11 = (f12 = this.n - (f10 - (float)n2)) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                            }
                            if (arrstring != null) break block14;
                            if (f11 <= 0) break block15;
                            float f14 = this.n - f10;
                            f11 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                            if (arrstring != null) break block14;
                            if (f11 == false) break block15;
                            this.n = (int)f10;
                            if (arrstring == null) break block13;
                        }
                        cC2 = this;
                        if (arrstring != null) break block16;
                        float f15 = cC2.n - f10;
                        f11 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                    }
                    if (f11 == false) break block13;
                    cC2 = this;
                }
                cC2.n = (int)f10;
            }
            Color color = new Color(this.k.o());
            Color color2 = new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)f10);
            Color color3 = new Color(0, 0, 0, 0);
            q q3 = new q();
            q3.a(0, 0, (double)l2.e(), (double)(l2.a() - 505), color2.getRGB(), color3.getRGB());
            q3.a(0, 0, (double)l2.e(), (double)(l2.a() + 255), color3.getRGB(), color2.getRGB());
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public cC() {
        super("HurtCam", a5.Visuals);
        this.m = new hH("Gradient Hurt", this, true);
        cj.b.f.b(this.m);
        this.l = new hH("Gradient Alpha", this, 70.0, 10.0, 255.0, 10.0);
        cj.b.f.b(this.l);
        this.k = new hH("Gradient Color", (bE)this, new Color(0xFFFFFF).getRGB(), true);
        cj.b.f.b(this.k);
    }
}

