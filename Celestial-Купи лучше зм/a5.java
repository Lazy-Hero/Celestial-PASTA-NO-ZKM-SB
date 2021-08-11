/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public final class a5
extends Enum<a5> {
    public static final /* synthetic */ /* enum */ a5 World;
    private static final /* synthetic */ a5[] d;
    public static final /* synthetic */ /* enum */ a5 Combat;
    private static /* synthetic */ String b;
    private final /* synthetic */ int a;
    public static final /* synthetic */ /* enum */ a5 Movement;
    public static final /* synthetic */ /* enum */ a5 Hud;
    public /* synthetic */ String name;
    public static final /* synthetic */ /* enum */ a5 Visuals;
    public static final /* synthetic */ /* enum */ a5 Player;
    private final /* synthetic */ int c;

    public int b() {
        return this.a;
    }

    public static String c() {
        return b;
    }

    public int a() {
        return this.c;
    }

    static {
        Combat = new a5(new Color(220, 20, 60).getRGB(), new Color(137, 3, 42).getRGB(), "Combat");
        Movement = new a5(new Color(123, 104, 238).getRGB(), new Color(73, 63, 151).getRGB(), "Movement");
        Visuals = new a5(new Color(0, 206, 209).getRGB(), new Color(2, 121, 123).getRGB(), "Visuals");
        Player = new a5(new Color(244, 164, 96).getRGB(), new Color(132, 68, 9).getRGB(), "Player");
        a5.b("TviqT");
        World = new a5(new Color(60, 179, 113).getRGB(), new Color(28, 88, 57).getRGB(), "Misc");
        Hud = new a5(new Color(186, 85, 211).getRGB(), new Color(91, 41, 102).getRGB(), "Hud");
        d = new a5[]{Combat, Movement, Visuals, Player, World, Hud};
    }

    private a5(int n3, int n4, String string2) {
        this.a = n3;
        this.c = n4;
        this.name = string2;
    }

    public static void b(String string) {
        b = string;
    }

    public static a5 valueOf(String string) {
        return Enum.valueOf(a5.class, string);
    }

    public String d() {
        return this.name;
    }

    public static a5[] values() {
        return (a5[])d.clone();
    }
}

