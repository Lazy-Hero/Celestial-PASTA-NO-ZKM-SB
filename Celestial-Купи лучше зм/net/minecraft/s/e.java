/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.s;

import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.i.j;
import net.minecraft.k.n;
import net.minecraft.s.a;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class e
extends K {
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        return e.a(arrstring, b10.at());
    }

    @Override
    public String a(J j2) {
        return "commands.me.usage";
    }

    @Override
    public String a() {
        return "me";
    }

    private static s a(s s2) {
        return s2;
    }

    @Override
    public int a() {
        return 0;
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        boolean bl2 = a.c();
        if (arrstring.length <= 0) {
            throw new z("commands.me.usage", new Object[0]);
        }
        boolean bl3 = j2 instanceof j;
        if (!bl2) {
            bl3 = !bl3;
        }
        k k2 = e.a(j2, arrstring, 0, bl3);
        b10.O().a(new h("chat.type.emote", j2.d(), k2));
    }
}

