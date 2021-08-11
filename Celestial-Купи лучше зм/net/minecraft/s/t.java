/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.R.b;
import net.minecraft.s.a;

public class t
extends K {
    private static s a(s s2) {
        return s2;
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        boolean bl2 = a.b();
        b b11 = b10;
        if (bl2) {
            if (b11.S != null) {
                t.a(j2, (F)this, "commands.stop.start", new Object[0]);
            }
            b11 = b10;
        }
        b11.B();
    }

    @Override
    public String a(J j2) {
        return "commands.stop.usage";
    }

    @Override
    public String a() {
        return "stop";
    }
}

