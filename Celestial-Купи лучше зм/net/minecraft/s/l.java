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
public class l
extends K {
    @Override
    public int a() {
        return 3;
    }

    @Override
    public String a() {
        return "pardon";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public String a(J j2) {
        return "commands.unban.usage";
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
                GameProfile gameProfile = b10.O().h().a(arrstring[0]);
                if (!bl2) {
                    if (gameProfile == null) {
                        throw new s("commands.unban.failed", arrstring[0]);
                    }
                    b10.O().h().b(gameProfile);
                    l.a(j2, (F)this, "commands.unban.success", arrstring[0]);
                }
                if (!bl2) break block7;
            }
            throw new z("commands.unban.usage", new Object[0]);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(b b10, J j2) {
        boolean bl2 = a.c();
        boolean bl3 = b10.O().h().a();
        if (!bl2) {
            if (!bl3) return false;
            bl3 = super.a(b10, j2);
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        boolean bl2 = a.b();
        String[] arrstring2 = arrstring;
        if (bl2) {
            if (arrstring2.length != 1) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = l.a(arrstring2, b10.O().h().e());
        return list;
    }
}

