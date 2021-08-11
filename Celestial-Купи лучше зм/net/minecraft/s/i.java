/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  javax.annotation.Nullable
 */
package net.minecraft.s;

import com.google.gson.JsonParseException;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.E.J;
import net.minecraft.E.K;
import net.minecraft.E.s;
import net.minecraft.E.z;
import net.minecraft.R.b;
import net.minecraft.U.x;
import net.minecraft.at.o;
import net.minecraft.i.k;
import net.minecraft.k.n;
import net.minecraft.s.a;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class i
extends K {
    @Override
    public boolean a(String[] arrstring, int n2) {
        boolean bl2 = a.b();
        boolean bl3 = n2;
        if (bl2) {
            bl3 = !bl3;
        }
        return bl3;
    }

    @Override
    public String a() {
        return "tellraw";
    }

    private static JsonParseException b(JsonParseException jsonParseException) {
        return jsonParseException;
    }

    @Override
    public void a(b b10, J j2, String[] arrstring) throws s {
        if (arrstring.length < 2) {
            throw new z("commands.tellraw.usage", new Object[0]);
        }
        k k2 = i.d(b10, j2, arrstring[0]);
        String string = i.a(arrstring, 1);
        try {
            net.minecraft.at.k k3 = o.a(string);
            ((x)k2).a(net.minecraft.at.b.a(j2, k3, k2));
        }
        catch (JsonParseException jsonParseException) {
            throw i.a(jsonParseException);
        }
    }

    @Override
    public int a() {
        return 2;
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
        list = i.a(arrstring2, b10.at());
        return list;
    }

    @Override
    public String a(J j2) {
        return "commands.tellraw.usage";
    }
}

