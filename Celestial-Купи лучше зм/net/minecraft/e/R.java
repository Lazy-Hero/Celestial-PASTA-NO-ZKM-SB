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
import net.minecraft.ah.e;
import net.minecraft.at.h;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class R
extends K {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        m[] arrm = s.b();
        String[] arrstring2 = arrstring;
        if (arrm != null) {
            if (arrstring2.length != 1) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = R.a(arrstring2, "peaceful", "easy", "normal", "hard");
        return list;
    }

    @Override
    public String a() {
        return "difficulty";
    }

    @Override
    public int a() {
        return 2;
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String a(J j2) {
        return "commands.difficulty.usage";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        if (arrstring.length <= 0) {
            throw new z("commands.difficulty.usage", new Object[0]);
        }
        e e10 = this.a(arrstring[0]);
        b10.a(e10);
        R.a(j2, (F)this, "commands.difficulty.success", new h(e10.b(), new Object[0]));
    }

    /*
     * Enabled aggressive block sorting
     */
    protected e a(String string) throws s {
        e e10;
        block10: {
            int n2;
            block11: {
                m[] arrm;
                block9: {
                    arrm = s.b();
                    n2 = "peaceful".equalsIgnoreCase(string);
                    if (arrm != null) {
                        if (n2 != 0) return e.PEACEFUL;
                        n2 = "p".equalsIgnoreCase(string);
                    }
                    if (arrm != null) {
                        if (n2 != 0) return e.PEACEFUL;
                        n2 = "easy".equalsIgnoreCase(string);
                    }
                    if (arrm != null) {
                        if (n2 != 0) return e.EASY;
                        n2 = "e".equalsIgnoreCase(string);
                    }
                    if (arrm != null) {
                        if (n2 != 0) return e.EASY;
                        n2 = "normal".equalsIgnoreCase(string);
                    }
                    if (arrm != null) {
                        if (n2 != 0) return e.NORMAL;
                        n2 = "n".equalsIgnoreCase(string);
                    }
                    if (arrm != null) {
                        if (n2 != 0) return e.NORMAL;
                        n2 = "hard".equalsIgnoreCase(string);
                    }
                    if (arrm == null) break block9;
                    if (n2 != 0) break block10;
                    n2 = "h".equalsIgnoreCase(string) ? 1 : 0;
                }
                if (arrm == null) break block11;
                if (n2 != 0) break block10;
                n2 = R.a(string, 0, 3);
            }
            e10 = e.a(n2);
            return e10;
        }
        e10 = e.HARD;
        return e10;
    }
}

