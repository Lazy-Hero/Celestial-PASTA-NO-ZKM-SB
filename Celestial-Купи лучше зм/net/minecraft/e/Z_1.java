/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.E;

import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.Y;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.at.h;
import net.minecraft.i.k;
import net.minecraft.k.m;

public class Z
extends Y {
    @Override
    public String a() {
        return "defaultgamemode";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        if (arrstring.length <= 0) {
            throw new z("commands.defaultgamemode.usage", new Object[0]);
        }
        net.minecraft.ah.s s2 = this.a(j2, arrstring[0]);
        this.a(s2, b10);
        Z.a(j2, (F)this, "commands.defaultgamemode.success", new h("gameMode." + s2.a(), new Object[0]));
    }

    protected void a(net.minecraft.ah.s s2, b b10) {
        block4: {
            b b11;
            m[] arrm;
            block3: {
                m[] arrm2 = s.b();
                b10.a(s2);
                arrm = arrm2;
                b11 = b10;
                if (arrm == null) break block3;
                if (!b11.af()) break block4;
                b11 = b10;
            }
            for (k k2 : b11.O().u()) {
                k2.a(s2);
                if (arrm != null) continue;
            }
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String a(J j2) {
        return "commands.defaultgamemode.usage";
    }
}

