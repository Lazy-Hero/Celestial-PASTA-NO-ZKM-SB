/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.E;

import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.x;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.at.h;
import net.minecraft.i.k;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class aC
extends K {
    @Override
    public String a(J j2) {
        return "commands.kick.usage";
    }

    @Override
    public String a() {
        return "kick";
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block11: {
            block8: {
                m[] arrm;
                block10: {
                    k k2;
                    block9: {
                        int n2;
                        block7: {
                            arrm = s.b();
                            n2 = arrstring.length;
                            if (arrm == null) break block7;
                            if (n2 <= 0) break block8;
                            n2 = arrstring[0].length();
                        }
                        if (n2 <= 1) break block8;
                        k2 = b10.O().a(arrstring[0]);
                        if (k2 == null) {
                            throw new x("commands.generic.player.notFound", arrstring[0]);
                        }
                        if (arrstring.length < 2) break block9;
                        net.minecraft.at.k k3 = aC.a(j2, arrstring, 1);
                        k2.cD.b(k3);
                        aC.a(j2, (F)this, "commands.kick.success.reason", k2.g(), k3.f());
                        if (arrm != null) break block10;
                    }
                    k2.cD.b(new h("multiplayer.disconnect.kicked", new Object[0]));
                    aC.a(j2, (F)this, "commands.kick.success", k2.g());
                }
                if (arrm != null) break block11;
            }
            throw new z("commands.kick.usage", new Object[0]);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        m[] arrm = s.b();
        String[] arrstring2 = arrstring;
        if (arrm != null) {
            if (arrstring2.length < 1) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = aC.a(arrstring2, b10.at());
        return list;
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

