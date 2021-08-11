/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import java.awt.Color;
import net.minecraft.client.Q;
import net.minecraft.client.a.v;
import net.minecraft.client.b.s;
import net.minecraft.client.e.C;
import net.minecraft.client.e.y;
import net.minecraft.u.E;
import org.lwjgl.input.Mouse;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class dF
extends s {
    private /* synthetic */ int s;

    @Override
    public void b(int n2, int n3) {
    }

    public dF(int n2, int n3, int n4, int n5, int n6, String string) {
        super(n2, n3, n4, n5, n6, string);
        this.s = 20;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(Q q2, int n2, int n3) {
        String[] arrstring = eI.b();
        int n4 = this.h;
        if (arrstring == null) {
            if (n4 == 0) return 0 != 0;
            n4 = this.l;
        }
        if (arrstring == null) {
            if (n4 == 0) return 0 != 0;
            n4 = n2;
        }
        int n5 = this.o;
        if (arrstring == null) {
            if (n4 < n5) return 0 != 0;
            int n5 = n3;
            n5 = this.r;
        }
        if (arrstring == null) {
            if (n4 < n5) return 0 != 0;
            int n5 = n2;
            n5 = this.o + this.i;
        }
        if (arrstring == null) {
            if (n4 >= n5) return 0 != 0;
            n4 = n3;
            if (arrstring != null) return n4 != 0;
            n5 = this.r + this.n + 10;
        }
        if (n4 >= n5) return 0 != 0;
        return 1 != 0;
    }

    @Override
    public void a(C c10) {
        c10.c(y.a(E.bN, 1.0f));
    }

    @Override
    protected void b(Q q2, int n2, int n3) {
    }

    public static int d() {
        return k.a() - Mouse.getY() * k.a() / Q.P().aT - 1;
    }

    @Override
    public void a(int n2) {
        this.i = n2;
    }

    public dF(int n2, int n3, int n4, String string) {
        this(n2, n3, n4, 200, 35, string);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(Q var1_1, int var2_2, int var3_3, float var4_4) {
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
                                                    var5_5 = eI.b();
                                                    v0 = this;
                                                    if (var5_5 == null) {
                                                        if (v0.l == false) return;
                                                        v0 = this;
                                                    }
                                                    v1 = var2_2;
                                                    v2 = this.o;
                                                    if (var5_5 != null) break block14;
                                                    if (v1 < v2) ** GOTO lbl-1000
                                                    v1 = var3_3;
                                                    v2 = this.r;
                                                }
                                                if (var5_5 != null) break block15;
                                                if (v1 < v2) ** GOTO lbl-1000
                                                v1 = var2_2;
                                                v2 = this.o + this.i;
                                            }
                                            if (var5_5 != null) break block16;
                                            if (v1 >= v2) ** GOTO lbl-1000
                                            v1 = var3_3;
                                            if (var5_5 != null) break block17;
                                            v2 = this.r + this.n + 10;
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
                                    var6_6 = new Color(255, 255, 255, 255);
                                    var7_7 = new Color(this.s + 14, this.s + 14, this.s + 14, 165).darker().darker();
                                    v3 = this.h;
                                    if (var5_5 != null) break block18;
                                    if (v3 == 0) break block19;
                                    v3 = this.a;
                                }
                                if (var5_5 != null) break block20;
                                if (v3 == 0) break block21;
                                v4 = this;
                                if (var5_5 != null) break block22;
                                if (v4.s >= 100) break block23;
                                v4 = this;
                            }
                            v4.s += 8;
                        }
                        var6_6 = Color.white;
                        if (var5_5 == null) break block19;
                    }
                    v3 = this.s;
                }
                v5 = 20;
                if (var5_5 != null) break block24;
                if (v3 > v5) {
                    this.s -= 8;
                }
            }
            v.a();
            v.e(770, 771, 1, 0);
            v.f(770, 771);
            v3 = this.n;
            v5 = 11;
        }
        var8_8 = v3 + v5;
        dJ.b(this.o, this.r, this.i + this.o, var8_8 + this.r, var7_7.getRGB());
        var1_1.aY.d(this.m, (float)this.o + (float)this.i / 2.0f, this.r + (this.n - 12), var6_6.getRGB());
        this.b(var1_1, var2_2, var3_3);
    }

    @Override
    public boolean c() {
        return this.a;
    }

    public static int c() {
        return Mouse.getX() * k.e() / Q.P().P;
    }

    @Override
    public void a(int n2, int n3) {
    }

    @Override
    public int a() {
        return this.i;
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

