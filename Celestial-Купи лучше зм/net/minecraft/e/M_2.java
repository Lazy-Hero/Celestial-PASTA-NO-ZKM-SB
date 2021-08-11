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
import net.minecraft.E.d;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.N.y;
import net.minecraft.P.a;
import net.minecraft.P.r;
import net.minecraft.R.b;
import net.minecraft.Z.i;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class M
extends K {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        block3: {
            String[] arrstring2;
            block4: {
                int n3;
                block2: {
                    m[] arrm = s.b();
                    n3 = arrstring.length;
                    if (arrm == null) break block2;
                    if (n3 <= 0) break block3;
                    arrstring2 = arrstring;
                    if (arrm == null) break block4;
                    n3 = arrstring2.length;
                }
                if (n3 > 3) break block3;
                arrstring2 = arrstring;
            }
            list = M.a(arrstring2, 0, n2);
            return list;
        }
        list = Collections.emptyList();
        return list;
    }

    @Override
    public String a(J j2) {
        return "commands.blockdata.usage";
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public String a() {
        return "blockdata";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        r r2;
        y y2;
        net.minecraft.ah.z z2;
        m[] arrm = s.b();
        if (arrm != null) {
            if (arrstring.length < 4) {
                throw new z("commands.blockdata.usage", new Object[0]);
            }
            j2.a(d.AFFECTED_BLOCKS, 0);
        }
        n n2 = M.b(j2, arrstring, 0, false);
        net.minecraft.ah.z z3 = z2 = j2.b();
        n n3 = n2;
        if (arrm != null) {
            if (!z3.n(n3)) {
                throw new s("commands.blockdata.outOfWorld", new Object[0]);
            }
            z3 = z2;
            n3 = n2;
        }
        i i2 = z3.d(n3);
        y y3 = y2 = z2.b(n2);
        if (arrm != null) {
            if (y3 == null) {
                throw new s("commands.blockdata.notValid", new Object[0]);
            }
            y3 = y2;
        }
        r r3 = y3.a(new r());
        r r4 = r3.c();
        try {
            r2 = net.minecraft.P.d.c(M.a(arrstring, 3));
        }
        catch (a a10) {
            throw new s("commands.blockdata.tagError", a10.getMessage());
        }
        r3.a(r2);
        r3.b("x", n2.e());
        r3.b("y", n2.b());
        r3.b("z", n2.a());
        if (arrm != null) {
            if (r3.equals(r4)) {
                throw new s("commands.blockdata.failed", r3.toString());
            }
            y2.c(r3);
            y2.b();
            z2.a(n2, i2, i2, 3);
            j2.a(d.AFFECTED_BLOCKS, 1);
            M.a(j2, (F)this, "commands.blockdata.success", r3.toString());
        }
    }
}

