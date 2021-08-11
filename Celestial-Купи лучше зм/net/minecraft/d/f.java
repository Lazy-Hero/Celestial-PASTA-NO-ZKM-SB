/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.commons.lang3.StringUtils
 */
package net.minecraft.d;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.C.K;
import net.minecraft.C.m;
import net.minecraft.d.z;
import net.minecraft.k.n;
import net.minecraft.n.b;
import org.apache.commons.lang3.StringUtils;

public class f
implements K<b> {
    @Nullable
    private /* synthetic */ n b;
    private /* synthetic */ String a;
    private /* synthetic */ boolean c;

    public String a() {
        return this.a;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public f() {
    }

    @Override
    public void a(m m2) throws IOException {
        block0: {
            this.a = m2.c(32767);
            this.c = m2.readBoolean();
            boolean bl2 = m2.readBoolean();
            if (!bl2) break block0;
            this.b = m2.l();
        }
    }

    @Override
    public void b(m m2) throws IOException {
        m2.a(StringUtils.substring((String)this.a, (int)0, (int)32767));
        int[] arrn = z.b();
        m2.writeBoolean(this.c);
        int[] arrn2 = arrn;
        boolean bl2 = this.b != null;
        m m3 = m2;
        if (arrn2 != null) {
            m3.writeBoolean(bl2);
            if (bl2) {
                m3 = m2.a(this.b);
            }
        }
    }

    public f(String string, @Nullable n n2, boolean bl2) {
        this.a = string;
        this.b = n2;
        this.c = bl2;
    }

    public boolean b() {
        return this.c;
    }

    @Override
    public void a(b b10) {
        b10.a(this);
    }

    @Nullable
    public n c() {
        return this.b;
    }
}

