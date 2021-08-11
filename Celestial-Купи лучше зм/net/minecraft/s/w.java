/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.s;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.P.c;
import net.minecraft.P.d;
import net.minecraft.R.b;
import net.minecraft.k.n;
import net.minecraft.s.a;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class w
extends K {
    @Override
    public boolean a(String[] arrstring, int n2) {
        boolean bl2 = a.c();
        boolean bl3 = n2;
        if (!bl2) {
            bl3 = !bl3;
        }
        return bl3;
    }

    @Override
    public String a(J j2) {
        return "commands.testfor.usage";
    }

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
        boolean bl2 = a.b();
        String[] arrstring2 = arrstring;
        if (bl2) {
            if (arrstring2.length != 1) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = w.a(arrstring2, b10.at());
        return list;
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
        block12: {
            block11: {
                block10: {
                    var4_4 = a.b();
                    if (var3_3.length < 1) {
                        throw new z("commands.testfor.usage", new Object[0]);
                    }
                    var5_5 = w.a(var1_1, var2_2, var3_3[0]);
                    var6_6 = null;
                    v0 = var3_3;
                    if (!var4_4) ** GOTO lbl11
                    if (v0.length < 2) break block10;
                    try {
                        v0 = var3_3;
lbl11:
                        // 2 sources

                        var6_6 = d.c(w.a(v0, 1));
                    }
                    catch (net.minecraft.P.a var7_7) {
                        throw new s("commands.testfor.tagError", new Object[]{var7_7.getMessage()});
                    }
                }
                v1 = var6_6;
                if (!var4_4) break block11;
                if (v1 == null) break block12;
                v1 = w.a(var5_5);
            }
            var7_8 = v1;
            if (var4_4 == false) return;
            if (!c.a(var6_6, var7_8, true)) {
                throw new s("commands.testfor.failure", new Object[]{var5_5.g()});
            }
        }
        w.a(var2_2, (F)this, "commands.testfor.success", new Object[]{var5_5.g()});
    }

    @Override
    public String a() {
        return "testfor";
    }
}

