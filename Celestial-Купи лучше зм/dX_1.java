/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import net.minecraft.client.Q;
import net.minecraft.client.b.s;

public class dX
extends s {
    private /* synthetic */ int s;

    public dX(int n2, int n3, int n4, int n5, int n6, String string) {
        super(n2, n3, n4, n5, n6, string);
        this.s = 20;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void c(int var1_1, int var2_2) {
        block24: {
            block19: {
                block20: {
                    block21: {
                        block23: {
                            block22: {
                                block18: {
                                    block17: {
                                        block16: {
                                            block15: {
                                                block14: {
                                                    var3_3 = eI.b();
                                                    v0 = this;
                                                    if (var3_3 == null) {
                                                        if (v0.l == false) return;
                                                        v0 = this;
                                                    }
                                                    v1 = var1_1;
                                                    v2 = this.o;
                                                    if (var3_3 != null) break block14;
                                                    if (v1 < v2) ** GOTO lbl-1000
                                                    v1 = var2_2;
                                                    v2 = this.r;
                                                }
                                                if (var3_3 != null) break block15;
                                                if (v1 < v2) ** GOTO lbl-1000
                                                v1 = var1_1;
                                                v2 = this.o + this.i;
                                            }
                                            if (var3_3 != null) break block16;
                                            if (v1 >= v2) ** GOTO lbl-1000
                                            v1 = var2_2;
                                            if (var3_3 != null) break block17;
                                            v2 = this.r + this.n;
                                        }
                                        ** if (v1 >= v2) goto lbl-1000
lbl-1000:
                                        // 1 sources

                                        {
                                            v1 = 1;
                                            ** GOTO lbl29
                                        }
lbl-1000:
                                        // 4 sources

                                        {
                                            v1 = 0;
                                        }
                                    }
                                    v0.a = v1;
                                    var4_4 = new Color(215, 215, 215, 255);
                                    var5_5 = new Color(this.s - 15, 0, this.s - 15, 150);
                                    v3 = this.h;
                                    if (var3_3 != null) break block18;
                                    if (v3 == 0) break block19;
                                    v3 = this.a;
                                }
                                if (var3_3 != null) break block20;
                                if (v3 == 0) break block21;
                                v4 = this;
                                if (var3_3 != null) break block22;
                                if (v4.s >= 100) break block23;
                                v4 = this;
                            }
                            v4.s += 8;
                        }
                        var4_4 = new Color(255, 255, 255, 255);
                        if (var3_3 == null) break block19;
                    }
                    v3 = this.s;
                }
                if (var3_3 != null) break block24;
                if (v3 > 20) {
                    this.s -= 8;
                }
            }
            v3 = this.o;
        }
        dJ.a((double)v3, (double)this.r, (double)this.i, (double)this.n, var5_5, new Color(30, 30, 30, 255));
        Q.P().ax.b(this.m, (float)this.o + (float)this.i / 2.0f, (float)this.r + (float)(this.n - 8) / 2.0f, var4_4.getRGB());
    }

    public dX(int n2, int n3, int n4, String string) {
        this(n2, n3, n4, 200, 20, string);
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

