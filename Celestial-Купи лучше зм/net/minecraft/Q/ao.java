/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net.minecraft.Q;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.Q.aD;
import net.minecraft.Q.aF;
import net.minecraft.j.b;
import net.minecraft.j.f;
import net.minecraft.n.a;

public class ao
implements K<a> {
    private /* synthetic */ int a;
    private final /* synthetic */ List<aF> b;

    @Override
    public void a(m m2) throws IOException {
        this.a = m2.a();
        int n2 = m2.readInt();
        boolean bl2 = aD.c();
        int n3 = 0;
        while (n3 < n2) {
            block3: {
                String string = m2.c(64);
                double d10 = m2.readDouble();
                ArrayList arrayList = Lists.newArrayList();
                int n4 = m2.a();
                for (int i2 = 0; i2 < n4; ++i2) {
                    UUID uUID = m2.f();
                    arrayList.add(new f(uUID, "Unknown synced attribute modifier", m2.readDouble(), m2.readByte()));
                    if (!bl2) {
                        if (!bl2) continue;
                    }
                    break block3;
                }
                this.b.add(new aF(this, string, d10, arrayList));
                ++n3;
            }
            if (!bl2) continue;
        }
    }

    public List<aF> b() {
        return this.b;
    }

    public ao(int n2, Collection<b> collection) {
        this.b = Lists.newArrayList();
        this.a = n2;
        Iterator<b> iterator = collection.iterator();
        boolean bl2 = aD.c();
        while (iterator.hasNext()) {
            b b10 = iterator.next();
            this.b.add(new aF(this, b10.e().c(), b10.a(), b10.b()));
            if (!bl2) continue;
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public int a() {
        return this.a;
    }

    public ao() {
        this.b = Lists.newArrayList();
    }

    @Override
    public void a(a a10) {
        a10.a(this);
    }

    @Override
    public void b(m m2) throws IOException {
        m2.d(this.a);
        boolean bl2 = aD.i();
        m2.writeInt(this.b.size());
        boolean bl3 = bl2;
        block0: for (aF aF2 : this.b) {
            m2.a(aF2.c());
            m2.writeDouble(aF2.b());
            m2.d(aF2.a().size());
            for (f f10 : aF2.a()) {
                m2.a(f10.c());
                m2.writeDouble(f10.f());
                m2.writeByte(f10.e());
                if (!bl3) continue block0;
                if (bl3) continue;
            }
            if (bl3) continue;
        }
    }
}

