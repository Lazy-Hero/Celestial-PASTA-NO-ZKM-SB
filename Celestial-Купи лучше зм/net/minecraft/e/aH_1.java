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
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aH
extends K {
    @Override
    public boolean a(String[] arrstring, int n2) {
        m[] arrm = s.b();
        boolean bl2 = n2;
        if (arrm != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        block6: {
            String[] arrstring2;
            block7: {
                int n3;
                int n4;
                block5: {
                    m[] arrm = s.b();
                    n4 = arrstring.length;
                    n3 = 1;
                    if (arrm != null) {
                        if (n4 == n3) {
                            return aH.a(arrstring, b10.at());
                        }
                        n4 = arrstring.length;
                        n3 = 1;
                    }
                    if (arrm == null) break block5;
                    if (n4 <= n3) break block6;
                    arrstring2 = arrstring;
                    if (arrm == null) break block7;
                    n4 = arrstring2.length;
                    n3 = 4;
                }
                if (n4 > n3) break block6;
                arrstring2 = arrstring;
            }
            list = aH.a(arrstring2, 1, n2);
            return list;
        }
        list = Collections.emptyList();
        return list;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String a(J j2) {
        return "commands.spawnpoint.usage";
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(b var1_1, J var2_2, String[] var3_3) throws s {
        var4_4 = s.b();
        v0 = var3_3.length;
        if (var4_4 != null) {
            if (v0 > 1) {
                v0 = var3_3.length;
                if (var4_4 != null) {
                    if (v0 < 4) {
                        throw new z("commands.spawnpoint.usage", new Object[0]);
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var3_3.length;
            }
        }
        var5_5 = v0 > 0 ? aH.d(var1_1, var2_2, var3_3[0]) : aH.a(var2_2);
        var6_6 = var3_3.length > 3 ? aH.b(var2_2, var3_3, 1, true) : var5_5.f();
        v1 /* !! */  = var5_5;
        if (var4_4 != null) {
            if (v1 /* !! */ .aG == null) return;
            var5_5.b(var6_6, true);
            v1 /* !! */  = var2_2;
        }
        aH.a((J)v1 /* !! */ , (F)this, "commands.spawnpoint.success", new Object[]{var5_5.g(), var6_6.e(), var6_6.b(), var6_6.a()});
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String a() {
        return "spawnpoint";
    }
}

