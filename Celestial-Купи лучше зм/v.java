/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 */
import com.google.gson.annotations.SerializedName;
import net.minecraft.k.m;

public class v {
    @SerializedName(value="labymod.cape")
    private /* synthetic */ boolean g;
    @SerializedName(value="5zig.cape")
    private /* synthetic */ boolean f;
    @SerializedName(value="hypixel.rank")
    private /* synthetic */ String a;
    @SerializedName(value="hypixel.lvl")
    private /* synthetic */ int c;
    private static /* synthetic */ String b;
    @SerializedName(value="mineplex.rank")
    private /* synthetic */ String e;
    @SerializedName(value="mineplex.lvl")
    private /* synthetic */ int d;

    public String c() {
        return this.a;
    }

    public static String b() {
        return b;
    }

    static {
        if (v.b() != null) {
            v.b("Hq6YL");
        }
    }

    public int e() {
        return this.d;
    }

    public String toString() {
        String string = v.b();
        String string2 = String.format("AccountInfo[%s:%s:%s:%s:%s:%s]", this.c, this.a, this.d, this.e, this.g, this.f);
        if (string != null) {
            m.b(!m.d());
        }
        return string2;
    }

    public String h() {
        return this.e;
    }

    public int f() {
        return this.c;
    }

    public boolean d() {
        return this.f;
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public boolean g() {
        return this.g;
    }

    public static void b(String string) {
        b = string;
    }
}

