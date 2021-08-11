/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public final class gD
extends Enum<gD> {
    public static final /* synthetic */ /* enum */ gD WARNING;
    public static final /* synthetic */ /* enum */ gD INFO;
    private static final /* synthetic */ gD[] b;
    private final /* synthetic */ int a;
    private static /* synthetic */ String c;
    public static final /* synthetic */ /* enum */ gD SUCCESS;
    public static final /* synthetic */ /* enum */ gD ERROR;

    public static String b() {
        return c;
    }

    public static gD valueOf(String string) {
        return Enum.valueOf(gD.class, string);
    }

    public static void b(String string) {
        c = string;
    }

    public int c() {
        return this.a;
    }

    private gD(int n3) {
        this.a = n3;
    }

    public static gD[] values() {
        return (gD[])b.clone();
    }

    static {
        SUCCESS = new gD(new Color(100, 255, 100).getRGB());
        INFO = new gD(new Color(225, 225, 255).getRGB());
        gD.b("yh6P0b");
        ERROR = new gD(new Color(255, 100, 100).getRGB());
        WARNING = new gD(new Color(255, 211, 53).getRGB());
        b = new gD[]{SUCCESS, INFO, ERROR, WARNING};
    }
}

