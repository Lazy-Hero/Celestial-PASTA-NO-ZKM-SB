/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.as;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.minecraft.ar.u;
import net.minecraft.as.k;
import net.minecraft.as.o;
import net.minecraft.aw.c;
import net.minecraft.aw.z;
import net.minecraft.client.O;

public class i {
    private final /* synthetic */ z a;

    public List<o> a() throws O {
        ArrayList arrayList;
        block2: {
            ArrayList arrayList2 = Lists.newArrayList();
            Iterator<c> iterator = this.a.b().iterator();
            int n2 = k.m();
            while (iterator.hasNext()) {
                c c10 = iterator.next();
                arrayList = arrayList2;
                if (n2 != 0) {
                    arrayList.add(new o(c10));
                    if (n2 != 0) continue;
                }
                break block2;
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public i(z z2) {
        this.a = z2;
    }

    public boolean b(String string) {
        return this.a.c(string);
    }

    public boolean a(String string) {
        return this.a.a(string);
    }

    public boolean d(String string) {
        return this.a.e(string);
    }

    public boolean a(String string, u u2) {
        return this.a.a(string, u2);
    }

    public boolean e(String string) {
        return this.a.b(string);
    }

    public void c() {
        this.a.a();
    }

    public void a(String string, String string2) {
        this.a.a(string, string2);
    }

    public String b() {
        return this.a.c();
    }

    public boolean c(String string) {
        return this.a.d(string);
    }

    private static O a(O o2) {
        return o2;
    }
}

