/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.P;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.Objects;
import net.minecraft.P.g;
import net.minecraft.P.i;

public class w
extends i {
    private /* synthetic */ String c;

    @Override
    public byte d() {
        return 8;
    }

    @Override
    void a(DataInput dataInput, int n2, g g10) throws IOException {
        g10.a(288L);
        this.c = dataInput.readUTF();
        g10.a(16 * this.c.length());
    }

    @Override
    public String toString() {
        return w.a(this.c);
    }

    private static gP b(gP gP2) {
        return gP2;
    }

    public static String a(String string) {
        String string2;
        block3: {
            StringBuilder stringBuilder = new StringBuilder("\"");
            boolean bl2 = i.a();
            for (int i2 = 0; i2 < string.length(); ++i2) {
                char c10;
                block6: {
                    block5: {
                        int n2;
                        char c11;
                        block4: {
                            string2 = string;
                            if (!bl2) break block3;
                            c11 = c10 = string2.charAt(i2);
                            n2 = '\\';
                            if (!bl2) break block4;
                            if (c11 == n2) break block5;
                            c11 = c10;
                            n2 = 34;
                        }
                        if (c11 != n2) break block6;
                    }
                    stringBuilder.append('\\');
                }
                stringBuilder.append(c10);
                if (bl2) continue;
            }
            string2 = stringBuilder.append('\"').toString();
        }
        return string2;
    }

    @Override
    public int hashCode() {
        return super.hashCode() ^ this.c.hashCode();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        String string;
        w w2;
        boolean bl2;
        block5: {
            block6: {
                bl2 = i.f();
                w w3 = this;
                if (!bl2) {
                    if (!super.equals(object)) {
                        return false;
                    }
                    w3 = (w)object;
                }
                w2 = w3;
                string = this.c;
                if (bl2) break block5;
                if (string != null) break block6;
                string = w2.c;
                if (bl2) break block5;
                if (string == null) return true;
            }
            string = this.c;
        }
        boolean bl3 = Objects.equals(string, w2.c);
        if (bl2) return bl3;
        if (!bl3) return false;
        return true;
    }

    @Override
    public String b() {
        return this.c;
    }

    public w() {
        this("");
    }

    @Override
    void a(DataOutput dataOutput) throws IOException {
        dataOutput.writeUTF(this.c);
    }

    public w a() {
        return new w(this.c);
    }

    public w(String string) {
        Objects.requireNonNull(string, "Null string not allowed");
        this.c = string;
    }

    @Override
    public boolean c() {
        return this.c.isEmpty();
    }
}

