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

public class t
extends i {
    private /* synthetic */ int[] c;

    public int[] a() {
        return this.c;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static int[] a(List<Integer> var0) {
        var2_1 = new int[var0.size()];
        var1_3 = i.f();
        for (var3_2 = 0; var3_2 < var0.size(); ++var3_2) {
            var4_4 = var0.get(var3_2);
            v0 = var2_1;
            if (var1_3 != false) return v0;
            v1 = var4_4;
            if (var1_3) ** GOTO lbl13
            if (v1 == null) {
                v2 = 0;
            } else {
                v1 = var4_4;
lbl13:
                // 2 sources

                v2 = v1;
            }
            v0[var3_2] = v2;
            if (!var1_3) continue;
        }
        v0 = var2_1;
        return v0;
    }

    @Override
    void a(DataOutput dataOutput) throws IOException {
        boolean bl2 = i.f();
        dataOutput.writeInt(this.c.length);
        boolean bl3 = bl2;
        for (int n2 : this.c) {
            dataOutput.writeInt(n2);
            if (!bl3) continue;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ Arrays.hashCode(this.c);
    }

    public t(List<Integer> list) {
        this(t.a(list));
    }

    t() {
    }

    @Override
    void a(DataInput dataInput, int n2, g g10) throws IOException {
        g10.a(192L);
        int n3 = dataInput.readInt();
        boolean bl2 = i.a();
        g10.a(32 * n3);
        boolean bl3 = bl2;
        this.c = new int[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            this.c[i2] = dataInput.readInt();
            if (bl3) continue;
        }
    }

    public t b() {
        int[] arrn = new int[this.c.length];
        System.arraycopy(this.c, 0, arrn, 0, this.c.length);
        return new t(arrn);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[I;");
        boolean bl2 = i.a();
        for (int i2 = 0; i2 < this.c.length; ++i2) {
            if (i2 != 0) {
                stringBuilder.append(',');
            }
            stringBuilder.append(this.c[i2]);
            if (bl2) continue;
        }
        return stringBuilder.append(']').toString();
    }

    public t(int[] arrn) {
        this.c = arrn;
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
            bl3 = Arrays.equals(this.c, ((t)object).c);
        }
        if (!bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public byte d() {
        return 11;
    }

    private static gP b(gP gP2) {
        return gP2;
    }
}

