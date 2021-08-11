/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.E;

import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class a9
extends K {
    @Override
    public int a() {
        return 3;
    }

    private static s a(s s2) {
        return s2;
    }

    @Override
    public String a(J j2) {
        return "commands.reload.usage";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        m[] arrm = s.b();
        if (arrm != null) {
            if (arrstring.length > 0) {
                throw new z("commands.reload.usage", new Object[0]);
            }
            b10.S();
            a9.a(j2, (F)this, "commands.reload.success", new Object[0]);
        }
    }

    @Override
    public String a() {
        return "reload";
    }
}

