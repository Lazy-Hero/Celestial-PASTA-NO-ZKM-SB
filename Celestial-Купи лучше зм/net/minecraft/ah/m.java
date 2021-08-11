/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.ah;

public class m {
    private static /* synthetic */ int[] a;

    static {
        a = new int[65536];
    }

    public static int c() {
        return 8431445;
    }

    public static int a(double d10, double d11) {
        int n2 = (int)((1.0 - d10) * 255.0);
        int n3 = (int)((1.0 - (d11 *= d10)) * 255.0);
        return a[n3 << 8 | n2];
    }

    public static int a() {
        return 0x619961;
    }

    public static int b() {
        return 4764952;
    }

    public static void a(int[] arrn) {
        a = arrn;
    }
}

