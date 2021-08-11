/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.TypeAdapterFactory
 */
package net.minecraft.f;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapterFactory;
import java.io.IOException;
import net.minecraft.C.K;
import net.minecraft.C.P;
import net.minecraft.C.h;
import net.minecraft.C.j;
import net.minecraft.C.x;
import net.minecraft.ar.S;
import net.minecraft.ar.aG;
import net.minecraft.at.i;
import net.minecraft.at.k;
import net.minecraft.at.o;
import net.minecraft.f.a;
import net.minecraft.k.m;

public class b
implements K<net.minecraft.F.b> {
    private static final /* synthetic */ Gson a;
    private /* synthetic */ P b;

    @Override
    public void a(net.minecraft.C.m m2) throws IOException {
        this.b = aG.a(a, m2.c(32767), P.class);
        String[] arrstring = net.minecraft.f.a.b();
        if (arrstring != null) {
            m.b(!m.c());
        }
    }

    public b() {
    }

    public P a() {
        return this.b;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    static {
        a = new GsonBuilder().registerTypeAdapter(x.class, (Object)new h()).registerTypeAdapter(j.class, (Object)new net.minecraft.C.i()).registerTypeAdapter(P.class, (Object)new net.minecraft.C.k()).registerTypeHierarchyAdapter(k.class, (Object)new o()).registerTypeHierarchyAdapter(i.class, (Object)new net.minecraft.at.m()).registerTypeAdapterFactory((TypeAdapterFactory)new S()).create();
    }

    public b(P p2) {
        this.b = p2;
    }

    @Override
    public void b(net.minecraft.C.m m2) throws IOException {
        block0: {
            String[] arrstring = net.minecraft.f.a.b();
            m2.a(a.toJson((Object)this.b));
            String[] arrstring2 = arrstring;
            if (!m.c()) break block0;
            net.minecraft.f.a.b(new String[1]);
        }
    }

    @Override
    public void a(net.minecraft.F.b b10) {
        b10.a(this);
    }
}

