/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import net.minecraft.client.Q;
import net.minecraft.k.l;
import net.minecraft.k.m;

public class fu
extends e8 {
    /* synthetic */ float n;
    /* synthetic */ double o;
    private /* synthetic */ int k;
    /* synthetic */ float m;
    private /* synthetic */ int l;

    @Override
    public void b(int n2, int n3, int n4) {
        block5: {
            fu fu2;
            String string;
            block4: {
                string = net.minecraft.k.l.b();
                fu2 = this;
                if (string == null) break block4;
                if (!fu2.a(n2, n3)) break block5;
                fu2 = this;
            }
            boolean bl2 = this.d.l();
            if (string != null) {
                bl2 = !bl2;
            }
            fu2.d.b(bl2);
        }
    }

    public fu(hH hH2, eb eb2, int n2, int n3, int n4, int n5) {
        super(eb2, n2, n3, n4, n5);
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0;
        this.l = 120;
        this.k = 20;
        this.d = hH2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void b(int var1_1, int var2_2) {
        block18: {
            block19: {
                block16: {
                    block17: {
                        block14: {
                            block15: {
                                block12: {
                                    block13: {
                                        var4_3 = this.e();
                                        var5_4 = var4_3.d() + this.a();
                                        var6_5 = var4_3.e() + this.g();
                                        var3_6 = net.minecraft.k.l.b();
                                        v0 = var7_7 = this.a(var1_1, var2_2);
                                        if (var3_6 == null) break block12;
                                        if (v0 == 0) break block13;
                                        v0 = this.l;
                                        if (var3_6 == null) break block14;
                                        if (v0 >= 200) break block15;
                                        this.l += 5;
                                        if (var3_6 != null) break block15;
                                    }
                                    v0 = this.l;
                                }
                                if (var3_6 == null) break block14;
                                if (v0 > 120) {
                                    this.l -= 5;
                                }
                            }
                            v0 = this.d.l() ? 1 : 0;
                        }
                        if (var3_6 == null) break block16;
                        if (v0 == 0) break block17;
                        v0 = this.k++;
                        if (var3_6 == null) break block18;
                        if (v0 >= 30 || var3_6 != null) break block19;
                    }
                    v0 = this.k;
                }
                if (var3_6 == null) break block18;
                if (v0 > 20) {
                    --this.k;
                }
            }
            v0 = this.d.l() ? 1 : 0;
        }
        if (var3_6 != null) {
            v0 = v0 != 0 ? -1 : new Color(this.l, this.l, this.l).getRGB();
        }
        var8_8 = v0;
        this.m = n.a(this.m, var7_7 != 0 ? 2.3f : 2.0f, 0.0f);
        this.n = n.a(this.n, this.d.l() != false ? 10.0f : 17.0f, 0.0f);
        v1 = (float)this.o;
        v2 = this.d.l();
        if (var3_6 != null) {
            v2 = v2 != 0 ? 3 : 10;
        }
        this.o = n.a(v1, v2, 0.0f);
        v3 = (float)((double)var5_4 + this.a - 18.0);
        v4 = var6_5 + 2;
        v5 = (float)((double)var5_4 + this.a - 2.0);
        v6 = (float)((double)var6_5 + this.g - 3.0);
        v7 = new Color(14, 14, 14);
        if (var3_6 == null) ** GOTO lbl61
        dJ.a(v3, v4, v5, v6, v7.getRGB());
        v3 = (float)((double)var5_4 + this.a - (double)this.n);
        v4 = var6_5 + 3;
        v5 = (float)((double)var5_4 + this.a - this.o);
        v6 = var6_5 + this.b() - 4;
        if (this.d.l()) {
            v8 = var4_3.e.b();
        } else {
            v7 = new Color(50, 50, 50);
lbl61:
            // 2 sources

            v8 = v7.getRGB();
        }
        dJ.a(v3, v4, v5, v6, v8);
        Q.P().aK.c(this.d.a(), (float)var5_4 + 4.0f, (float)var6_5 + (float)this.b() / this.m - 3.0f, var8_8);
        if (net.minecraft.k.m.d() != false) return;
        net.minecraft.k.l.b("C0UlMc");
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

