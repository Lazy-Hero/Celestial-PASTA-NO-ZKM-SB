/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.R.b;
import net.minecraft.s.a;

public class m
extends K {
    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block2: {
            block1: {
                boolean bl2;
                block0: {
                    String string = b10.a(net.minecraft.ah.s.SURVIVAL, false);
                    bl2 = a.b();
                    if (!bl2) break block0;
                    if (string == null) break block1;
                    m.a(j2, (F)this, "commands.publish.started", string);
                }
                if (bl2) break block2;
            }
            m.a(j2, (F)this, "commands.publish.failed", new Object[0]);
        }
    }

    @Override
    public String a(J j2) {
        return "commands.publish.usage";
    }

    private static s a(s s2) {
        return s2;
    }

    @Override
    public String a() {
        return "publish";
    }
}

