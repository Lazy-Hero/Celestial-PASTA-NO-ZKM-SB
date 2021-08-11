/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.s;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.x;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.at.l;
import net.minecraft.i.j;
import net.minecraft.i.k;
import net.minecraft.k.n;
import net.minecraft.s.a;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class h
extends K {
    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        k k2;
        boolean bl2 = a.b();
        if (arrstring.length < 2) {
            throw new z("commands.message.usage", new Object[0]);
        }
        J j3 = k2 = h.d(b10, j2, arrstring[0]);
        if (bl2) {
            if (j3 == j2) {
                throw new x("commands.message.sameTarget");
            }
            j3 = j2;
        }
        boolean bl3 = j2 instanceof j;
        if (bl2) {
            bl3 = !bl3;
        }
        net.minecraft.at.k k3 = h.a(j3, arrstring, 1, bl3);
        net.minecraft.at.h h2 = new net.minecraft.at.h("commands.message.display.incoming", j2.d(), k3.d());
        net.minecraft.at.h h3 = new net.minecraft.at.h("commands.message.display.outgoing", k2.d(), k3.d());
        h2.e().a(l.GRAY).c(true);
        h3.e().a(l.GRAY).c(true);
        ((net.minecraft.U.x)k2).a(h2);
        j2.a(h3);
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public List<String> b() {
        return Arrays.asList("w", "msg");
    }

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
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        return h.a(arrstring, b10.at());
    }

    @Override
    public String a() {
        return "tell";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String a(J j2) {
        return "commands.message.usage";
    }
}

