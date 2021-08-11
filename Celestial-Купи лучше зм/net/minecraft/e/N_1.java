/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.d;
import net.minecraft.E.s;
import net.minecraft.P.a;
import net.minecraft.R.b;
import net.minecraft.at.h;
import net.minecraft.k.m;
import net.minecraft.k.n;
import net.minecraft.w.k;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class N
extends K {
    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public int a() {
        return 2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        String[] arrstring2;
        block6: {
            int n3;
            int n4;
            block5: {
                m[] arrm = s.b();
                n4 = arrstring.length;
                n3 = 1;
                if (arrm == null) break block5;
                if (n4 == n3) {
                    return N.a(arrstring, b10.at());
                }
                arrstring2 = arrstring;
                if (arrm == null) break block6;
                n4 = arrstring2.length;
                n3 = 2;
            }
            if (n4 != n3) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = N.a(arrstring2, k.q.a());
        return list;
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        m[] arrm = s.b();
        boolean bl2 = n2;
        if (arrm != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public String a() {
        return "clear";
    }

    @Override
    public String a(J j2) {
        return "commands.clear.usage";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a(b var1_1, J var2_2, String[] var3_3) throws s {
        block14: {
            var4_4 = s.b();
            var5_5 = var3_3.length == 0 ? N.a(var2_2) : N.d(var1_1, var2_2, var3_3[0]);
            var6_6 = var3_3.length >= 2 ? N.a(var2_2, var3_3[1]) : null;
            v0 = var3_3.length;
            if (var4_4 != null) {
                v0 = v0 >= 3 ? N.a(var3_3[2], -1) : -1;
            }
            var7_7 = v0;
            v1 = var3_3.length;
            if (var4_4 != null) {
                v1 = v1 >= 4 ? N.a(var3_3[3], -1) : -1;
            }
            var8_8 = v1;
            var9_9 = null;
            v2 = var3_3;
            if (var4_4 == null) ** GOTO lbl18
            if (v2.length < 5) break block14;
            try {
                v2 = var3_3;
lbl18:
                // 2 sources

                var9_9 = net.minecraft.P.d.c(N.a(v2, 4));
            }
            catch (a var10_10) {
                throw new s("commands.clear.tagError", new Object[]{var10_10.getMessage()});
            }
        }
        v3 = var3_3.length;
        if (var4_4 != null) {
            if (v3 >= 2 && var6_6 == null) {
                throw new s("commands.clear.failure", new Object[]{var5_5.g()});
            }
            v3 = var5_5.cB.a(var6_6, var7_7, var8_8, var9_9);
        }
        var10_11 = v3;
        var5_5.cu.a();
        v4 = var5_5.cw.g;
        if (var4_4 != null) {
            if (v4 == 0) {
                var5_5.v();
            }
            var2_2.a(d.AFFECTED_ITEMS, var10_11);
            v4 = var10_11;
        }
        if (var4_4 != null) {
            if (v4 == 0) {
                throw new s("commands.clear.failure", new Object[]{var5_5.g()});
            }
            v4 = var8_8;
        }
        if (v4 == 0) {
            var2_2.a(new h("commands.clear.testing", new Object[]{var5_5.g(), var10_11}));
            if (var4_4 != null) return;
        }
        N.a(var2_2, (F)this, "commands.clear.success", new Object[]{var5_5.g(), var10_11});
    }
}

