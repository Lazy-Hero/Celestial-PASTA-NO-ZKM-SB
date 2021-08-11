/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.W.K;
import net.minecraft.client.Q;
import net.minecraft.k.i;
import net.minecraft.k.k;
import net.minecraft.k.n;
import net.minecraft.w.d;

public class bY
extends bE {
    public bY() {
        super("AutoTool", a5.Player);
    }

    @cL
    public void a(fR fR2) {
        block9: {
            String string = k.b();
            Q q2 = c;
            if (string != null) {
                if (!q2.ac.bb.d) {
                    return;
                }
                q2 = c;
            }
            i i2 = q2.ao;
            if (string != null) {
                if (i2 == null) {
                    return;
                }
                i2 = bY.c.ao;
            }
            n n2 = i2.a();
            K k2 = bY.c.e.d(n2).b();
            float f10 = 1.0f;
            int n3 = -1;
            int n4 = 0;
            while (n4 < 9) {
                block10: {
                    byte by2;
                    block12: {
                        block11: {
                            d d10 = bY.c.s.cB.c.get(n4);
                            d d11 = bY.c.s.cB.k();
                            if (string == null) break block9;
                            if (string == null) break block10;
                            if (d10 == null) break block11;
                            float f11 = d10.b(k2.d()) - f10;
                            by2 = (byte)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
                            if (string == null) break block12;
                            if (by2 <= 0) break block11;
                            float f12 = d11.b(k2.d()) - f10;
                            by2 = (byte)(f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1));
                            if (string == null) break block12;
                            if (by2 <= 0) {
                                f10 = d10.b(k2.d());
                                n3 = n4;
                            }
                        }
                        by2 = (byte)(n4 + 1);
                    }
                    n4 = by2;
                }
                if (string != null) continue;
            }
            if (n3 == -1) break block9;
            bY.c.s.cB.a = n3;
        }
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

