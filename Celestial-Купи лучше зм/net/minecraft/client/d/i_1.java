/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.io.IOUtils
 */
package net.minecraft.client.D;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import net.minecraft.ar.v;
import net.minecraft.at.l;
import net.minecraft.client.D.J;
import net.minecraft.client.D.O;
import net.minecraft.client.D.a;
import net.minecraft.client.D.h;
import net.minecraft.client.D.w;
import net.minecraft.client.Q;
import net.minecraft.client.j.f;
import net.minecraft.client.j.p;
import net.minecraft.client.j.u;
import net.minecraft.client.v.m;
import org.apache.commons.io.IOUtils;

public class i {
    private /* synthetic */ v c;
    private /* synthetic */ m a;
    final /* synthetic */ w d;
    private final /* synthetic */ a b;

    public void a() throws IOException {
        this.a = (m)this.b.a(this.d.d, "pack");
        this.b();
    }

    i(w w2, a a10, J j2) {
        this(w2, a10);
    }

    public a e() {
        return this.b;
    }

    public void b() {
        block3: {
            a a10;
            block2: {
                boolean bl2 = h.c();
                a10 = this.b;
                if (!bl2) break block2;
                if (!(a10 instanceof Closeable)) break block3;
                a10 = this.b;
            }
            IOUtils.closeQuietly((Closeable)((Closeable)((Object)a10)));
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        boolean bl2 = h.c();
        Object object2 = this;
        if (bl2) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        boolean bl3 = object2 instanceof i;
        if (bl2) {
            if (!bl3) return false;
            bl3 = this.toString().equals(object.toString());
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    i(w w2, File file, J j2) {
        this(w2, file);
    }

    private i(w w2, a a10) {
        this.d = w2;
        this.b = a10;
    }

    public String d() {
        return this.b.b();
    }

    /*
     * Enabled aggressive block sorting
     */
    public String f() {
        String string;
        boolean bl2 = h.c();
        m m2 = this.a;
        if (bl2) {
            if (m2 == null) {
                string = (Object)((Object)l.RED) + "Invalid pack.mcmeta (or missing 'pack' section)";
                return string;
            }
            m2 = this.a;
        }
        string = m2.a().a();
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int c() {
        boolean bl2 = h.c();
        m m2 = this.a;
        if (bl2) {
            if (m2 == null) {
                return 0;
            }
            m2 = this.a;
        }
        int n2 = m2.b();
        return n2;
    }

    private i(w w2, File file) {
        this(w2, w.a(w2, file));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void a(u var1_1) {
        block10: {
            block9: {
                block8: {
                    var3_2 = null;
                    var2_3 = h.b();
                    v0 = this;
                    if (var2_3) ** GOTO lbl8
                    if (v0.c != null) break block8;
                    try {
                        v0 = this;
lbl8:
                        // 2 sources

                        var3_2 = v0.b.c();
                    }
                    catch (IOException var4_4) {
                        // empty catch block
                    }
                    v1 = var3_2;
                    if (var2_3) ** GOTO lbl17
                    if (v1 != null) break block8;
                    try {
                        v1 = p.a(Q.P().O().a(w.i()).c());
lbl17:
                        // 2 sources

                        var3_2 = v1;
                    }
                    catch (IOException var4_5) {
                        throw new Error("Couldn't bind resource pack icon", var4_5);
                    }
                }
                v2 = this;
                if (var2_3) break block9;
                if (v2.c != null) break block10;
                v2 = this;
            }
            v2.c = var1_1.a("texturepackicon", new f(var3_2));
        }
        var1_1.b(this.c);
    }

    public String toString() {
        boolean bl2 = h.c();
        Object[] arrobject = new Object[2];
        Object[] arrobject2 = arrobject;
        Object[] arrobject3 = arrobject;
        int n2 = 0;
        String string = this.b.b();
        if (bl2) {
            arrobject2[n2] = string;
            arrobject2 = arrobject3;
            arrobject3 = arrobject3;
            n2 = 1;
            string = this.b instanceof O ? "folder" : "zip";
        }
        arrobject2[n2] = string;
        return String.format("%s:%s", arrobject3);
    }
}

