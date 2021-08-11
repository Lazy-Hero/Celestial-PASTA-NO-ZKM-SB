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
import net.minecraft.R.b;
import net.minecraft.at.g;
import net.minecraft.at.h;
import net.minecraft.k.n;
import net.minecraft.s.a;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class f
extends K {
    @Override
    public String a(J j2) {
        return "commands.banlist.usage";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean a(b b10, J j2) {
        boolean bl2;
        boolean bl3;
        block2: {
            block3: {
                bl3 = a.c();
                bl2 = b10.O().a().a();
                if (bl3) break block2;
                if (bl2) break block3;
                bl2 = b10.O().h().a();
                if (bl3) break block2;
                if (!bl2) return false;
            }
            bl2 = super.a(b10, j2);
        }
        if (bl3) return bl2;
        if (!bl2) return false;
        return true;
    }

    @Override
    public String a() {
        return "banlist";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block4: {
            block2: {
                block3: {
                    boolean bl2 = a.c();
                    if (bl2) break block2;
                    if (arrstring.length < 1 || !"ips".equalsIgnoreCase(arrstring[0])) break block3;
                    j2.a(new h("commands.banlist.ips", b10.O().a().e().length));
                    j2.a(new g(f.a(b10.O().a().e())));
                    if (!bl2) break block4;
                }
                j2.a(new h("commands.banlist.players", b10.O().h().e().length));
            }
            j2.a(new g(f.a(b10.O().h().e())));
        }
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
        list = f.a(arrstring2, "players", "ips");
        return list;
    }

    @Override
    public int a() {
        return 3;
    }
}

