package eu.kanade.tachiyomi.extension.ar.mangapro;

import eu.kanade.tachiyomi.extension.ar.mangapro.Series;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: Dto.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0003\u0015\u0016\u0017B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ%\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/Series;", "", "series", "Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga;", "<init>", "(Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILeu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSeries", "()Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$mangapro", "Manga", "$serializer", "Companion", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
public final class Series {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Manga series;

    /* JADX INFO: compiled from: Dto.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Leu/kanade/tachiyomi/extension/ar/mangapro/Series;", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<Series> serializer() {
            return Series$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Series(int i, Manga manga, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i, 1, Series$$serializer.INSTANCE.getDescriptor());
        }
        this.series = manga;
    }

    public Series(Manga manga) {
        Intrinsics.checkNotNullParameter(manga, "series");
        this.series = manga;
    }

    /* JADX INFO: compiled from: Dto.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\u00020\u0001:\u0003,-.B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0014J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006/"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga;", "", "id", "", "title", "", "slug", "type", "description", "progress", "metadata", "Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga$MetaData;", "cdn", "coverImageApp", "Leu/kanade/tachiyomi/extension/ar/mangapro/CoverImage;", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga$MetaData;Ljava/lang/String;Leu/kanade/tachiyomi/extension/ar/mangapro/CoverImage;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga$MetaData;Ljava/lang/String;Leu/kanade/tachiyomi/extension/ar/mangapro/CoverImage;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()I", "getTitle", "()Ljava/lang/String;", "getSlug", "getType", "getDescription", "getProgress", "getMetadata", "()Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga$MetaData;", "getCdn$annotations", "()V", "getCdn", "getCoverImageApp", "()Leu/kanade/tachiyomi/extension/ar/mangapro/CoverImage;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$mangapro", "MetaData", "$serializer", "Companion", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public static final class Manga {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String cdn;
        private final CoverImage coverImageApp;
        private final String description;
        private final int id;
        private final MetaData metadata;
        private final String progress;
        private final String slug;
        private final String title;
        private final String type;

        @SerialName("cdn_path")
        public static /* synthetic */ void getCdn$annotations() {
        }

        /* JADX INFO: compiled from: Dto.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga;", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<Manga> serializer() {
                return Series$Manga$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Manga(int i, int i2, String str, String str2, String str3, String str4, String str5, MetaData metaData, String str6, CoverImage coverImage, SerializationConstructorMarker serializationConstructorMarker) {
            if (79 != (i & 79)) {
                PluginExceptionsKt.throwMissingFieldException(i, 79, Series$Manga$$serializer.INSTANCE.getDescriptor());
            }
            this.id = i2;
            this.title = str;
            this.slug = str2;
            this.type = str3;
            if ((i & 16) == 0) {
                this.description = null;
            } else {
                this.description = str4;
            }
            if ((i & 32) == 0) {
                this.progress = null;
            } else {
                this.progress = str5;
            }
            this.metadata = metaData;
            if ((i & 128) == 0) {
                this.cdn = null;
            } else {
                this.cdn = str6;
            }
            if ((i & 256) == 0) {
                this.coverImageApp = null;
            } else {
                this.coverImageApp = coverImage;
            }
        }

        public Manga(int i, String str, String str2, String str3, String str4, String str5, MetaData metaData, String str6, CoverImage coverImage) {
            Intrinsics.checkNotNullParameter(str, "title");
            Intrinsics.checkNotNullParameter(str2, "slug");
            Intrinsics.checkNotNullParameter(str3, "type");
            Intrinsics.checkNotNullParameter(metaData, "metadata");
            this.id = i;
            this.title = str;
            this.slug = str2;
            this.type = str3;
            this.description = str4;
            this.progress = str5;
            this.metadata = metaData;
            this.cdn = str6;
            this.coverImageApp = coverImage;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$mangapro(Manga self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeIntElement(serialDesc, 0, self.id);
            output.encodeStringElement(serialDesc, 1, self.title);
            output.encodeStringElement(serialDesc, 2, self.slug);
            output.encodeStringElement(serialDesc, 3, self.type);
            if (output.shouldEncodeElementDefault(serialDesc, 4) || self.description != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.description);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.progress != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.progress);
            }
            output.encodeSerializableElement(serialDesc, 6, Series$Manga$MetaData$$serializer.INSTANCE, self.metadata);
            if (output.shouldEncodeElementDefault(serialDesc, 7) || self.cdn != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.cdn);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.coverImageApp == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 8, CoverImage$$serializer.INSTANCE, self.coverImageApp);
        }

        public /* synthetic */ Manga(int i, String str, String str2, String str3, String str4, String str5, MetaData metaData, String str6, CoverImage coverImage, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, str2, str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5, metaData, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? null : coverImage);
        }

        public final int getId() {
            return this.id;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSlug() {
            return this.slug;
        }

        public final String getType() {
            return this.type;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getProgress() {
            return this.progress;
        }

        public final MetaData getMetadata() {
            return this.metadata;
        }

        public final String getCdn() {
            return this.cdn;
        }

        /* JADX INFO: compiled from: Dto.kt */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002*+B\u0087\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eB\u0093\u0001\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u0006,"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga$MetaData;", "", "originalTitle", "", "altTitles", "", "author", "artist", "year", "genres", "tags", "origin", "coverImage", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getOriginalTitle", "()Ljava/lang/String;", "getAltTitles", "()Ljava/util/List;", "getAuthor$annotations", "()V", "getAuthor", "getArtist$annotations", "getArtist", "getYear", "getGenres", "getTags", "getOrigin", "getCoverImage", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$mangapro", "$serializer", "Companion", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @Serializable
        public static final class MetaData {
            private final List<String> altTitles;
            private final List<String> artist;
            private final List<String> author;
            private final String coverImage;
            private final List<String> genres;
            private final String origin;
            private final String originalTitle;
            private final List<String> tags;
            private final String year;

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.Series$Manga$MetaData$$ExternalSyntheticLambda0
                public final Object invoke() {
                    return Series.Manga.MetaData._childSerializers$_anonymous_();
                }
            }), null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.Series$Manga$MetaData$$ExternalSyntheticLambda1
                public final Object invoke() {
                    return Series.Manga.MetaData._childSerializers$_anonymous_$0();
                }
            }), LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.Series$Manga$MetaData$$ExternalSyntheticLambda2
                public final Object invoke() {
                    return Series.Manga.MetaData._childSerializers$_anonymous_$1();
                }
            }), null, null};

            public MetaData() {
                this((String) null, (List) null, (List) null, (List) null, (String) null, (List) null, (List) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(StringSerializer.INSTANCE);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
                return new ArrayListSerializer(StringSerializer.INSTANCE);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$1() {
                return new ArrayListSerializer(StringSerializer.INSTANCE);
            }

            @Serializable(with = StringListSerializer.class)
            public static /* synthetic */ void getArtist$annotations() {
            }

            @Serializable(with = StringListSerializer.class)
            public static /* synthetic */ void getAuthor$annotations() {
            }

            /* JADX INFO: compiled from: Dto.kt */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga$MetaData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Leu/kanade/tachiyomi/extension/ar/mangapro/Series$Manga$MetaData;", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final KSerializer<MetaData> serializer() {
                    return Series$Manga$MetaData$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ MetaData(int i, String str, List list, List list2, List list3, String str2, List list4, List list5, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.originalTitle = null;
                } else {
                    this.originalTitle = str;
                }
                if ((i & 2) == 0) {
                    this.altTitles = CollectionsKt.emptyList();
                } else {
                    this.altTitles = list;
                }
                if ((i & 4) == 0) {
                    this.author = CollectionsKt.emptyList();
                } else {
                    this.author = list2;
                }
                if ((i & 8) == 0) {
                    this.artist = CollectionsKt.emptyList();
                } else {
                    this.artist = list3;
                }
                if ((i & 16) == 0) {
                    this.year = null;
                } else {
                    this.year = str2;
                }
                if ((i & 32) == 0) {
                    this.genres = CollectionsKt.emptyList();
                } else {
                    this.genres = list4;
                }
                if ((i & 64) == 0) {
                    this.tags = CollectionsKt.emptyList();
                } else {
                    this.tags = list5;
                }
                if ((i & 128) == 0) {
                    this.origin = null;
                } else {
                    this.origin = str3;
                }
                if ((i & 256) == 0) {
                    this.coverImage = null;
                } else {
                    this.coverImage = str4;
                }
            }

            public MetaData(String str, List<String> list, List<String> list2, List<String> list3, String str2, List<String> list4, List<String> list5, String str3, String str4) {
                Intrinsics.checkNotNullParameter(list, "altTitles");
                Intrinsics.checkNotNullParameter(list2, "author");
                Intrinsics.checkNotNullParameter(list3, "artist");
                Intrinsics.checkNotNullParameter(list4, "genres");
                Intrinsics.checkNotNullParameter(list5, "tags");
                this.originalTitle = str;
                this.altTitles = list;
                this.author = list2;
                this.artist = list3;
                this.year = str2;
                this.genres = list4;
                this.tags = list5;
                this.origin = str3;
                this.coverImage = str4;
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$mangapro(MetaData self, CompositeEncoder output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                if (output.shouldEncodeElementDefault(serialDesc, 0) || self.originalTitle != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.originalTitle);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual(self.altTitles, CollectionsKt.emptyList())) {
                    output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy) lazyArr[1].getValue(), self.altTitles);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual(self.author, CollectionsKt.emptyList())) {
                    output.encodeSerializableElement(serialDesc, 2, StringListSerializer.INSTANCE, self.author);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.artist, CollectionsKt.emptyList())) {
                    output.encodeSerializableElement(serialDesc, 3, StringListSerializer.INSTANCE, self.artist);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 4) || self.year != null) {
                    output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.year);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 5) || !Intrinsics.areEqual(self.genres, CollectionsKt.emptyList())) {
                    output.encodeSerializableElement(serialDesc, 5, (SerializationStrategy) lazyArr[5].getValue(), self.genres);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.areEqual(self.tags, CollectionsKt.emptyList())) {
                    output.encodeSerializableElement(serialDesc, 6, (SerializationStrategy) lazyArr[6].getValue(), self.tags);
                }
                if (output.shouldEncodeElementDefault(serialDesc, 7) || self.origin != null) {
                    output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.origin);
                }
                if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.coverImage == null) {
                    return;
                }
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.coverImage);
            }

            public final String getOriginalTitle() {
                return this.originalTitle;
            }

            public /* synthetic */ MetaData(String str, List list, List list2, List list3, String str2, List list4, List list5, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt.emptyList() : list2, (i & 8) != 0 ? CollectionsKt.emptyList() : list3, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? CollectionsKt.emptyList() : list4, (i & 64) != 0 ? CollectionsKt.emptyList() : list5, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4);
            }

            public final List<String> getAltTitles() {
                return this.altTitles;
            }

            public final List<String> getAuthor() {
                return this.author;
            }

            public final List<String> getArtist() {
                return this.artist;
            }

            public final String getYear() {
                return this.year;
            }

            public final List<String> getGenres() {
                return this.genres;
            }

            public final List<String> getTags() {
                return this.tags;
            }

            public final String getOrigin() {
                return this.origin;
            }

            public final String getCoverImage() {
                return this.coverImage;
            }
        }

        public final CoverImage getCoverImageApp() {
            return this.coverImageApp;
        }
    }

    public final Manga getSeries() {
        return this.series;
    }
}
