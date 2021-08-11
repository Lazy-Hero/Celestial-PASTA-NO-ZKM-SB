/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.y;

public enum a {
    FLOAT(4, "Float", 5126),
    UBYTE(1, "Unsigned Byte", 5121),
    BYTE(1, "Byte", 5120),
    USHORT(2, "Unsigned Short", 5123),
    SHORT(2, "Short", 5122),
    UINT(4, "Unsigned Int", 5125),
    INT(4, "Int", 5124);

    private final /* synthetic */ String c;
    private final /* synthetic */ int d;
    private final /* synthetic */ int a;

    public int a() {
        return this.d;
    }

    public String c() {
        return this.c;
    }

    public int b() {
        return this.a;
    }

    private a(int n3, String string2, int n4) {
        this.d = n3;
        this.c = string2;
        this.a = n4;
    }
}

