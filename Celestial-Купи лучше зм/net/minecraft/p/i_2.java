/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.P;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.P.g;
import net.minecraft.P.k;
import net.minecraft.P.l;
import net.minecraft.P.m;
import net.minecraft.P.n;
import net.minecraft.P.o;
import net.minecraft.P.p;
import net.minecraft.P.q;
import net.minecraft.P.r;
import net.minecraft.P.s;
import net.minecraft.P.t;
import net.minecraft.P.u;
import net.minecraft.P.v;
import net.minecraft.P.w;

public abstract class i {
    private static /* synthetic */ boolean b;
    public static final /* synthetic */ String[] a;

    public boolean c() {
        return false;
    }

    public int hashCode() {
        return this.d();
    }

    abstract void a(DataInput var1, int var2, g var3) throws IOException;

    public static boolean f() {
        return b;
    }

    public boolean equals(Object object) {
        return object instanceof i && this.d() == ((i)object).d();
    }

    protected static i a(byte by2) {
        switch (by2) {
            case 0: {
                return new s();
            }
            case 1: {
                return new k();
            }
            case 2: {
                return new p();
            }
            case 3: {
                return new n();
            }
            case 4: {
                return new o();
            }
            case 5: {
                return new m();
            }
            case 6: {
                return new l();
            }
            case 7: {
                return new q();
            }
            case 8: {
                return new w();
            }
            case 9: {
                return new u();
            }
            case 10: {
                return new r();
            }
            case 11: {
                return new t();
            }
            case 12: {
                return new v();
            }
        }
        return null;
    }

    public static String a(int n2) {
        switch (n2) {
            case 0: {
                return "TAG_End";
            }
            case 1: {
                return "TAG_Byte";
            }
            case 2: {
                return "TAG_Short";
            }
            case 3: {
                return "TAG_Int";
            }
            case 4: {
                return "TAG_Long";
            }
            case 5: {
                return "TAG_Float";
            }
            case 6: {
                return "TAG_Double";
            }
            case 7: {
                return "TAG_Byte_Array";
            }
            case 8: {
                return "TAG_String";
            }
            case 9: {
                return "TAG_List";
            }
            case 10: {
                return "TAG_Compound";
            }
            case 11: {
                return "TAG_Int_Array";
            }
            case 12: {
                return "TAG_Long_Array";
            }
            case 99: {
                return "Any Numeric Tag";
            }
        }
        return "UNKNOWN";
    }

    static {
        a = new String[]{"END", "BYTE", "SHORT", "INT", "LONG", "FLOAT", "DOUBLE", "BYTE[]", "STRING", "LIST", "COMPOUND", "INT[]", "LONG[]"};
        i.b(false);
    }

    protected String b() {
        return this.toString();
    }

    private static gP a(gP gP2) {
        return gP2;
    }

    public static void b(boolean bl2) {
        b = bl2;
    }

    public static boolean a() {
        boolean bl2 = i.f();
        return !bl2;
    }

    abstract void a(DataOutput var1) throws IOException;

    public abstract byte d();

    public abstract i e();

    public abstract String toString();
}

