/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.D;

import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import net.minecraft.client.D.a;
import net.minecraft.client.D.h;
import net.minecraft.client.D.r;
import net.minecraft.client.D.s;
import net.minecraft.client.D.t;
import net.minecraft.client.D.v;
import net.minecraft.client.v.o;
import net.minecraft.k.m;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class k
implements t {
    private static final /* synthetic */ Logger a;
    protected final /* synthetic */ List<a> c;
    private final /* synthetic */ o b;

    public void a(a a10) {
        this.c.add(a10);
    }

    static {
        a = LogManager.getLogger();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public v a(net.minecraft.ar.v v2) throws IOException {
        this.a(v2);
        a a10 = null;
        net.minecraft.ar.v v3 = k.b(v2);
        boolean bl2 = h.c();
        for (int i2 = this.c.size() - 1; i2 >= 0; --i2) {
            boolean bl3;
            a a11;
            block9: {
                a a12;
                block7: {
                    block8: {
                        a11 = this.c.get(i2);
                        a12 = a10;
                        if (!bl2) break block7;
                        if (a12 != null) break block8;
                        bl3 = a11.b(v3);
                        if (!bl2) break block9;
                        if (bl3) {
                            a10 = a11;
                        }
                    }
                    a12 = a11;
                }
                bl3 = a12.b(v2);
            }
            if (!bl3) continue;
            InputStream inputStream = null;
            if (a10 != null) {
                inputStream = this.a(v3, a10);
            }
            r r2 = new r(a11.b(), v2, this.a(v2, a11), inputStream, this.b);
            if (!m.d()) {
                h.b(!bl2);
            }
            return r2;
        }
        throw new FileNotFoundException(v2.toString());
    }

    protected InputStream a(net.minecraft.ar.v v2, a a10) throws IOException {
        InputStream inputStream = a10.a(v2);
        return a.isDebugEnabled() ? new s(inputStream, v2, a10.b()) : inputStream;
    }

    static Logger a() {
        return a;
    }

    @Override
    public Set<String> a() {
        return Collections.emptySet();
    }

    static net.minecraft.ar.v b(net.minecraft.ar.v v2) {
        return new net.minecraft.ar.v(v2.c(), v2.a() + ".mcmeta");
    }

    @Override
    public List<v> b(net.minecraft.ar.v v2) throws IOException {
        ArrayList arrayList;
        block11: {
            boolean bl2;
            ArrayList arrayList2;
            block8: {
                this.a(v2);
                arrayList2 = Lists.newArrayList();
                boolean bl3 = h.b();
                net.minecraft.ar.v v3 = k.b(v2);
                for (a a10 : this.c) {
                    block10: {
                        boolean bl4;
                        block9: {
                            bl2 = a10.b(v2);
                            if (bl3) break block8;
                            if (bl3) break block9;
                            if (!bl2) break block10;
                            bl4 = a10.b(v3);
                        }
                        InputStream inputStream = bl4 ? this.a(v3, a10) : null;
                        arrayList2.add(new r(a10.b(), v2, this.a(v2, a10), inputStream, this.b));
                    }
                    if (!bl3) continue;
                }
                arrayList = arrayList2;
                if (bl3) break block11;
                bl2 = arrayList.isEmpty();
            }
            if (bl2) {
                throw new FileNotFoundException(v2.toString());
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public k(o o2) {
        this.c = Lists.newArrayList();
        this.b = o2;
    }

    private void a(net.minecraft.ar.v v2) throws IOException {
        if (v2.a().contains("..")) {
            throw new IOException("Invalid relative path to resource: " + v2);
        }
    }
}

