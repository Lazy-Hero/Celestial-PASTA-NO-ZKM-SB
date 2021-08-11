/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.E;

import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.R.b;
import net.minecraft.aw.w;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class ao
extends K {
    @Override
    public String a() {
        return "toggledownfall";
    }

    protected void a(b b10) {
        w w2 = b10.S[0].b();
        m[] arrm = s.b();
        boolean bl2 = w2.b();
        if (arrm != null) {
            bl2 = !bl2;
        }
        w2.c(bl2);
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String a(J j2) {
        return "commands.downfall.usage";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        this.a(b10);
        ao.a(j2, (F)this, "commands.downfall.success", new Object[0]);
    }
}

