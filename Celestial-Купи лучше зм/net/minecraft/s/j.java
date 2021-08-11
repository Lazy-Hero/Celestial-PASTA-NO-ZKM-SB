/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.authlib.GameProfile
 *  javax.annotation.Nullable
 */
package net.minecraft.s;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
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
public class j
extends K {
    @Override
    public String a() {
        return "op";
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block7: {
            block6: {
                int n2;
                boolean bl2;
                block5: {
                    bl2 = a.b();
                    n2 = arrstring.length;
                    if (!bl2) break block5;
                    if (n2 != 1) break block6;
                    n2 = arrstring[0].length();
                }
                if (n2 <= 0) break block6;
                GameProfile gameProfile = b10.au().a(arrstring[0]);
                if (bl2) {
                    if (gameProfile == null) {
                        throw new s("commands.op.failed", arrstring[0]);
                    }
                    b10.O().d(gameProfile);
                    j.a(j2, (F)this, "commands.op.success", arrstring[0]);
                }
                if (bl2) break block7;
            }
            throw new z("commands.op.usage", new Object[0]);
        }
    }

    @Override
    public String a(J j2) {
        return "commands.op.usage";
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    public int a() {
        return 3;
    }

    @Override
    public List<String> a(b b10, J j2, String[] arrstring, @Nullable n n2) {
        block8: {
            String[] arrstring2;
            boolean bl2;
            block7: {
                bl2 = a.b();
                arrstring2 = arrstring;
                if (!bl2) break block7;
                if (arrstring2.length != 1) break block8;
                arrstring2 = arrstring;
            }
            String string = arrstring2[arrstring.length - 1];
            ArrayList arrayList = Lists.newArrayList();
            GameProfile[] arrgameProfile = b10.Q();
            int n3 = arrgameProfile.length;
            int n4 = 0;
            while (n4 < n3) {
                GameProfile gameProfile = arrgameProfile[n4];
                if (bl2) {
                    if (!b10.O().e(gameProfile)) {
                        boolean bl3 = j.a(string, gameProfile.getName());
                        if (bl2 && bl3) {
                            bl3 = arrayList.add(gameProfile.getName());
                        }
                    }
                    ++n4;
                }
                if (bl2) continue;
            }
            return arrayList;
        }
        return Collections.emptyList();
    }
}

