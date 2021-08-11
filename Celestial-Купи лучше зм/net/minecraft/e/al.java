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
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.at.h;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class al
extends K {
    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block7: {
            String string;
            block6: {
                m[] arrm;
                block5: {
                    arrm = s.b();
                    String[] arrstring2 = arrstring;
                    if (arrm != null) {
                        if (arrstring2.length != 1) {
                            throw new z("commands.locate.usage", new Object[0]);
                        }
                        arrstring2 = arrstring;
                    }
                    string = arrstring2[0];
                    n n2 = j2.b().a(string, j2.f(), false);
                    if (arrm == null) break block5;
                    if (n2 == null) break block6;
                    j2.a(new h("commands.locate.success", string, n2.e(), n2.a()));
                }
                if (arrm != null) break block7;
            }
            throw new s("commands.locate.failure", string);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public int a() {
        return 2;
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
            if (arrstring2.length != 1) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = al.a(arrstring2, "Stronghold", "Monument", "Village", "Mansion", "EndCity", "Fortress", "Temple", "Mineshaft");
        return list;
    }

    @Override
    public String a(J j2) {
        return "commands.locate.usage";
    }

    @Override
    public String a() {
        return "locate";
    }
}

