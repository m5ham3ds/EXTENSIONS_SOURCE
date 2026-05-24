package eu.kanade.tachiyomi.extension.ar.mangapro;

import eu.kanade.tachiyomi.extension.ar.mangapro.BrowseManga;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
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
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: Dto.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 .2\u00020\u0001:\u0003,-.B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0014J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0018¨\u0006/"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/BrowseManga;", "", "id", "", "title", "", "slug", "type", "progress", "metadata", "Leu/kanade/tachiyomi/extension/ar/mangapro/BrowseManga$MetaData;", "coverImage", "coverImageApp", "Leu/kanade/tachiyomi/extension/ar/mangapro/CoverImage;", "cdn", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leu/kanade/tachiyomi/extension/ar/mangapro/BrowseManga$MetaData;Ljava/lang/String;Leu/kanade/tachiyomi/extension/ar/mangapro/CoverImage;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leu/kanade/tachiyomi/extension/ar/mangapro/BrowseManga$MetaData;Ljava/lang/String;Leu/kanade/tachiyomi/extension/ar/mangapro/CoverImage;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()I", "getTitle", "()Ljava/lang/String;", "getSlug", "getType", "getProgress", "getMetadata", "()Leu/kanade/tachiyomi/extension/ar/mangapro/BrowseManga$MetaData;", "getCoverImage", "getCoverImageApp", "()Leu/kanade/tachiyomi/extension/ar/mangapro/CoverImage;", "getCdn$annotations", "()V", "getCdn", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$mangapro", "MetaData", "$serializer", "Companion", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
@Serializable
public final class BrowseManga {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String cdn;
    private final String coverImage;
    private final CoverImage coverImageApp;
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
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/BrowseManga$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Leu/kanade/tachiyomi/extension/ar/mangapro/BrowseManga;", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BrowseManga> serializer() {
            return BrowseManga$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BrowseManga(int i, int i2, String str, String str2, String str3, String str4, MetaData metaData, String str5, CoverImage coverImage, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (47 != (i & 47)) {
            PluginExceptionsKt.throwMissingFieldException(i, 47, BrowseManga$$serializer.INSTANCE.getDescriptor());
        }
        this.id = i2;
        this.title = str;
        this.slug = str2;
        this.type = str3;
        if ((i & 16) == 0) {
            this.progress = null;
        } else {
            this.progress = str4;
        }
        this.metadata = metaData;
        if ((i & 64) == 0) {
            this.coverImage = null;
        } else {
            this.coverImage = str5;
        }
        if ((i & 128) == 0) {
            this.coverImageApp = null;
        } else {
            this.coverImageApp = coverImage;
        }
        if ((i & 256) == 0) {
            this.cdn = null;
        } else {
            this.cdn = str6;
        }
    }

    public BrowseManga(int i, String str, String str2, String str3, String str4, MetaData metaData, String str5, CoverImage coverImage, String str6) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "slug");
        Intrinsics.checkNotNullParameter(str3, "type");
        Intrinsics.checkNotNullParameter(metaData, "metadata");
        this.id = i;
        this.title = str;
        this.slug = str2;
        this.type = str3;
        this.progress = str4;
        this.metadata = metaData;
        this.coverImage = str5;
        this.coverImageApp = coverImage;
        this.cdn = str6;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$mangapro(BrowseManga self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeIntElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.slug);
        output.encodeStringElement(serialDesc, 3, self.type);
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.progress != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.progress);
        }
        output.encodeSerializableElement(serialDesc, 5, BrowseManga$MetaData$$serializer.INSTANCE, self.metadata);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.coverImage != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.coverImage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.coverImageApp != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, CoverImage$$serializer.INSTANCE, self.coverImageApp);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.cdn == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.cdn);
    }

    public /* synthetic */ BrowseManga(int i, String str, String str2, String str3, String str4, MetaData metaData, String str5, CoverImage coverImage, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, str3, (i2 & 16) != 0 ? null : str4, metaData, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : coverImage, (i2 & 256) != 0 ? null : str6);
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

    public final String getProgress() {
        return this.progress;
    }

    public final MetaData getMetadata() {
        return this.metadata;
    }

    public final String getCoverImage() {
        return this.coverImage;
    }

    public final CoverImage getCoverImageApp() {
        return this.coverImageApp;
    }

    /* JADX INFO: compiled from: Dto.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ%\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\b\u0017R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001a"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/BrowseManga$MetaData;", "", "genres", "", "", "tags", "<init>", "(Ljava/util/Set;Ljava/util/Set;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/Set;Ljava/util/Set;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getGenres", "()Ljava/util/Set;", "getTags", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$mangapro", "$serializer", "Companion", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @Serializable
    public static final class MetaData {
        private final Set<String> genres;
        private final Set<String> tags;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.BrowseManga$MetaData$$ExternalSyntheticLambda0
            public final Object invoke() {
                return BrowseManga.MetaData._childSerializers$_anonymous_();
            }
        }), LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: eu.kanade.tachiyomi.extension.ar.mangapro.BrowseManga$MetaData$$ExternalSyntheticLambda1
            public final Object invoke() {
                return BrowseManga.MetaData._childSerializers$_anonymous_$0();
            }
        })};

        /* JADX WARN: Illegal instructions before constructor call */
        public MetaData() {
            Set set = null;
            this(set, set, 3, (DefaultConstructorMarker) set);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new LinkedHashSetSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new LinkedHashSetSerializer(StringSerializer.INSTANCE);
        }

        /* JADX INFO: compiled from: Dto.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Leu/kanade/tachiyomi/extension/ar/mangapro/BrowseManga$MetaData$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Leu/kanade/tachiyomi/extension/ar/mangapro/BrowseManga$MetaData;", "mangapro"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<MetaData> serializer() {
                return BrowseManga$MetaData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ MetaData(int i, Set set, Set set2, SerializationConstructorMarker serializationConstructorMarker) {
            this.genres = (i & 1) == 0 ? SetsKt.emptySet() : set;
            if ((i & 2) == 0) {
                this.tags = SetsKt.emptySet();
            } else {
                this.tags = set2;
            }
        }

        public MetaData(Set<String> set, Set<String> set2) {
            Intrinsics.checkNotNullParameter(set, "genres");
            Intrinsics.checkNotNullParameter(set2, "tags");
            this.genres = set;
            this.tags = set2;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$mangapro(MetaData self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.genres, SetsKt.emptySet())) {
                output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy) lazyArr[0].getValue(), self.genres);
            }
            if (!output.shouldEncodeElementDefault(serialDesc, 1) && Intrinsics.areEqual(self.tags, SetsKt.emptySet())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy) lazyArr[1].getValue(), self.tags);
        }

        public /* synthetic */ MetaData(Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? SetsKt.emptySet() : set, (i & 2) != 0 ? SetsKt.emptySet() : set2);
        }

        public final Set<String> getGenres() {
            return this.genres;
        }

        public final Set<String> getTags() {
            return this.tags;
        }
    }

    public final String getCdn() {
        return this.cdn;
    }
}
