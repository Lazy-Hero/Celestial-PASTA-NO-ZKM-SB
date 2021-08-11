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
import net.minecraft.at.g;
import net.minecraft.at.h;
import net.minecraft.k.n;
import net.minecraft.s.a;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class y
extends K {
    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        block9: {
            int n3;
            boolean bl2;
            block8: {
                int n4;
                block7: {
                    bl2 = a.b();
                    n3 = arrstring.length;
                    n4 = 1;
                    if (!bl2) break block7;
                    if (n3 == n4) {
                        return y.a(arrstring, "on", "off", "list", "add", "remove", "reload");
                    }
                    n3 = arrstring.length;
                    if (!bl2) break block8;
                    n4 = 2;
                }
                if (n3 != n4) break block9;
                n3 = "remove".equals(arrstring[0]) ? 1 : 0;
            }
            if (bl2) {
                if (n3 != 0) {
                    return y.a(arrstring, b10.O().m());
                }
                n3 = "add".equals(arrstring[0]) ? 1 : 0;
            }
            if (n3 != 0) {
                return y.a(arrstring, b10.au().c());
            }
        }
        return Collections.emptyList();
    }

    @Override
    public String a() {
        return "whitelist";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public String a(J j2) {
        return "commands.whitelist.usage";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block11: {
            int n2;
            block18: {
                block19: {
                    Object[] arrobject;
                    boolean bl2;
                    block16: {
                        block17: {
                            block14: {
                                block15: {
                                    block12: {
                                        block13: {
                                            block9: {
                                                block10: {
                                                    bl2 = a.c();
                                                    n2 = arrstring.length;
                                                    if (!bl2) {
                                                        if (n2 < 1) {
                                                            throw new z("commands.whitelist.usage", new Object[0]);
                                                        }
                                                        n2 = "on".equals(arrstring[0]) ? 1 : 0;
                                                    }
                                                    if (bl2) break block9;
                                                    if (n2 == 0) break block10;
                                                    b10.O().a(true);
                                                    y.a(j2, (F)this, "commands.whitelist.enabled", new Object[0]);
                                                    if (!bl2) break block11;
                                                }
                                                n2 = "off".equals(arrstring[0]) ? 1 : 0;
                                            }
                                            if (bl2) break block12;
                                            if (n2 == 0) break block13;
                                            b10.O().a(false);
                                            y.a(j2, (F)this, "commands.whitelist.disabled", new Object[0]);
                                            if (!bl2) break block11;
                                        }
                                        n2 = "list".equals(arrstring[0]) ? 1 : 0;
                                    }
                                    if (bl2) break block14;
                                    if (n2 == 0) break block15;
                                    j2.a(new h("commands.whitelist.list", b10.O().m().length, b10.O().l().length));
                                    arrobject = b10.O().m();
                                    j2.a(new g(y.a(arrobject)));
                                    if (!bl2) break block11;
                                }
                                n2 = "add".equals(arrstring[0]) ? 1 : 0;
                            }
                            if (bl2) break block16;
                            if (n2 == 0) break block17;
                            if (arrstring.length < 2) {
                                throw new z("commands.whitelist.add.usage", new Object[0]);
                            }
                            arrobject = b10.au().a(arrstring[1]);
                            if (!bl2) {
                                if (arrobject == null) {
                                    throw new s("commands.whitelist.add.failed", arrstring[1]);
                                }
                                b10.O().f((GameProfile)arrobject);
                                y.a(j2, (F)this, "commands.whitelist.add.success", arrstring[1]);
                            }
                            if (!bl2) break block11;
                        }
                        n2 = "remove".equals(arrstring[0]) ? 1 : 0;
                    }
                    if (bl2) break block18;
                    if (n2 == 0) break block19;
                    if (arrstring.length < 2) {
                        throw new z("commands.whitelist.remove.usage", new Object[0]);
                    }
                    arrobject = b10.O().o().a(arrstring[1]);
                    if (!bl2) {
                        if (arrobject == null) {
                            throw new s("commands.whitelist.remove.failed", arrstring[1]);
                        }
                        b10.O().b((GameProfile)arrobject);
                        y.a(j2, (F)this, "commands.whitelist.remove.success", arrstring[1]);
                    }
                    if (!bl2) break block11;
                }
                n2 = "reload".equals(arrstring[0]) ? 1 : 0;
            }
            if (n2 != 0) {
                b10.O().s();
                y.a(j2, (F)this, "commands.whitelist.reloaded", new Object[0]);
            }
        }
    }
}

