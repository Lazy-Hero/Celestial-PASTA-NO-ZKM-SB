/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.R.b;
import net.minecraft.ah.A;
import net.minecraft.s.a;

public class p
extends K {
    private static s a(s s2) {
        return s2;
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block13: {
            block12: {
                J j3;
                boolean bl2;
                block8: {
                    boolean bl3 = false;
                    int n2 = 0;
                    bl2 = a.c();
                    while (n2 < b10.S.length) {
                        block11: {
                            block10: {
                                A a10;
                                block9: {
                                    j3 = b10;
                                    if (bl2) break block8;
                                    A a11 = j3.S[n2];
                                    if (bl2) break block9;
                                    if (a11 == null) break block10;
                                    a11 = a10 = b10.S[n2];
                                }
                                if (bl2) break block11;
                                if (a10.Y) {
                                    a10.Y = false;
                                    bl3 = true;
                                }
                            }
                            ++n2;
                        }
                        if (!bl2) continue;
                    }
                    if (!bl3) break block12;
                    j3 = j2;
                }
                p.a(j3, (F)this, "commands.save.enabled", new Object[0]);
                if (!bl2) break block13;
            }
            throw new s("commands.save-on.alreadyOn", new Object[0]);
        }
    }

    @Override
    public String a(J j2) {
        return "commands.save-on.usage";
    }

    @Override
    public String a() {
        return "save-on";
    }
}

