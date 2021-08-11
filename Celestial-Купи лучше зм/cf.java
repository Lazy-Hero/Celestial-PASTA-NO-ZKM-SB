/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.k.l;

public class cf {
    private /* synthetic */ long b;
    private /* synthetic */ l a;

    private static gP a(gP gP2) {
        return gP2;
    }

    public cf() {
        this.a = null;
        this.b = System.currentTimeMillis();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public l a(double var1_1, double var3_2, double var5_3) {
        block6: {
            block7: {
                block5: {
                    var7_4 = K.d();
                    v0 = this.a;
                    if (var7_4 != null) return v0;
                    if (v0 == null) {
                        v0 = this.a = new l(var1_1, var3_2, var5_3);
                        return v0;
                    }
                    var8_5 = System.currentTimeMillis();
                    var10_6 = var8_5 - this.b;
                    cfr_temp_0 = var10_6 - 0L;
                    v1 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                    if (var7_4 != null) break block5;
                    if (v1 == false) {
                        return this.a;
                    }
                    this.b = var8_5;
                    v2 = Math.abs(var1_1 - this.a.e);
                    v3 = 0.004;
                    if (var7_4 != null) break block6;
                    cfr_temp_1 = v2 - v3;
                    v1 = cfr_temp_1 == 0.0 ? 0 : (cfr_temp_1 < 0.0 ? -1 : 1);
                }
                if (v1 >= 0) break block7;
                v2 = Math.abs(var3_2 - this.a.d);
                v3 = 0.004;
                if (var7_4 != null) break block6;
                if (v2 < v3) {
                    v2 = Math.abs(var5_3 - this.a.b);
                    v3 = 0.004;
                    if (var7_4 == null) {
                        if (v2 < v3) {
                            return this.a;
                        } else {
                            ** GOTO lbl33
                        }
                    } else {
                        ** GOTO lbl32
                    }
                }
                break block7;
lbl32:
                // 2 sources

                break block6;
            }
            v2 = var10_6;
            v3 = 0.001;
        }
        var12_7 = v2 * v3;
        var12_7 = fU.a(var12_7, 0.0, 1.0);
        var14_8 = var1_1 - this.a.e;
        var16_9 = var3_2 - this.a.d;
        var18_10 = var5_3 - this.a.b;
        var20_11 = this.a.e + var14_8 * var12_7;
        var22_12 = this.a.d + var16_9 * var12_7;
        var24_13 = this.a.b + var18_10 * var12_7;
        this.a = new l(var20_11, var22_12, var24_13);
        return this.a;
    }
}

