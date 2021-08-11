/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.d;
import net.minecraft.E.s;
import net.minecraft.R.b;
import net.minecraft.at.h;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class g
extends K {
    private static s a(s s2) {
        return s2;
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public String a() {
        return "list";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        int n2 = b10.al();
        j2.a(new h("commands.players.list", n2, b10.W()));
        j2.a(new net.minecraft.at.g(b10.O().b(arrstring.length > 0 && "uuids".equalsIgnoreCase(arrstring[0]))));
        j2.a(d.QUERY_RESULT, n2);
    }

    @Override
    public String a(J j2) {
        return "commands.players.usage";
    }
}

