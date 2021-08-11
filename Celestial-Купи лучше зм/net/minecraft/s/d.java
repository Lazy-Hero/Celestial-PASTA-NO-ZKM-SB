/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  javax.annotation.Nullable
 */
package net.minecraft.s;

import com.mojang.authlib.GameProfile;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.k.n;
import net.minecraft.s.a;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class d
extends K {
    @Override
    public String a() {
        return "deop";
    }

    @Override
    public int a() {
        return 3;
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
            if (arrstring2.length != 1) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = d.a(arrstring2, b10.O().p());
        return list;
    }

    @Override
    public String a(J j2) {
        return "commands.deop.usage";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block7: {
            block6: {
                int n2;
                boolean bl2;
                block5: {
                    bl2 = a.c();
                    n2 = arrstring.length;
                    if (bl2) break block5;
                    if (n2 != 1) break block6;
                    n2 = arrstring[0].length();
                }
                if (n2 <= 0) break block6;
                GameProfile gameProfile = b10.O().v().a(arrstring[0]);
                if (!bl2) {
                    if (gameProfile == null) {
                        throw new s("commands.deop.failed", arrstring[0]);
                    }
                    b10.O().c(gameProfile);
                    d.a(j2, (F)this, "commands.deop.success", arrstring[0]);
                }
                if (!bl2) break block7;
            }
            throw new z("commands.deop.usage", new Object[0]);
        }
    }
}

