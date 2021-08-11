/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package net.minecraft.s;

import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.y;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.k.n;
import net.minecraft.s.a;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class k
extends K {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        boolean bl2 = a.c();
        String[] arrstring2 = arrstring;
        if (!bl2) {
            if (arrstring2.length != 1) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = k.a(arrstring2, b10.O().a().e());
        return list;
    }

    @Override
    public String a() {
        return "pardon-ip";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block9: {
            block5: {
                boolean bl2;
                block8: {
                    block7: {
                        block6: {
                            int n2;
                            int n3;
                            block4: {
                                bl2 = a.c();
                                n3 = arrstring.length;
                                n2 = 1;
                                if (bl2) break block4;
                                if (n3 != n2) break block5;
                                n3 = arrstring[0].length();
                                n2 = 1;
                            }
                            if (n3 <= n2) break block5;
                            Matcher matcher = a.d.matcher(arrstring[0]);
                            if (bl2) break block6;
                            if (!matcher.matches()) break block7;
                            b10.O().a().b(arrstring[0]);
                            k.a(j2, (F)this, "commands.unbanip.success", arrstring[0]);
                        }
                        if (!bl2) break block8;
                    }
                    throw new y("commands.unbanip.invalid", new Object[0]);
                }
                if (!bl2) break block9;
            }
            throw new z("commands.unbanip.usage", new Object[0]);
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(b b10, J j2) {
        boolean bl2 = a.b();
        boolean bl3 = b10.O().a().a();
        if (bl2) {
            if (!bl3) return false;
            bl3 = super.a(b10, j2);
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public String a(J j2) {
        return "commands.unbanip.usage";
    }
}

