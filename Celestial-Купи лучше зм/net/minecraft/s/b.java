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
import net.minecraft.a.d;
import net.minecraft.at.h;
import net.minecraft.i.k;
import net.minecraft.k.n;
import net.minecraft.s.a;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class b
extends K {
    @Override
    public void a(net.minecraft.R.b b10, J j2, String[] arrstring) throws s {
        block9: {
            block8: {
                k k2;
                int n2;
                boolean bl2;
                block7: {
                    bl2 = a.b();
                    n2 = arrstring.length;
                    if (!bl2) break block7;
                    if (n2 < 1) break block8;
                    n2 = arrstring[0].length();
                }
                if (n2 <= 0) break block8;
                GameProfile gameProfile = b10.au().a(arrstring[0]);
                if (gameProfile == null) {
                    throw new s("commands.ban.failed", arrstring[0]);
                }
                String string = null;
                if (arrstring.length >= 2) {
                    string = b.a(j2, arrstring, 1).f();
                }
                d d10 = new d(gameProfile, null, j2.g(), null, string);
                b10.O().h().a(d10);
                J j3 = k2 = b10.O().a(arrstring[0]);
                if (bl2) {
                    if (j3 != null) {
                        k2.cD.b(new h("multiplayer.disconnect.banned", new Object[0]));
                    }
                    j3 = j2;
                }
                b.a(j3, (F)this, "commands.ban.success", arrstring[0]);
                if (bl2) break block9;
            }
            throw new z("commands.ban.usage", new Object[0]);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public List<String> a(net.minecraft.R.b b10, J j2, String[] arrstring, @Nullable n n2) {
        List<String> list;
        boolean bl2 = a.b();
        String[] arrstring2 = arrstring;
        if (bl2) {
            if (arrstring2.length < 1) {
                list = Collections.emptyList();
                return list;
            }
            arrstring2 = arrstring;
        }
        list = b.a(arrstring2, b10.at());
        return list;
    }

    @Override
    public String a(J j2) {
        return "commands.ban.usage";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public String a() {
        return "ban";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(net.minecraft.R.b b10, J j2) {
        boolean bl2 = a.b();
        boolean bl3 = b10.O().h().a();
        if (bl2) {
            if (!bl3) return false;
            bl3 = super.a(b10, j2);
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }
}

