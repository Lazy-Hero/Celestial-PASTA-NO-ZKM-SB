/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.s;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.at.h;
import net.minecraft.at.k;
import net.minecraft.k.n;
import net.minecraft.s.a;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class c
extends K {
    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String a() {
        return "say";
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        boolean bl2 = a.c();
        String[] arrstring2 = arrstring;
        if (!bl2) {
            if (arrstring2.length < 1) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = c.a(arrstring2, b10.at());
        return list;
    }

    @Override
    public String a(J j2) {
        return "commands.say.usage";
    }

    @Override
    public int a() {
        return 1;
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block4: {
            block3: {
                int n2;
                boolean bl2;
                block2: {
                    bl2 = a.c();
                    n2 = arrstring.length;
                    if (bl2) break block2;
                    if (n2 <= 0) break block3;
                    n2 = arrstring[0].length();
                }
                if (n2 <= 0) break block3;
                k k2 = c.a(j2, arrstring, 0, true);
                b10.O().a(new h("chat.type.announcement", j2.d(), k2));
                if (!bl2) break block4;
            }
            throw new z("commands.say.usage", new Object[0]);
        }
    }
}

