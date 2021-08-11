/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.E;

import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.R.b;
import net.minecraft.at.h;
import net.minecraft.i.j;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a7
extends K {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(b b10, J j2) {
        m[] arrm = s.b();
        boolean bl2 = b10.av();
        if (arrm == null) return bl2;
        if (bl2) return true;
        bl2 = super.a(b10, j2);
        if (arrm == null) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public String a() {
        return "seed";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String a(J j2) {
        return "commands.seed.usage";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(b var1_1, J var2_2, String[] var3_3) throws s {
        var4_4 = s.b();
        v0 = var2_2;
        if (var4_4 == null) ** GOTO lbl6
        if (v0 instanceof j) {
            v0 = var2_2;
lbl6:
            // 2 sources

            v1 = ((j)v0).aG;
        } else {
            v1 = var1_1.c(0);
        }
        var5_5 = v1;
        var2_2.a(new h("commands.seed.success", new Object[]{var5_5.C()}));
    }
}

