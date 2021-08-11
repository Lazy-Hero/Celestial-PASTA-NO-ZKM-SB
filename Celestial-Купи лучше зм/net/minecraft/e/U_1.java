/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.E;

import java.util.UUID;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.P.a;
import net.minecraft.P.d;
import net.minecraft.P.r;
import net.minecraft.R.b;
import net.minecraft.U.x;
import net.minecraft.i.j;
import net.minecraft.k.m;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class U
extends K {
    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        r r2;
        x x2;
        m[] arrm = s.b();
        if (arrstring.length < 2) {
            throw new z("commands.entitydata.usage", new Object[0]);
        }
        x x3 = x2 = U.a(b10, j2, arrstring[0]);
        if (arrm != null) {
            if (x3 instanceof j) {
                throw new s("commands.entitydata.noPlayers", x2.d());
            }
            x3 = x2;
        }
        r r3 = U.a(x3);
        r r4 = r3.c();
        try {
            r2 = d.c(U.a(arrstring, 1));
        }
        catch (a a10) {
            throw new s("commands.entitydata.tagError", a10.getMessage());
        }
        UUID uUID = x2.u();
        r3.a(r2);
        x2.a(uUID);
        if (arrm != null) {
            if (r3.equals(r4)) {
                throw new s("commands.entitydata.failed", r3.toString());
            }
            x2.d(r3);
            U.a(j2, (F)this, "commands.entitydata.success", r3.toString());
        }
    }

    @Override
    public String a(J j2) {
        return "commands.entitydata.usage";
    }

    @Override
    public String a() {
        return "entitydata";
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
    public int a() {
        return 2;
    }
}

