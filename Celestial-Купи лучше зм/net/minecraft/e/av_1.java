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
import net.minecraft.E.F;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.R.b;
import net.minecraft.U.B;
import net.minecraft.U.x;
import net.minecraft.i.j;
import net.minecraft.k.m;
import net.minecraft.k.n;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class av
extends K {
    @Override
    public int a() {
        return 2;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        block3: {
            x x2;
            block2: {
                m[] arrm = s.b();
                if (arrstring.length != 0) break block2;
                x2 = av.a(j2);
                ((B)x2).y();
                av.a(j2, (F)this, "commands.kill.successful", ((j)x2).d());
                if (arrm != null) break block3;
            }
            x2 = av.a(b10, j2, arrstring[0]);
            x2.y();
            av.a(j2, (F)this, "commands.kill.successful", x2.d());
        }
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        m[] arrm = s.b();
        boolean bl2 = n2;
        if (arrm != null) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Override
    public String a(J j2) {
        return "commands.kill.usage";
    }

    @Override
    public String a() {
        return "kill";
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
        list = av.a(arrstring2, b10.at());
        return list;
    }
}

