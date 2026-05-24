package eu.kanade.tachiyomi.extension.ar.mangapro;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: Dto.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 *2\u00020\u0001:\u0002)*BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fB_\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0010J%\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0001¢\u0006\u0002\b(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001c\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016¨\u0006+"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/Chapter;", "", "id", "", "number", "", "language", "title", "coins", "uploader", "createdAt", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()I", "getNumber$annotations", "()V", "getNumber", "()Ljava/lang/String;", "getLanguage", "getTitle", "getCoins$annotations", "getCoins", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUploader$annotations", "getUploader", "getCreatedAt$annotations", "getCreatedAt", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$mangapro", "$serializer", "Companion", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
public final class Chapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Integer coins;
    private final String createdAt;
    private final int id;
    private final String language;
    private final String number;
    private final String title;
    private final String uploader;

    @SerialName("coins_required")
    public static /* synthetic */ void getCoins$annotations() {
    }

    @SerialName("created_at")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @SerialName("chapter_number")
    public static /* synthetic */ void getNumber$annotations() {
    }

    @SerialName("uploader_nickname")
    public static /* synthetic */ void getUploader$annotations() {
    }

    /* JADX INFO: compiled from: Dto.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/Chapter$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Leu/kanade/tachiyomi/extension/ar/mangapro/Chapter;", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Chapter> serializer() {
            return Chapter$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Chapter(int i, int i2, String str, String str2, String str3, Integer num, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, Chapter$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i2;
        this.number = str;
        this.language = str2;
        if ((i & 8) == 0) {
            this.title = null;
        } else {
            this.title = str3;
        }
        if ((i & 16) == 0) {
            this.coins = null;
        } else {
            this.coins = num;
        }
        if ((i & 32) == 0) {
            this.uploader = null;
        } else {
            this.uploader = str4;
        }
        if ((i & 64) == 0) {
            this.createdAt = null;
        } else {
            this.createdAt = str5;
        }
    }

    public Chapter(int i, String str, String str2, String str3, Integer num, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "number");
        Intrinsics.checkNotNullParameter(str2, "language");
        this.id = i;
        this.number = str;
        this.language = str2;
        this.title = str3;
        this.coins = num;
        this.uploader = str4;
        this.createdAt = str5;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$mangapro(Chapter self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.number);
        output.encodeStringElement(serialDesc, 2, self.language);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.coins != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, IntSerializer.INSTANCE, self.coins);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.uploader != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.uploader);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.createdAt == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.createdAt);
    }

    public /* synthetic */ Chapter(int i, String str, String str2, String str3, Integer num, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5);
    }

    public final int getId() {
        return this.id;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getCoins() {
        return this.coins;
    }

    public final String getUploader() {
        return this.uploader;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }
}
