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
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.U.x;
import net.minecraft.at.h;
import net.minecraft.i.j;
import net.minecraft.i.k;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Y
extends K {
    protected net.minecraft.ah.s a(J j2, String string) throws s {
        net.minecraft.ah.s s2 = net.minecraft.ah.s.a(string, net.minecraft.ah.s.NOT_SET);
        m[] arrm = s.b();
        net.minecraft.ah.s s3 = s2;
        if (arrm != null) {
            s3 = s3 == net.minecraft.ah.s.NOT_SET ? net.minecraft.ah.K.a(Y.a(string, 0, net.minecraft.ah.s.values().length - 2)) : s2;
        }
        return s3;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        m[] arrm = s.b();
        boolean bl2 = n2;
        if (arrm != null) {
            bl2 = bl2;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        String[] arrstring2;
        block6: {
            int n3;
            int n4;
            block5: {
                m[] arrm = s.b();
                n4 = arrstring.length;
                n3 = 1;
                if (arrm == null) break block5;
                if (n4 == n3) {
                    return Y.a(arrstring, "survival", "creative", "adventure", "spectator");
                }
                arrstring2 = arrstring;
                if (arrm == null) break block6;
                n4 = arrstring2.length;
                n3 = 2;
            }
            if (n4 != n3) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = Y.a(arrstring2, b10.at());
        return list;
    }

    private static Exception c(Exception exception) {
        return exception;
    }

    @Override
    public String a(J j2) {
        return "commands.gamemode.usage";
    }

    @Override
    public String a() {
        return "gamemode";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block7: {
            J j3;
            h h2;
            k k2;
            block5: {
                block6: {
                    m[] arrm = s.b();
                    if (arrstring.length <= 0) {
                        throw new z("commands.gamemode.usage", new Object[0]);
                    }
                    net.minecraft.ah.s s2 = this.a(j2, arrstring[0]);
                    k2 = arrstring.length >= 2 ? Y.d(b10, j2, arrstring[1]) : Y.a(j2);
                    ((j)k2).a(s2);
                    h2 = new h("gameMode." + s2.a(), new Object[0]);
                    if (j2.b().M().c("sendCommandFeedback")) {
                        ((x)k2).a(new h("gameMode.changed", h2));
                    }
                    j3 = k2;
                    if (arrm == null) break block5;
                    if (j3 != j2) break block6;
                    Y.a(j2, (F)this, 1, "commands.gamemode.success.self", h2);
                    if (arrm != null) break block7;
                }
                j3 = j2;
            }
            Y.a(j3, (F)this, 1, "commands.gamemode.success.other", k2.g(), h2);
        }
    }
}

