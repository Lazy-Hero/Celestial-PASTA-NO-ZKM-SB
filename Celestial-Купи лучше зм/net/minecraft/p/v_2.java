/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.P;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import net.minecraft.P.g;
import net.minecraft.P.i;

public class v
extends i {
    private /* synthetic */ long[] c;

    public v(List<Long> list) {
        this(v.a(list));
    }

    @Override
    public byte d() {
        return 12;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.c);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[L;");
        boolean bl2 = i.a();
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.c[i2]).append('L');
            if (bl2) continue;
        }
        return stringBuilder.append(']').toString();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static long[] a(List<Long> var0) {
        var2_1 = new long[var0.size()];
        var1_2 = i.f();
        for (var3_3 = 0; var3_3 < var0.size(); ++var3_3) {
            var4_4 = var0.get(var3_3);
            v0 = var2_1;
            if (var1_2 != false) return v0;
            v1 = var4_4;
            if (var1_2) ** GOTO lbl13
            if (v1 == null) {
                v2 = 0L;
            } else {
                v1 = var4_4;
lbl13:
                // 2 sources

                v2 = v1;
            }
            v0[var3_3] = v2;
            if (!var1_2) continue;
        }
        v0 = var2_1;
        return v0;
    }

    @Override
    void a(DataOutput dataOutput) throws IOException {
        boolean bl2 = i.f();
        dataOutput.writeInt(this.c.length);
        boolean bl3 = bl2;
        for (long l2 : this.c) {
            dataOutput.writeLong(l2);
            if (!bl3) continue;
        }
    }

    v() {
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        boolean bl2 = i.f();
        boolean bl3 = super.equals(object);
        if (!bl2) {
            if (!bl3) return false;
            bl3 = Arrays.equals(this.c, ((v)object).c);
        }
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    void a(DataInput dataInput, int n2, g g10) throws IOException {
        g10.a(192L);
        int n3 = dataInput.readInt();
        boolean bl2 = i.f();
        g10.a(64 * n3);
        this.c = new long[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            this.c[i2] = dataInput.readLong();
            if (!bl2) continue;
        }
    }

    public v(long[] arrl) {
        this.c = arrl;
    }

    public v a() {
        long[] arrl = new long[this.c.length];
        System.arraycopy(this.c, 0, arrl, 0, this.c.length);
        return new v(arrl);
    }
}

