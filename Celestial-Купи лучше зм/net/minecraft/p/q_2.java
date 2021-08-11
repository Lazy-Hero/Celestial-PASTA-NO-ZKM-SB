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

public class q
extends i {
    private /* synthetic */ byte[] c;

    public q(List<Byte> list) {
        this(q.a(list));
    }

    @Override
    void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeInt(this.c.length);
        dataOutput.write(this.c);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static byte[] a(List<Byte> var0) {
        var2_1 = new byte[var0.size()];
        var1_3 = i.a();
        for (var3_2 = 0; var3_2 < var0.size(); ++var3_2) {
            var4_4 = var0.get(var3_2);
            v0 = var2_1;
            if (var1_3 == false) return v0;
            v1 = var4_4;
            if (!var1_3) ** GOTO lbl13
            if (v1 == null) {
                v2 = 0;
            } else {
                v1 = var4_4;
lbl13:
                // 2 sources

                v2 = v1;
            }
            v0[var3_2] = v2;
            if (var1_3) continue;
        }
        v0 = var2_1;
        return v0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        boolean bl2 = i.a();
        boolean bl3 = super.equals(object);
        if (bl2) {
            if (!bl3) return false;
            bl3 = Arrays.equals(this.c, ((q)object).c);
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    @Override
    void a(DataInput dataInput, int n2, g g10) throws IOException {
        g10.a(192L);
        int n3 = dataInput.readInt();
        g10.a(8 * n3);
        this.c = new byte[n3];
        dataInput.readFully(this.c);
    }

    @Override
    public byte d() {
        return 7;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.c);
    }

    @Override
    public i e() {
        byte[] arrby = new byte[this.c.length];
        System.arraycopy(this.c, 0, arrby, 0, this.c.length);
        return new q(arrby);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[B;");
        boolean bl2 = i.f();
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.c[i2]).append('B');
            if (!bl2) continue;
        }
        return stringBuilder.append(']').toString();
    }

    q() {
    }

    public q(byte[] arrby) {
        this.c = arrby;
    }

    public byte[] a() {
        return this.c;
    }
}

