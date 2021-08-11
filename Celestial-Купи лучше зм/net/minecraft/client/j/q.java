/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.j;

import net.minecraft.c.k;
import net.minecraft.client.j.c;
import net.minecraft.client.j.u;

class q
implements k<String> {
    final /* synthetic */ c b;
    final /* synthetic */ int[][] a;

    private static Exception a(Exception exception) {
        return exception;
    }

    q(c c10, int[][] arrn) {
        this.b = c10;
        this.a = arrn;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String a() throws Exception {
        var2_1 = new StringBuilder();
        var3_2 = this.a;
        var1_3 = u.c();
        for (int[] var6_6 : var3_2) {
            v0 = var2_1;
            if (var1_3 != false) return v0.toString();
            if (!var1_3) {
                if (v0.length() > 0) {
                    var2_1.append(", ");
                }
                v1 = var2_1;
            }
            v2 = var6_6;
            if (var1_3) ** GOTO lbl18
            if (v2 == null) {
                v3 = "null";
            } else {
                v2 = var6_6;
lbl18:
                // 2 sources

                v3 = v2.length;
            }
            v1.append(v3);
            if (!var1_3) continue;
        }
        v0 = var2_1;
        return v0.toString();
    }
}

