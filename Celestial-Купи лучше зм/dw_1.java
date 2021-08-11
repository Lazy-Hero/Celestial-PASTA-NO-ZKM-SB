/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;
import java.util.Iterator;
import net.minecraft.U.x;
import net.minecraft.client.E.l;
import net.minecraft.client.a.aC;
import net.minecraft.client.k.s;
import net.minecraft.k.h;
import net.minecraft.k.n;

public class dw {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static Iterator<s> a(l var0, double var1_1, x var3_2, int var4_3, aC var5_4) {
        block3: {
            block5: {
                block4: {
                    block2: {
                        var7_5 = cS.F();
                        var6_6 = dB.i();
                        cfr_temp_0 = var7_5 - 0.0f;
                        v0 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 > 0.0f ? 1 : -1);
                        if (var6_6 == null) break block2;
                        if (v0 <= 0) break block3;
                        cfr_temp_1 = var7_5 - (float)((var4_3 - 1) * 16);
                        v0 = cfr_temp_1 == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1);
                    }
                    if (var6_6 == null) break block4;
                    if (v0 >= 0) break block3;
                    v0 = h.f(var7_5 / 16.0f) + 1;
                }
                var8_7 = v0;
                var9_9 = var0.e((float)var1_1);
                var10_11 = cS.bm * 0.017453292f;
                cfr_temp_2 = var9_9 - 1.5707964f;
                v1 = cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1);
                if (var6_6 == null) break block5;
                if (v1 <= 0) ** GOTO lbl-1000
                v2 = var9_9;
                v3 = 4.712389f;
                if (var6_6 == null) ** GOTO lbl30
                cfr_temp_3 = v2 - v3;
                v1 = cfr_temp_3 == 0.0f ? 0 : (cfr_temp_3 < 0.0f ? -1 : 1);
            }
            if (v1 < 0) {
                v2 = var9_9;
                v3 = 3.1415927f;
lbl30:
                // 2 sources

                v4 = v2 + v3;
            } else lbl-1000:
            // 2 sources

            {
                v4 = var9_9;
            }
            var11_12 = v4;
            var12_13 = -h.g(var11_12);
            var13_14 = h.c(var11_12) * h.c(var10_11);
            var14_15 = -h.c(var11_12) * h.g(var10_11);
            var15_16 = new n(h.f(var3_2.a) >> 4, h.f(var3_2.aF) >> 4, h.f(var3_2.ax) >> 4);
            var16_17 = var15_16.a(-var12_13 * (float)var8_7, -var13_14 * (float)var8_7, -var14_15 * (float)var8_7);
            var17_18 = var15_16.a(var12_13 * (float)var4_3, var13_14 * (float)var4_3, var14_15 * (float)var4_3);
            return new dP(var5_4, var16_17, var17_18, (int)var8_7, (int)var8_7);
        }
        var8_8 = Arrays.asList(var5_4.e);
        return var8_8.iterator();
    }

    private static gP a(gP gP2) {
        return gP2;
    }
}

