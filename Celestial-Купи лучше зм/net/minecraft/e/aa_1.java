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
public class aa
extends K {
    @Override
    public String a(J j2) {
        return "commands.setidletimeout.usage";
    }

    private static s a(s s2) {
        return s2;
    }

    @Override
    public String a() {
        return "setidletimeout";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        m[] arrm = s.b();
        int n2 = arrstring.length;
        if (arrm != null) {
            if (n2 != 1) {
                throw new z("commands.setidletimeout.usage", new Object[0]);
            }
            n2 = aa.a(arrstring[0], 0);
        }
        int n3 = n2;
        b10.a(n3);
        aa.a(j2, (F)this, "commands.setidletimeout.success", n3);
    }

    @Override
    public int a() {
        return 3;
    }
}

